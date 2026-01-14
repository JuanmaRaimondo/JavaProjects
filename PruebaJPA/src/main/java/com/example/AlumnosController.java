package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AlumnosController {

    // 1. Tenemos la fábrica de conexiones lista en el Controller
    private EntityManagerFactory emf;

    public AlumnosController() {
        // Al crear el controlador, preparamos la conexión
        this.emf = Persistence.createEntityManagerFactory("miUnidadJPA");
    }

    // 2. Método para GUARDAR (Create)
    // El Controller recibe el objeto, no los datos sueltos. Es más limpio.
    public void crearAlumno(Alumnos alumno) {
        EntityManager em = null;
        
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            
            // Aquí ocurre la magia
            em.persist(alumno);
            
            em.getTransaction().commit();
            System.out.println("✅ Controller: Alumno guardado correctamente.");
            
        } catch (Exception e) {
            System.out.println("❌ Error al guardar: " + e.getMessage());
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para cerrar la fábrica cuando cerremos la app
    public void cerrar() {
        emf.close();
    }
}