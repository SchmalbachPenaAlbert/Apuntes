package programacion.ud5.pt5;

import java.util.ArrayList;

public class ASP_PT5 {
    public static void main(String[] args) {
        String mensajeMenu = "===== GESTIÓN DE ZOOLÓGICO =====\n"
                            + "1. Mostrar todos los animales\n"
                            + "2. Buscar un animal por código\n"
                            + "3. Agregar ejemplares a un animal\n"
                            + "4. Retirar ejemplares de un animal\n"
                            + "5. Eliminar un animal\n"
                            + "6. Salir\n"
                            + "Seleccione una opción:";
        ArrayList<Animal> zoo1 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            zoo1.add(new Animal("Caballo de las montañas", i, i));
        }
        System.out.println("");
    }
}
