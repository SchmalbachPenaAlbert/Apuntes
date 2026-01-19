package Programacion.UD4.UD2toJava;
import java.util.ArrayList;

public class rel1_ej5 {
    public static void main(String[] args) {
        ArrayList<String> animales = new ArrayList<String>();
        animales.add("perro");
        animales.add("gato");
        animales.add("loro");
        animales.add("tortuga");
        ArrayList<String> eliminado = new ArrayList<String>();
        eliminado.add(animales.remove(3));
        System.out.println(animales);
        System.out.println(eliminado);
    }
}