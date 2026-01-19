package Programacion.UD4.UD2toJava;
import java.util.ArrayList;

public class rel1_ej11 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        // añado los valores (por detras)
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Laura");
        // añado el valor (por delante)
        nombres.add(0, "Carlos");
        System.out.println(nombres);
    }
}