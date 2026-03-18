package org.example.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.model.Empleado;

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
        Gson gson = new Gson();
        try(FileWriter writer = new FileWriter(ruta)){
            gson.toJson(empleados, writer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void cargarJSON(String ruta){
        Gson gson = new Gson();
        try(FileReader reader = new FileReader(ruta)){
            empleados = gson.fromJson(reader, new TypeToken<List<Empleado>>() {}.getType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
