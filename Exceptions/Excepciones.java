
 package JavaProjects.Exceptions;

class Excepciones {

    public static void main(String[] args) {
        try {
            int multiplicacion = 3/0;
        } catch (Exception e) {
            System.out.println("No podés dividir por 0");
        }
    }
}