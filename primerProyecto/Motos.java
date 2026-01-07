package JavaProjects.primerProyecto;

public class Motos extends Auto {
  private  int cilindrada;
   private boolean automatica;


public Motos(){};

public Motos(int cilindrada, boolean automatica, int id, String marca, String modelo, Float precio){
    super(id, marca, modelo, precio);
    this.cilindrada = cilindrada;
    this.automatica = automatica;
}

public int getCilindrada(){
    return cilindrada;
}

public void setCilindrada(int cilindrada){
    this.cilindrada = cilindrada;
}

public boolean getAutomatica(){
    return automatica;
}

public void setAutomatica(boolean automatica){
    this.automatica = automatica;
}

@Override 
public void acelerar(){
    System.out.println("Acelarando la moto...");
}

}