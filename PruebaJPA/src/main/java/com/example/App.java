package com.example;

public class App {
    public static void main(String[] args) {

        System.out.println("--- Iniciando Aplicación ---");

        // 1. Contratamos al Mozo (Instanciamos el Controller)
        AlumnosController control = new AlumnosController();

        
        Alumnos nuevoAlumno = new Alumnos("Maria", "Gomez", "2024");

        
        control.crearAlumno(nuevoAlumno);

       
        control.cerrar();
    }
}