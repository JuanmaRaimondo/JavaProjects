package JavaProjects.practicaDos;

import java.util.HashMap;
import java.util.Scanner;

//Siempre la primera clase Lleva el nombre del archivo donde esta guardado. 
public class helloworld {
//Siempre se inicia con el main asi como está escrito
    public static void main(String[] args) {
        System.out.println("Hello World");

        int age = 28;
        
        System.out.println("I have " + age + " years old.");
        // Nota: Scanner implementa Closeable. El IDE/linter advierte si no
        // se cierra porque puede producir fugas de recursos. Cerrar un
        // Scanner que envuelve System.in también cierra System.in, por eso
        // en programas interactivos a veces se opta por no cerrarlo aquí.
   /*     Scanner scanner = new Scanner(System.in);
        System.out.println("Ahora vamos a practicar usando el Scanner: Ingresemos Hello World");
        String prueba = scanner.nextLine();
        System.out.println(prueba);
        scanner.close();
El scanner system.in y system.out funcionan como los streams en C que tener que abrirlos y cerrarlos 
*/
HashMap<String, Integer> examScores = new HashMap<String, Integer>();

examScores.put("Math", 7);
examScores.put("Algoritmos", 7);
examScores.put("Humanistica",9 );

System.out.println(examScores.toString());
System.out.println(examScores.get("Math"));

    }
}
