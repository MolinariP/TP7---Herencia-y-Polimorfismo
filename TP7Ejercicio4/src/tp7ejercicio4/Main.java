
package tp7ejercicio4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        Perro p1 = new Perro("Perro 1");
        Gato g1 = new Gato("Gato 1");
        Vaca v1 = new Vaca("Vaca 1");
        
        animales.add(p1);
        animales.add(g1);
        animales.add(v1);
        
        for (Animal a : animales) {
            a.describirAnimal();
            System.out.println(" ");
        }
    }
}
