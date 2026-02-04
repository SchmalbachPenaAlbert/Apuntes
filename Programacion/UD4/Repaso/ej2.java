import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        ArrayList<String> matricula = new ArrayList<String>(Arrays.asList("4372CLD"));
        ArrayList<String> tipoRevision = new ArrayList<String>(Arrays.asList("completa"));
        ArrayList<Integer> extras = new ArrayList<Integer>(Arrays.asList(4));
        ArrayList<Double> costeFinal = new ArrayList<Double>(Arrays.asList(180.00));
        ArrayList<Boolean> descuentoAplicado = new ArrayList<Boolean>(Arrays.asList(false));
        int opcion = -1;
        String nuevaMatricula;
        String nuevoTipoRevision;
        int nuevoExtras;
        Double nuevoCosteFinal;
        int costeBase;
        final int COSTEEXTRA = 15;
        final int OPCIONMINIMA = 0;
        final int OPCIONMAXIMA = 0;
        int revisionConsultar;
        Boolean terminaEnPar;
        String ultimoCaracter;
        int ultimoNumero;
        System.out.println("Opciones:\n1. Añadir revisión\n2. Listar revisiones\n3. MOstrar coste\n4. Eliminar revisión\n0. Salir");
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.print("Introduce una opción: ");
            // control de errores para el input de la opción
            while (!(scanner1.hasNextInt())) {
                scanner1.nextLine();
                System.out.print("¡Opcion fuera de rango! Introduce una opción: ");
            }
            opcion = scanner1.nextInt();
            scanner1.nextLine();
            if (opcion == 1) {
                System.out.print("Introduce la nueva matricula: ");
                nuevaMatricula = scanner1.nextLine();
                matricula.add(nuevaMatricula);
                System.out.print("Introduce el tipo de revisión (básica o completa): ");
                nuevoTipoRevision = scanner1.nextLine();
                if (nuevoTipoRevision.equalsIgnoreCase("completa")) {
                    costeBase = 120;
                    tipoRevision.add("completa");
                } else {
                    costeBase = 60;
                    tipoRevision.add("básica");
                }
                System.out.print("Introduce el número de extras: ");
                nuevoExtras = scanner1.nextInt();
                scanner1.nextLine();
                extras.add(nuevoExtras);
                nuevoCosteFinal = (double) (costeBase + COSTEEXTRA * nuevoExtras);
                // aplicar descuento (si el ultimo caracter es numero par)
                terminaEnPar = false;
                if (!nuevaMatricula.isEmpty()) { 
                    ultimoCaracter = nuevaMatricula.substring(nuevaMatricula.length() - 1);
                    if (Character.isDigit(ultimoCaracter.charAt(0))) {
                        ultimoNumero = Integer.parseInt(ultimoCaracter);
                        if (ultimoNumero % 2 == 0) {
                            terminaEnPar = true;
                        }
                    }
                }
                if (terminaEnPar == true) {
                    descuentoAplicado.add(true);
                    nuevoCosteFinal = nuevoCosteFinal * 0.9; // 10% de descuento
                } else {
                    descuentoAplicado.add(false);
                }
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
                System.out.print("Introduce el ínidice de la revisión a consultar: ");
                revisionConsultar = scanner1.nextInt();
                scanner1.nextLine();
                // manejar excepciones si el indice introducido no existe
                try {
                    System.out.println(costeFinal.get(revisionConsultar));
                    if (descuentoAplicado.get(revisionConsultar) == true) {
                        System.out.println("(Fue aplicado un descuento del 10%)");
                    } else {
                        System.out.println("(No fue aplicado ningún descuento)");
                    }
                } catch (Exception ArrayIndexOutOfBoundsException) {
                    System.out.println("El índice introducido no corresponde con ninguna revisión.");
                }
            } else if (opcion == 4) {
                System.out.print("Introduce el ínidice de la revisión a eliminar: ");
                revisionConsultar = scanner1.nextInt();
                scanner1.nextLine();
                // manejar excepciones si el indice introducido no existe
                try {
                    matricula.remove(revisionConsultar);
                    tipoRevision.remove(revisionConsultar);
                    extras.remove(revisionConsultar);
                    costeFinal.remove(revisionConsultar);
                    System.out.println("Revisión eliminada correctamente.");
                } catch (Exception ArrayIndexOutOfBoundsException) {
                    System.out.println("El índice introducido no corresponde con ninguna revisión.");
                }
            } else if (opcion < OPCIONMINIMA || opcion > OPCIONMAXIMA) {
                System.out.println("¡La opción introducida no se encuentra dentro del rango!");
            }

            // debug
            System.out.println("(Debug) Mat: " + matricula);
            System.out.println("(Debug) Rev: " + tipoRevision);
            System.out.println("(Debug) Ext: " + extras);
            System.out.println("(Debug) Cos: " + costeFinal);
            System.out.println("(Debug) Des: " + descuentoAplicado);
        } while (opcion != 0);
        System.out.println("Programa finalizado.");
        scanner1.close();
    }
}
