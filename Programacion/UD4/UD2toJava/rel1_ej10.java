package Programacion.UD4.UD2toJava;
import java.util.ArrayList;

public class rel1_ej10 {
    public static void main(String[] args) {
        ArrayList<Integer> pila = new ArrayList<Integer>();
        // añade valores al array
        pila.add(10);
        pila.add(20);
        pila.add(30);
        System.out.println(pila);
        System.out.println(pila.remove(2));
        System.out.println(pila);
        System.out.println(pila.remove(1));
        System.out.println(pila);
        System.out.println(pila.remove(0));
        System.out.println(pila);
    }
}