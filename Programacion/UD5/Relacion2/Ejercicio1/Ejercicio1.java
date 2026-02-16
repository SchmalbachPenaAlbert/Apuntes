public class Ejercicio1 {
    public static void main(String[] args) {
        Estudiante alfredo = new Estudiante("Alfredo", 22, "STEM001");
        System.out.println(alfredo);
        // usando el getter y el setter
        alfredo.setNombre("Alfredo Velázquez");
        System.out.println(alfredo.getNombre());
        // si el input es incorrecto (menor de 17 en este caso), no se actualiza el atributo
        alfredo.setEdad(16);
        System.out.println(alfredo.getEdad());
    }
}
