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

    public void eliminarAlumno(Alumnos alumno){
        EntityManager em = null;

        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

          Alumnos alumnoEncontrado = em.find(Alumnos.class, alumno.getId());
                if(alumnoEncontrado != null){
                    System.out.println("Se encontro el alumno. Ahora será eliminado ");
                    em.remove(alumnoEncontrado);
                    em.getTransaction().commit();
                    System.out.println("¡El alumno ha sido eliminado con exito!");
                }else{
                    System.out.println("No se encontró al alumno");
                }

        } catch (Exception e) {
            System.out.println("Error al buscar el alumno");
        }finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void editAlumno(Alumnos alumno){

        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();

            em.merge(alumno);
            em.getTransaction().commit();
            System.out.println("✅ Controller: Alumno guardado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al editar al alumno");
        }finally {
            if (em != null) {
                em.close();
            }
        }

    }

    public Alumnos verAlumnos(int id){
        EntityManager em = null;
        Alumnos alumnosEncontrados = null;
        try {
                em = emf.createEntityManager();
                alumnosEncontrados = em.find(Alumnos.class, id);

                System.out.println("El alumno con el id que ingresaste es: " + alumnosEncontrados.toString());
            } catch (Exception e) {
            System.out.println("Error al mostrar los alumnos");
        }finally{ 
            if(em != null){
                em.close();
            }
        }
            return alumnosEncontrados; 
    }


    // Método para cerrar la fábrica cuando cerremos la app
    public void cerrar() {
        emf.close();
    }
}