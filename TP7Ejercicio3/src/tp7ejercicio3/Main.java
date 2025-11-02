
package tp7ejercicio3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        Empleado empP1 = new EmpleadoPlanta("Juan Perez");
        Empleado empT1 = new EmpleadoTemporal("Jose Rossi");
        Empleado empP2 = new EmpleadoPlanta("Juana Garcia");
        Empleado empT2 = new EmpleadoTemporal("Ana Fernandez");
        
        empleados.add(empP1);
        empleados.add(empT1);
        empleados.add(empP2);
        empleados.add(empT2);
        
        for (Empleado e : empleados){
            System.out.println("El empleado " + e.getNombre() + " recibe un sueldo de " + e.calcularSueldo());   
        }
    }   
}
