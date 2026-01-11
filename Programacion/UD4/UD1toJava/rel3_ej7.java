import java.util.Scanner;

public class rel3_ej7 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Introduzca un número:");
        double numero1 = scanner1.nextDouble();
        System.out.print("Introduzca otro número:");
        double numero2 = scanner1.nextDouble();
        System.out.print("Introduce un operante:");
        String operante = scanner1.next();
        double resultado = 0;
        if (operante == "+") {
            resultado = numero1 + numero2;
        } else if (operante == "-") {
            resultado = numero1 - numero2;
        } else if (operante == "*" || operante == "x") {
            resultado = numero1 * numero2;
        } else if (operante == "/") {
            resultado = numero1 / numero2;
        } else if (operante == "%") {
            resultado = numero1 % numero2;
        } else {
            System.out.print("No se ha introducido un operante válido.");
        }
        System.out.println("El resultado de la operación es " + resultado + ".");
        scanner1.close();
    }
    // DOES NOT WORK
}