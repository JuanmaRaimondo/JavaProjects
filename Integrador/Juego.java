package JavaProjects.Integrador;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    public static void main(String[] args) {
        
        //Agrego ArrayList de tipo VideoJuego

        List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();

        //Creo 5 Juegos

        VideoJuego juego1 = new VideoJuego(123, "Banjo Kazooie", "Nintendo 64", 4, "plataforma");
        VideoJuego juego2 = new VideoJuego(124, "Red Dead Redemtion 2", "PS4", 1, "Mundo Abierto");
        VideoJuego juego3 = new VideoJuego(120, "Counter Strike 1.6", "PC", 10, "Shooter");
        VideoJuego juego4 = new VideoJuego(126, "CrashBandicoot", "PS1", 1, "Arcade");
        VideoJuego juego5 = new VideoJuego(125, "Mario Kart", "Nintendo", 4, "plataforma");

        //Agrego los juegos a la lista
            listaVideoJuegos.add(juego5);
            listaVideoJuegos.add(juego4);
            listaVideoJuegos.add(juego3);
            listaVideoJuegos.add(juego2);
            listaVideoJuegos.add(juego1);

        //Recorrer el arraylist con Foreach

        for (VideoJuego juego : listaVideoJuegos) {
            System.out.println("El titulo del primer juego es: " + juego.getTitulo() + " El nombre de la consola es: " + juego.GetConsola() + " La cantidad de jugadores son: " + juego.getCantidadJugadores());
            
        }

        //Cambio de nombre y cantidad de jugadores, luego, mostrarlo. 

        juego1.setTitulo("banjoo Kazooe II");
        juego1.setcantidadJugadores(10);
        juego3.setTitulo("Counter Strike GO");
        juego3.setcantidadJugadores(2);

        for (VideoJuego videoJuego : listaVideoJuegos) {
            System.out.println("El titulo del juego es: " + videoJuego.getTitulo() + " La cantidad de jugadores es: " + videoJuego.getCantidadJugadores() + videoJuego.getCategoria() + videoJuego.GetConsola() );
             if (videoJuego.consola.equals("Nintendo 64")) {
                System.out.println("El juego o los juegos que son para nintendo 64 es: " + videoJuego.getTitulo());
            
        }

        
        }

        //Mostrar por pantalla los juegos que sean de nintendo 64

       

    }
}
