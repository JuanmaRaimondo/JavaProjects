package JavaProjects.Pokemon.Logica;

public class Bulbassor extends Pokemon implements Iplanta{

    public Bulbassor(){}


    @Override
    protected void ataquePlacaje() {
       System.out.println("Soy Bulbassor y ataco con Placaje"); 
    }

    @Override
    protected void ataquearaniazo() {
    System.out.println("Soy Bulbassor y ataco con araniazo");
    }

    @Override
    protected void ataqueMordisco() {
    System.out.println("Soy bulbassor y ataco con Mordisco");}

    @Override
    public void ataqueParalizar() {
        System.out.println("Soy Bulbassor y ataco con paralizar");
    }

    @Override
    public void ataqueDrenaje() {
        System.out.println("Soy Bulbassor y ataco con paralizar");
    }
    
}
