package org.example.ui;

import org.example.model.Empleado;
import org.example.service.Directorio;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Menu {

    public void menu() {
        Scanner scan = new Scanner(System.in);
        List<Empleado> empleados = new ArrayList<>();
        Directorio directorio = new Directorio(empleados);

        Properties props = new Properties();

        try (InputStream input = Menu.class.getClassLoader()
                .getResourceAsStream("version.properties")) {
            if (input == null) {
                System.out.println("No se encontró el archivo version.properties");
                return;
            }
            props.load(input);
            String version = props.getProperty("version", "desconocida");
            System.out.println("*********Directorio Corporativo " + "(V<"+ version + ">)*********");

            System.out.println(" 1. Imprimir directorio ");
            System.out.println(" 2. Buscar usuario ");
            System.out.println(" 3. Guardar directorio");
            System.out.println(" 4. Leer directorio ");
            System.out.println(" 5. Salir");
            System.out.println(" Escoge una opción: ");
            String opcion = scan.nextLine();

            switch (opcion) {
                case "1":
                    directorio.imprimir();
                    break;
                case "2":
                    System.out.println("Nombre de Empleado: ");
                    String nombreEmpleado = scan.nextLine();
                    directorio.buscarPorNombre(nombreEmpleado);
                    break;
                case "3":
                   // directorio.guardarJSON();
                    break;
                case "4":

                    break;
                default:
                    System.out.println("Saliendo...");
                    break;
            }

        } catch (IOException e) {
            System.err.println("Error leyendo la versión: " + e.getMessage());
        }

    }
}
