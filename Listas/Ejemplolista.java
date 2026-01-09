package JavaProjects.Listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//ArrayList && LinkedList(Solo se busca con el foreach)
public class Ejemplolista {

    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<Persona> ();
        List<Persona> enlazada = new LinkedList<Persona>();
        lista.add(new Persona(1,"Juan" , "Perez"));
        lista.add(new Persona(2,"Sergio" , "Gomez"));
        lista.add(new Persona(3,"Jose" , "Manuel"));

        enlazada.add(new Persona(1,"Juan" , "Perez"));
        enlazada.add(new Persona(2,"Sergio" , "Gomez"));
        enlazada.add(0, new Persona(3,"Jose" , "Manuel"));

        for(int i = 0; i < lista.size(); i ++){
            System.out.println("El nombre es: " + lista.get(i).getNombre());
        }

        

        for(Persona person:enlazada){
            System.out.println("Los nombres en la LinkedList son: " + person.getNombre() );
        }

        //Para borrar en arrayList

        lista.remove(1);

        for(Persona perso:lista){
            System.out.println("El nombre es: " + perso.getNombre() );
        }

        //PAra borrar en LinkedList
        String aborrar = "Juan";
        for(Persona person:enlazada){
            if(person.getNombre().equals(aborrar)){
                enlazada.remove(person);
                break;
            }
        }

    }

}
