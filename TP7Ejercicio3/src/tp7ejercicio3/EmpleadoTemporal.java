
package tp7ejercicio3;

public class EmpleadoTemporal extends Empleado {
    
    public EmpleadoTemporal(String nombre) {
        super(nombre);
    }
    
        @Override
    public double calcularSueldo(){
        return 600000.0;
    }
}
