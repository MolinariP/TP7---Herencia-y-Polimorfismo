
package tp7ejercicio4;

public class Animal {
    protected String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    
    public void hacerSonido(){
        System.out.println("Sonido generico");
    }    
            
    public void describirAnimal()  {
        System.out.println("Soy " + nombre);
        hacerSonido();
    }
}
