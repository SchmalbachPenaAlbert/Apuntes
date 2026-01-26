package Programacion.UD4.UD2toJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class rel2_ej6 {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<String>(Arrays.asList("Estudiar", "Practicar código"));
        ArrayList<Boolean> estadoTareas = new ArrayList<Boolean>(Arrays.asList(false, true));
        String opcion;
        String nuevaTarea;
        String estadoNuevaTarea;
        String tareaCompletar;
        int contadorLista;
        final int OPCIONMINIMA = 1;
        final int OPCIONMAXIMA = 5;
        System.out.println("Opciones:\n1. Añadir una nueva tarea\n2. Marcar una tarea como completada\n3. Ver la lista de tareas pendientes\n4. Ver la lista de tareas completadas\n5. Salir del programa.");
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.print("Introduce una opción:");
            opcion = scanner1.nextLine();
        } while (!(opcion.equals("5")));
    }
}