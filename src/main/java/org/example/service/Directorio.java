package org.example.service;

import org.example.model.Empleado;

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
        
    }
}
