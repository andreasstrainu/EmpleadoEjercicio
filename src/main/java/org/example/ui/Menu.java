package org.example.ui;

import org.example.service.Directorio;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class Menu {

    public void menu() {
        Scanner scan = new Scanner(System.in);

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
            System.out.println(" Escoge una opción: ");
            


        } catch (IOException e) {
            System.err.println("Error leyendo la versión: " + e.getMessage());
        }

    }

}
