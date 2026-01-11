import java.util.Scanner;

public class rel3_ej9 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Ingrese su peso actual: ");
        int peso = scanner1.nextInt();
        double relacionPeso = 0.165;
        double pesoLuna = peso * relacionPeso;
        System.out.println("Su peso en la Luna sería de " + pesoLuna + " kilos!");
        scanner1.close();
    }
}