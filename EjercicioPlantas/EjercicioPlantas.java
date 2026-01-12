package JavaProjects.EjercicioPlantas;

public class EjercicioPlantas {
    
    public static void main(String[] args) {
        
        Arbol sauce = new Arbol("Conifera", "Duro", 3  , "Marron", "Peredne", "Sauce", 100, false, "Templado");
        Flor rosa = new Flor("Rojos/blancos/Amarillos", 3, "Blanco", "Rugosa", "Invierno", "Rosa", 3, true, "Templado");
        Arbusto quinoa = new Arbusto(100, false, "Arbusto de Altura", "Verde", false, "Quinoa", 4, false, "altura");

        sauce.saludar();
        rosa.saludar();
        quinoa.saludar();

        System.out.println("los arboles son: " + sauce.getNombre());
        System.out.println("las flores son: " + rosa.getNombre());
        System.out.println("los arbustos son: " + quinoa.getNombre());
    }
}
