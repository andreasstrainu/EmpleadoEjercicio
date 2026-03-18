package org.example.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.service.Directorio;

public class JsonUtils {

    // Gson configurado para toda la clase
    private static final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .setDateFormat("yyyy-MM-dd")
            .create();

    // Convertir Directorio → JSON
    public static String directorioToJSON(Directorio d) {
        return gson.toJson(d);
    }

    // Convertir JSON → Directorio
    public static Directorio jsonToDirectorio(String json) {
        return gson.fromJson(json, Directorio.class);
    }
}