package com.Controladores;

import com.google.gson.*;
import okhttp3.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class ObtenerValorMoneda {
    public double[] valorMooneda (String monedaBase) {
    	double valorMoneda[] = new double[5];
        OkHttpClient client = new OkHttpClient();

        String baseCurrency = monedaBase;

        String url = "https://v6.exchangerate-api.com/v6/a862003f3fb81e314f7d51b1/latest/" + baseCurrency;

        Request request = new Request.Builder()
                .url(url)
                .build();

        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                String responseBody = response.body().string();

                JsonParser parser = new JsonParser();
                JsonObject jsonObject = parser.parse(responseBody).getAsJsonObject();

                JsonObject ratesObject = jsonObject.getAsJsonObject("conversion_rates");

                Map<String, Double> valoresMoneda = new HashMap<>();

                for (Map.Entry<String, JsonElement> entry : ratesObject.entrySet()) {
                    String currency = entry.getKey();
                    BigDecimal rate = entry.getValue().getAsBigDecimal();
                    valoresMoneda.put(currency, rate.doubleValue());
                }
 
                valorMoneda[0] = valoresMoneda.get("USD");
                valorMoneda[1] = valoresMoneda.get("EUR");
                valorMoneda[2] = valoresMoneda.get("GBP");
                valorMoneda[3] = valoresMoneda.get("JPY");
                valorMoneda[4] = valoresMoneda.get("KRW");
                return valorMoneda;
                
            } else {
                System.out.println("Error en la solicitud: " + response.code());
                valorMoneda[0]=-1;
                return valorMoneda;
            }
        } catch (IOException e) {
            e.printStackTrace();
            valorMoneda[0]=-1;
            return valorMoneda;
        }
    }
}
