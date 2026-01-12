package JavaProjects.EjercicioPlantas;

public class Flor extends Planta {
    private String colorPetalos;
    private float promedioPetalos; 
    private String colorPistilo;    
    private String variedadDeFlor; 
    private String estacionQueFlorece;

    public Flor(){}

    public Flor(String colorPetalos, float promedioPetalos,  String colorPistilo,  String variedadDeFlor, String estacionQueFlorece, String nombre, int altoTallo, boolean tieneHojas, String climaIdeal){
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.promedioPetalos = promedioPetalos;
        this.colorPistilo = colorPistilo;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionQueFlorece = estacionQueFlorece;
    }

    

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public float getPromedioPetalos() {
        return promedioPetalos;
    }

    public void setPromedioPetalos(float promedioPetalos) {
        this.promedioPetalos = promedioPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }

    @Override
public void saludar(){
    System.out.println("Hola soy una flor ");
}
}
