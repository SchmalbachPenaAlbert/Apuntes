package Programacion.UD4.UD2toJava;
import java.util.ArrayList;

public class rel1_ej6 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("manzana");
        frutas.add("banana");
        frutas.add("naranja");
        frutas.remove(2);
        frutas.add("fresa");
        System.out.println(frutas);
    }
}