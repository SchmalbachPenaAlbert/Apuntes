package programacion.ud5.pt5;

import java.util.ArrayList;
import java.util.Scanner;

public class ASP_PT5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    final int MAXANIMALES = 1000;
        final int OPCIONSALIR = 6;
        int opciónUsuario = 0;
        int cantidadModificar = 0;

        Animal animalPH = null;

        String codigoBuscar = "";
        String mensajeMenu = 
        "===== GESTIÓN DE ZOOLÓGICO =====\n\n" +
        "    1. Mostrar todos los animales\n" +
        "    2. Buscar un animal por código\n" +
        "    3. Agregar ejemplares a un animal\n" +
        "    4. Retirar ejemplares de un animal\n" +
        "    5. Eliminar un animal\n" +
        "    6. Salir\n\n" +
        "Seleccione una opción: ";

        ArrayList<Animal> animalesBase = new ArrayList<>();
        for(int i = 0; i < MAXANIMALES; i++) {
            animalesBase.add(new Animal("ANIMAL" + i, i + 15, i + 23 * i * 0.35));
        }

        Zoologico LoroParque = new Zoologico("LoroParque",animalesBase);

        // -------------------------------------------------
        
        while (opciónUsuario != OPCIONSALIR) {
            opciónUsuario = Fnc.pedirNumeroEntero2valores(scanner, 0, OPCIONSALIR, mensajeMenu); //? que es Fnc??
            scanner.nextLine();
            // enseña todos los animales
            if (opciónUsuario == 1) {
                System.out.println(LoroParque.mostraColeccion());
            }
            // Buscar animal por codigo. hace un toString() del animal
            if (opciónUsuario == 2) {
                codigoBuscar = scanner.nextLine();
                animalPH = LoroParque.buscarAnimal(codigoBuscar);

                if (animalPH != null) {
                    System.out.println(animalPH);
                } else {
                    System.out.println("No se ha encontrado el animal.");
                }
            }
            // agregar ejemplares a una especie
            if (opciónUsuario == 3) {
                System.out.print("Introduce el código del animal al que quieras agregar ejemplares: ");
                codigoBuscar = scanner.nextLine();
                cantidadModificar = Fnc.pedirNumeroEntero1valorMIN(scanner, 0, "Introduce la cantidad que quieres añadir: "); //? que es Fnc??
    
                if (LoroParque.buscarAnimal(codigoBuscar) != null) {
                    if(LoroParque.agregarEjemplares(codigoBuscar, cantidadModificar)) { //? esto que es? no debería poder funcionar, no?
                        System.out.println("Se han agregado correctamente los ejemplares");
                    } else {
                        System.out.println("No se han agregado correctamente los ejemplares");
                    } 
                } else {
                    System.out.println("No se ha encontrado el animal sobre el que interactuar ");
                }
            }
            // retirar ejemplares de animal
            if (opciónUsuario == 4) {
                System.out.println("Introduce el código del animal al que quieras retirar ejemplares: ");
                codigoBuscar = scanner.nextLine();
                cantidadModificar = Fnc.pedirNumeroEntero1valorMIN(scanner, 0, "Introduce la cantidad que quieres añadir: "); //? que es Fnc??

                
                if(LoroParque.eliminarEjemplares(codigoBuscar, cantidadModificar)) { //? lo mismo que la duda de arriba
                    System.out.println("Se han retirado correctamente los ejemplares");
                } else {
                    animalPH = LoroParque.buscarAnimal(codigoBuscar);
                    if(animalPH.getCantidadEjemplares() - cantidadModificar < 0) {
                        System.out.println("No se pueden quedar las cantidades en negatvio");
                    } else {
                        System.out.println("No se han retirado correctamente los ejemplares");
                    }
                }
            }
            // Eliminar animal (codigo)
            if (opciónUsuario == 5) {
                System.out.print("introduce el codigo del animal que quieras eliminar: ");
                codigoBuscar = scanner.nextLine();
                
                if(LoroParque.eliminarEspecie(codigoBuscar)) { //? lo mismo que la duda de arriba
                    System.out.println("Animal eliminado del zoologico correctamente");
                } else {
                    animalPH = LoroParque.buscarAnimal(codigoBuscar);
                    if (animalPH == null) {
                        System.out.println("No se ha podido eliminar al animal por que no se encontró.");
                    } else if (animalPH.getCantidadEjemplares() != 0) {
                        System.out.println("No se puede eliminar un animal con ejemplares disponibles.");
                    } 
                }
            }
        }
    }
}
