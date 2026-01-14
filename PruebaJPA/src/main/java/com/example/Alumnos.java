// 1. PRIMERO: El paquete (Solo una vez)
package com.example;

// 2. SEGUNDO: Las importaciones
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// 3. TERCERO: La clase
@Entity 
public class Alumnos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String apellido;
    private String anioDeCursado;

    public Alumnos(){}

    public Alumnos(String nombre, String apellido, String anioDeCursado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioDeCursado = anioDeCursado;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getAnioDeCursado() { return anioDeCursado; }
    public void setAnioDeCursado(String anioDeCursado) { this.anioDeCursado = anioDeCursado; }
}