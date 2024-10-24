import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConversor {
    public static Object datosApi() {

        //variable para uso del gson
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c6f9bede6ff0148acda96c49/latest/USD");
        // Cliente Http
        HttpClient client = HttpClient.newHttpClient();
        //Peticion Http
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();

        HttpResponse<String> response = null;

        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException("Error, no encontre datos.");
        }
        //Se convierte a String la información obtenida por la variable "response".
        String json = response.body();

        //Se convierte el String anterior a un objeto Json.
//        Moneda tomarDatos = gson.fromJson(json, Moneda.class);

        return new Gson().fromJson(response.body(), Moneda.class);
    }
}
