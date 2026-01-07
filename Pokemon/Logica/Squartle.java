package JavaProjects.Pokemon.Logica;

public class Squartle extends Pokemon implements Iagua {

    public Squartle(){}

    @Override
    protected void ataquePlacaje() {
  System.out.println("Soy squartle y ataco con placaje");}

    @Override
    protected void ataquearaniazo() {
   System.out.println("Soy squartle y ataco con araniazo");}

    @Override
    protected void ataqueMordisco() {
   System.out.println("Soy squartle y ataco con mordisco");}

    @Override
    public void ataqueHidrobomba() {
        System.out.println("Soy squartle y ataco con Hidrobomba");
    }

    @Override
    public void ataqueBurbuja() {
       System.out.println("Soy squartle y ataco con burbuja");
    }
    
}
