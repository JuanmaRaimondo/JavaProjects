package JavaProjects.primerProyecto;

//Practicando concepto Clase, metodos. 
public class Auto {
    int id;
    String marca;
    String modelo;
    float precio;
//Lo de abajo es un constructor
    public Auto(int id, String marca, String modelo, float precio){

        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Auto(){}
    
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getMarca(){
        return marca;
    }

    public void setNombre(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public float getPrecio(){
        return precio;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public void acelerar(){

        System.out.println("Acelarando..");

    }

    public void frenar(){

        System.out.println("frenando..");

    }

    public void bocinear(){

        System.out.println("bocineando..");

    }

}
