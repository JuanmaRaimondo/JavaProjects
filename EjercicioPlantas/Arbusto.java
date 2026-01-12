package JavaProjects.EjercicioPlantas;

public class Arbusto extends Planta{
    private float ancho;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorHojas;
    private boolean sePodaONo;


public Arbusto(){}

public Arbusto(float ancho, boolean esDomestico, String variedadArbusto, String colorHojas, boolean sePodaONo, String nombre, int altoTallo, boolean tieneHojas, String climaIdeal){
    super(nombre, altoTallo, tieneHojas, climaIdeal);
    this.ancho = ancho;
    this.esDomestico = esDomestico;
    this.variedadArbusto = variedadArbusto;
    this.colorHojas = colorHojas;
    this.sePodaONo = sePodaONo;
}



public float getAncho() {
    return ancho;
}

public void setAncho(float ancho) {
    this.ancho = ancho;
}

public boolean isEsDomestico() {
    return esDomestico;
}

public void setEsDomestico(boolean esDomestico) {
    this.esDomestico = esDomestico;
}

public String getVariedadArbusto() {
    return variedadArbusto;
}

public void setVariedadArbusto(String variedadArbusto) {
    this.variedadArbusto = variedadArbusto;
}

public String getColorHojas() {
    return colorHojas;
}

public void setColorHojas(String colorHojas) {
    this.colorHojas = colorHojas;
}

public boolean isSePodaONo() {
    return sePodaONo;
}

public void setSePodaONo(boolean sePodaONo) {
    this.sePodaONo = sePodaONo;
}

@Override
public void saludar(){
    System.out.println("Hola soy un arbusto");
}
}