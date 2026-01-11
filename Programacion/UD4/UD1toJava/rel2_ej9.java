import java.util.Scanner;
public class rel2_ej9 {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Introduzca el número de caramelos:");
        int caramelos = scanner1.nextInt();
        System.out.print("¿Cuántos niños/as hay?");
        int ninos = scanner1.nextInt();
        int carameloPorNino = caramelos / ninos;
        int resto = caramelos % ninos;
        System.out.println("Cada niño/a recibirá " + carameloPorNino + " caramelos, y sobrarán " + resto + " caramelos.");
        scanner1.close();
    }
}