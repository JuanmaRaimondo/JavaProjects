package JavaProjects.Pokemon.Logica;

public class Pikachu extends Pokemon implements Ielectrico{


    public Pikachu(){}

    @Override
    protected void ataquePlacaje() {
   System.out.println("Soy Picachu y ataco con placaje");}

    @Override
    protected void ataquearaniazo() {
    System.out.println("Soy Picachu y ataco con araniazo");}

    @Override
    protected void ataqueMordisco() {
    System.out.println("Soy Picachu y ataco con mordisco");}

    @Override
    public void ataqueImpactrueno() {
        System.out.println("Soy Picachu y ataco con Impactrueno");
    }

    @Override
    public void ataquePunioTrueno() {
        System.out.println("Soy Picachu y ataco con PunioTrueno");
    }
    
}
