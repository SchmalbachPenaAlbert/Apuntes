package Programacion.UD4.UD2toJava;
import java.util.ArrayList;

public class rel1_ej8 {
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<Integer>();
        numero.add(100);
        numero.add(200);
        numero.add(300);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        // añade el elemento en posición 0 al nuevo array
        temp.add(numero.get(0));
        // se copia el elemento de la posicion 2 a la posicion 0
        numero.set(0, numero.get(2));
        numero.set(2, temp.get(0));
        System.out.println(numero);
    }
}