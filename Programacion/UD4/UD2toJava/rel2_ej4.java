package Programacion.UD4.UD2toJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class rel2_ej4 {
    public static void main(String[] args) {
        ArrayList<String> titulos = new ArrayList<String>(Arrays.asList("1983", "La casa de Bernarda Alba", "Poeta en Nueva York", "Fahrenheit 432", "Nada"));
        ArrayList<Integer> stock = new ArrayList<Integer>(Arrays.asList(6, 3, 4, 2, 5));
        String nuevoTitulo;
        Integer nuevoStock = null;
        String tituloSolicitado = "";
        int opcion = 0;
        boolean libroEnStock;
        final int MINIMAOPCION = 1;
        final int MAXIMAOPCION = 1;
        System.out.println("Opciones:");
        System.out.println("1. Añadir un nuevo libro al inventario.");
        System.out.println("2. Actualizar la cantidad de un libro existente.");
        System.out.println("3. Ver el inventario completo.");
        System.out.println("4. Salir del programa.");

        // DEV
        System.out.println(titulos);
        System.out.println(stock);

        Scanner scanner1 = new Scanner(System.in);
        while (opcion != 4) {
            nuevoStock = null;
            System.out.print("Introduce una opción:");
            opcion = scanner1.nextInt();
            scanner1.nextLine();
            if (opcion == 1) {
                System.out.print("Introduce el título del libro a añadir:");
                nuevoTitulo = scanner1.nextLine();
                while (nuevoStock == null) {
                    System.out.print("Introduce el stock del libro:");
                    if (scanner1.hasNextInt()) {
                        nuevoStock = scanner1.nextInt();
                        if (nuevoStock < 0) {
                            System.out.println("El stock no puede ser negativo!");
                            nuevoStock = null;
                        }
                        scanner1.nextLine();
                    } else {
                        System.out.println("Introduce un stock válido!");
                        scanner1.nextLine();
                    }
                }
                titulos.add(nuevoTitulo);
                stock.add(nuevoStock);
            } else if (opcion == 2) {
                libroEnStock = false;
                // bucle que pide titulos hasta que se introduzca el titulo de un libro en stock o se cancele (null)
                while (libroEnStock == false && tituloSolicitado != null) {
                    System.out.print("Introduce el título del libro existente: ");
                    tituloSolicitado = scanner1.nextLine();
                    // bucle que busca el título. Si se encuentra un título existente, pregunta por el nuevo stock
                    for (int i = 0; i < titulos.size(); i++) {
                        if (tituloSolicitado.equalsIgnoreCase(titulos.get(i))) {
                            System.out.print("Introduce el NUEVO STOCK del libro (stock actual = " + stock.get(i) + "):");
                            nuevoStock = scanner1.nextInt();
                            libroEnStock = true;
                            stock.set(i, nuevoStock);
                            i = titulos.size();
                            // si es null (usuario pulsa cancelar) se cancela
                        }
                    }
                    if (libroEnStock == false) {
                        System.out.println("¡El título introducido NO existe!");
                    }
                }        
            } else if (opcion == 3) {
                System.out.println("Inventario:");
                // bucle que muestra en la consola los titulos y el correspondiente stock en una línea
                for (int i = 0; i < titulos.size(); i++) {
                    System.out.println(titulos.get(i) + " | Stock: " + stock.get(i));
                }
            } else if (opcion < MINIMAOPCION || opcion > MAXIMAOPCION) {
                // (si es menor que 1 o mayor que 4...)
                System.out.println("Por favor, introduce una opción valida.");
            }
        }
        scanner1.close();
    }
}