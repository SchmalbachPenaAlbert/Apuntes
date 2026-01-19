package Programacion.UD4.UD2toJava;
import java.util.ArrayList;

public class rel1_ej7 {
    public static void main(String[] args) {
        ArrayList<String> dias = new ArrayList<String>();
        dias.add("lunes");
        dias.add("martes");
        dias.add("miercoles");
        dias.add("jueves");
        dias.add("viernes");
        dias.add("sabado");
        dias.add("domingo");
        // cambia un elemento existente
        dias.set(6, "domingo especial");
        System.out.println(dias);
    }
}