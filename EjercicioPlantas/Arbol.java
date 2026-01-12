package JavaProjects.EjercicioPlantas;

public class Arbol extends Planta {

    private String variedad;
    private String tipoTronco;
    private float radioDelTronco;
    private String color;
    private String tipoDeHoja;

    public Arbol(){}

    public Arbol(String variedad, String tipoTronco, float radioDelTronco, String color, String tipoDeHoja, String nombre, int altoTallo, boolean tieneHojas, String climaIdeal  ){
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioDelTronco = radioDelTronco;
        this.color = color;
        this.tipoDeHoja = tipoDeHoja;
    }

    

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public float getRadioDelTronco() {
        return radioDelTronco;
    }

    public void setRadioDelTronco(float radioDelTronco) {
        this.radioDelTronco = radioDelTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHoja() {
        return tipoDeHoja;
    }

    public void setTipoDeHoja(String tipoDeHoja) {
        this.tipoDeHoja = tipoDeHoja;
    }

    @Override
public void saludar(){
    System.out.println("Hola soy un Arbol");
}


}
