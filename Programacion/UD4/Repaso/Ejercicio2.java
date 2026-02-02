import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> matricula = new ArrayList<String>();
        ArrayList<String> tipoRevision = new ArrayList<String>();
        ArrayList<Integer> extras = new ArrayList<Integer>();
        ArrayList<Integer> costeFinal = new ArrayList<Integer>();
        int opcion = 0;
        String nuevaMatricula;
        String nuevoTipoRevision;
        int nuevoExtras;
        int nuevoCosteFinal;
        int costeBase;
        final int COSTEEXTRA = 15;
        int descuento;
        Boolean revisionExiste = false;
        int revisionEliminar;
        System.out.println("Opciones:\n1. Añadir revisión\n2. Listar revisiones\n3. MOstrar coste\n4. Eliminar revisión\n0. Salir");
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.print("Introduce una opción: ");
            // control de errores para el input de la opción
            while (!(scanner1.hasNextInt())) {
                scanner1.nextLine();
                System.out.print("¡Opcion fuera de rango! Introduce una opción: ");
                opcion = scanner1.nextInt();
            }
            opcion = scanner1.nextInt();
            scanner1.nextLine();
            if (opcion == 1) {
                System.out.print("Introduce la nueva matricula: ");
                nuevaMatricula = scanner1.nextLine();
                System.out.print("Introduce el tipo de revisión (básica o completa): ");
                nuevoTipoRevision = scanner1.nextLine();
                if (nuevoTipoRevision.equalsIgnoreCase("completa")) {
                    costeBase = 120;
                } else {
                    costeBase = 60;
                }
                System.out.print("Introduce el número de extras: ");
                nuevoExtras = scanner1.nextInt();
                scanner1.nextLine();
                // añadir los valores a los arrays, una vez comprobados
                matricula.add(nuevaMatricula);
                tipoRevision.add(nuevoTipoRevision);
                extras.add(nuevoExtras);
                nuevoCosteFinal = costeBase + COSTEEXTRA * nuevoExtras;
                costeFinal.add(nuevoCosteFinal);
            } else if (opcion == 2) {
                if (matricula.isEmpty()) {
                    System.out.println("¡No hay datos!");
                } else {
                    for (int i = 0; i < matricula.size(); i++) {
                        System.out.println((i + 1) + " -> " + matricula.get(i) + " | " + tipoRevision.get(i) + " | extras: " + extras.get(i) + " | coste: " + costeFinal.get(i));
                    }
                }
            } else if (opcion == 3) {
                revisionExiste = false;
                System.out.print("Introduce el ínidice de la revisión a eliminar: ");
                revisionEliminar = scanner1.nextInt();
                scanner1.nextLine();
                // manejar excepciones si el indice introducido no existe
                try {
                    revisionExiste = true;
                    matricula.remove(revisionEliminar);
                    tipoRevision.remove(revisionEliminar);
                    extras.remove(revisionEliminar);
                    costeFinal.remove(revisionEliminar);
                    System.out.println("Revisión eliminada correctamente.");
                } catch (Exception ArrayIndexOutOfBoundsException) {
                    System.out.println("El índice introducido no corresponde con ninguna revisión.");
                }
            } else if (opcion == 4) {

            }

            // debug
            System.out.println("(Debug) Mat: " + matricula);
            System.out.println("(Debug) Rev: " + tipoRevision);
            System.out.println("(Debug) Ext: " + extras);
            System.out.println("(Debug) Cos: " + costeFinal);
        } while (opcion != 0);
        scanner1.close();
    }
}
