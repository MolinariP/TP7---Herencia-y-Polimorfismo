
package tp7ejercicio2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        Circulo circ1 = new Circulo(5, "Circulo 1");
        Rectangulo rect1 = new Rectangulo(2, 4, "Rectangulo 1");
        Circulo circ2 = new Circulo(8, "Circulo 2");
        Rectangulo rect2 = new Rectangulo(6, 3, "Rectangulo 2");
        
        figuras.add(circ1);
        figuras.add(rect1);
        figuras.add(circ2);
        figuras.add(rect2);
        
        for (Figura f : figuras){
            f.calcularArea();    
        }
    }
}
