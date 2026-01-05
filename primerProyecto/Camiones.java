package JavaProjects.primerProyecto;

public class Camiones extends Auto {
    String carga;
    int peso; 


public Camiones(){}

public Camiones(String carga, int peso, int id, String marca, String modelo, float precio){
    super(id, marca, modelo, precio);
    this.carga = carga;
    this.peso = peso;
}

public String getCarga(){
    return carga;
}

public void setCarga(String carga){
    this.carga = carga;
}

public int getPeso(){
    return peso;
}

public void setPeso (int peso){
    this.peso = peso;
}

@Override 
public void acelerar(){
    System.out.println("Acelarando el camion...");
}

}