package Programacion.UD4.PTstoJava;
import java.util.Scanner;
public class PT1 {
    public static void main(String[] args) {
        // declara las variables
        int numeroEncargos;
        int stockMadera;
        double stockAcero;
        int encargoActual = 0;
        String articulo;
        int unidadesArticulo;
        int maderaGastada;
        double aceroGastado;
        int monedasGastadas;
        int maderaAcumulada = 0;
        double aceroAcumulado = 0;
        // crea un escaner
        Scanner scanner1 = new Scanner(System.in);
        // pregunta al usuario por los datos
        System.out.print("Número de encargos: ");
        numeroEncargos = scanner1.nextInt();
        System.out.print("Stock de madera (varas): ");
        stockMadera = scanner1.nextInt();
        System.out.print("Stock de acero (kg): ");
        stockAcero = scanner1.nextDouble();
        // bucle para los encargos
        while (numeroEncargos - encargoActual != 0) {
            encargoActual++;
            System.out.println("--- Encargo " + encargoActual + " ---");
            // pide el articulo al usuario y asigna un gasto dependiendo del articulo
            System.out.print("Indique el artículo a comprar (flecha, espada, escudo): ");
            articulo = scanner1.next();
            System.out.print("Indique el número de unidades a comprar: ");
            unidadesArticulo = scanner1.nextInt();
            if (articulo == "flecha") {
                maderaGastada = 1 * unidadesArticulo;
                aceroGastado = 0.05 * unidadesArticulo;
                monedasGastadas = 2 * unidadesArticulo;
            } else if (articulo == "espada") {
                maderaGastada = 3 * unidadesArticulo;
                aceroGastado = 1.5 * unidadesArticulo;
                monedasGastadas = 30 * unidadesArticulo;
            } else {
                maderaGastada = 1 * unidadesArticulo;
                aceroGastado = 1.2 * unidadesArticulo;
                monedasGastadas = 25 * unidadesArticulo;
            }
            // suma los gastos
            maderaAcumulada += maderaGastada;
            aceroAcumulado += aceroGastado;
            stockMadera -= maderaGastada;
            stockAcero -= aceroGastado;
            // imprimir resultados de la compra
            System.out.println("Artículo: " + articulo + " | Unidades: " + unidadesArticulo + " | Importe cobrado: " + monedasGastadas);
            System.out.println("Madera gastada: " + maderaGastada + " | Acumulada: " + maderaAcumulada);
            System.out.println("Acero gastado: " + aceroGastado + " | Acumulado: " + aceroAcumulado);
        }
    }
}
