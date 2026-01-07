package JavaProjects.primerProyecto;

public abstract class Circulo extends Figuras {

    private double lado;

    public Circulo(double lado, double x, double y){

        super(x, y);
        this.lado = lado;

    }
    @Override
    public  double calcularArea(){
        double resultado = lado * lado;
        return resultado;
    };
}
