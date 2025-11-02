
package tp7ejercicio3;

public class EmpleadoPlanta extends Empleado {

    public EmpleadoPlanta(String nombre) {
        super(nombre);
    }
    
    @Override
    public double calcularSueldo(){
        return 1200000.0;
    }
}
