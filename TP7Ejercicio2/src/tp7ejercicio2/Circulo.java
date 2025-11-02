
package tp7ejercicio2;

public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double radio, String nombre){
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public void calcularArea() {
        System.out.println("El area del " + nombre + " es: " + (Math.PI * radio * radio));
    }
}
