package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {

    public static void main(String[] args) {
        
        // 1. Datos de conexión (Ajusta estos valores a los tuyos)
        String url = "jdbc:mysql://localhost:3307/mi_base_prueba"; // Cambia 'mi_base_prueba' por el nombre de tu BD
        String usuario = "root";      // Por defecto suele ser root
        String password = "mysql"; // Pon aquí tu contraseña de MySQL

        System.out.println("Intentando conectar a la base de datos...");

        // Cargar el driver de MySQL
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver de MySQL.");
            System.out.println("Mensaje de error: " + e.getMessage());
            return; // Salir del método main
        }

        // 2. Intentar establecer la conexión
        try (Connection conexion = DriverManager.getConnection(url, usuario, password)) {
            
            if (conexion != null) {
                System.out.println("¡Conexión exitosa! Ya estás conectado a MySQL.");
            }

        } catch (SQLException e) {
            // Esto se ejecuta si algo sale mal
            System.out.println("Error al conectar con la base de datos.");
            System.out.println("Mensaje de error: " + e.getMessage());
        }
    }
}