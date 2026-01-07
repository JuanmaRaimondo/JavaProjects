package JavaProjects.primerProyecto.ejercicios.funciones;

//import java.util.Scanner;

import JavaProjects.primerProyecto.Auto;
import JavaProjects.primerProyecto.Camiones;

public class ejerciciouno {
    public static void main(String[] args){

        //Hacer una calculadora
    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora");

        System.out.println("eliga la operacion a realizar: suma(1), resta(2), division(3) o multiplicacion(4)");
        
        int opcion = sc.nextInt(); 

        // 2. ¡Faltaba esto! Pedir los números para hacer el cálculo
        System.out.println("Ingrese el primer número:");
        int num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        int num2 = sc.nextInt();

        int resultado = 0;
        
       
        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2); // Llamamos a tu función sumar
                break;
                
        case 2:
               resultado = resta(num1, num2); 
                break;

        case 3:
                if (num2 != 0) {
                    resultado = division(num1, num2);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return; // Termina el programa aquí si hay error
                }
                break;

        case 4:
                
                resultado = multiplicacion(num1, num2); // Llamamos a tu función multiplicacion
                break;
        
            default:
                System.out.println("Opción no válida");
                return;

                
        }

        System.out.println("El resultado es: " + resultado);
    }

    public static int sumar(int valorUno, int valorDos){

       int suma = 0;
        suma = valorUno + valorDos;
        return suma;
    }

    public static int resta(int valorUno, int valorDos){
       int resta = 0;
        resta = valorUno - valorDos;
        return resta;

    }

    public static int multiplicacion(int valorUno, int valorDos){
      int  mult = 0;
      mult = valorUno * valorDos;
      return mult;

    }

    public static int division( int valorUno, int valorDos){
        int div = 0;
        div = valorUno / valorDos;
        
        return div;
        
    }*/
//Creo dos objetos auto, uno vacio y otro con todos los datos.
Auto sedan = new Auto(5, "Citroen", "C4 Cactus", 30.0f);
Auto pickup = new Auto();
//Asigno valores con los setter al auto vacio
pickup.setId(2);
pickup.setModelo("Ford");
pickup.setNombre("Ranger");
pickup.setPrecio(40.5f);

System.out.println("la marca del sedan es: " + sedan.getMarca() );
System.out.println("-------------------------------------------");
System.out.println("La marca de la pickup es: " + pickup.getMarca());
System.out.println("Esta es la info de la pickup: " + pickup);


//Creo un objeto Camion que hereda del tipo de dato Auto y luego llamo al metodo acelerar con polimorfismo
Auto scania = new Camiones();
scania.acelerar();


}}