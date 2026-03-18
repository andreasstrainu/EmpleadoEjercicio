package org.example.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.model.Empleado;
import org.example.util.JsonUtils;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;


public class Directorio {
    List<Empleado> empleados;

    public Directorio(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public Empleado buscarPorNombre(String nombre) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public void imprimir() {
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }
    public void guardarJSON(String ruta){
        try (FileWriter writer = new FileWriter(ruta)) {
            String json = JsonUtils.directorioToJSON(this);
            writer.write(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void cargarJSON(String ruta){
        try (FileReader reader = new FileReader(ruta)) {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }

            Directorio d = JsonUtils.jsonToDirectorio(sb.toString());
            this.empleados = d.empleados;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
