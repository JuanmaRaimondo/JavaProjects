package com.example;

public class App {
    public static void main(String[] args) {

        System.out.println("--- Iniciando Aplicación ---");

        // 1. Contratamos al Mozo (Instanciamos el Controller)
        AlumnosController control = new AlumnosController();

        // 2. Preparamos el pedido (Creamos el objeto con datos)
        Alumnos nuevoAlumno = new Alumnos("Maria", "Gomez", "2024");

        // 3. El Mozo se lleva el pedido (Llamamos al método del controller)
        control.crearAlumno(nuevoAlumno);

        // Cerramos el chiringuito
        control.cerrar();
    }
}