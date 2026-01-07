package JavaProjects.Pokemon.Logica;

public class charmander extends Pokemon implements Ifuego {

    public charmander(){}

    @Override
    protected void ataquePlacaje() {
     System.out.println("Soy charmander y ataco con placaje"); }

    @Override
    protected void ataquearaniazo() {
    System.out.println("Soy charmander y ataco con araniazo"); }

    @Override
    protected void ataqueMordisco() {
    System.out.println("Soy charmander y ataco con mordisco"); }

    @Override
    public void ataquePunioFuego() {
        System.out.println("Soy charmander y ataco con punio de fuego");
    }

    @Override
    public void ataqueLanzaLlamas() {
        System.out.println("Soy charmander y ataco con lanzallamas");
    }
    
}
