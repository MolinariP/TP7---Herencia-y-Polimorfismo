
package tp7ejercicio2;

public class Rectangulo extends Figura{
        private double base;
        private double altura;
    
    public Rectangulo(double base, double altura, String nombre){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        System.out.println("El area del " + nombre + " es: " + (base * altura));
    }
}
