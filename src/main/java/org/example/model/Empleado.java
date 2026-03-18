package org.example.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Empleado {

        private String nombre;
        private String apellido;
        private LocalDate fecha;
        private ArrayList<String> telefonos_contacto;
        private Empleado supervisor;

        public Empleado(String nombre,String apellido,LocalDate fecha,Empleado supervisor){
            telefonos_contacto=new ArrayList<>();
            this.nombre=nombre;
            this.apellido=apellido;
            this.fecha=fecha;
            this.supervisor=supervisor;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<String> getTelefonos_contacto() {
        return telefonos_contacto;
    }

    public void setTelefonos_contacto(ArrayList<String> telefonos_contacto) {
        this.telefonos_contacto = telefonos_contacto;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }
}
