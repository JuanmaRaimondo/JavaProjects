package JavaProjects.Mapas;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    
    public static void main(String[] args) {
        Map<Integer, String> mapaEmpleados = new HashMap<>();

        mapaEmpleados.put(1, "Juan");
        mapaEmpleados.put(2, "Jose");
        mapaEmpleados.put(3, "Pedro");
        mapaEmpleados.put(4, "Tomas");

       boolean contiene = mapaEmpleados.containsKey(1);
       boolean estaono = mapaEmpleados.containsValue("Juan");

      System.out.println(mapaEmpleados.values()); 

       if(contiene == true){
        System.out.println("Si esta la llave");
       }

       if(estaono == true){
        System.out.println("Si esta el loco");
       }
    }

}
