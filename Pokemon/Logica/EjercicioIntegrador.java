package JavaProjects.Pokemon.Logica;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        Squartle squartle = new Squartle();
        Bulbassor bulbassor = new Bulbassor();
        Pikachu pikachu = new Pikachu();
        charmander charm = new charmander();

        squartle.ataqueBurbuja();
        bulbassor.ataqueMordisco();
        pikachu.ataquearaniazo();
        charm.ataquePunioFuego();
    }
}
