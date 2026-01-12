package Programacion.UD4.PTstoJava;
import java.util.Scanner;
public class PT1 {
    public static void main(String[] args) {
        // declara las variables
        int encargosTotales;
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
        int gastoMonedasAcumulado = 0;
        int unidadesFlechaCompradas = 0;
        int unidadesEscudoCompradas = 0;
        int unidadesEspadaCompradas = 0;
        // crea un escaner
        Scanner scanner1 = new Scanner(System.in);
        // pregunta al usuario por los datos
        System.out.print("Número de encargos: ");
        encargosTotales = scanner1.nextInt();
        System.out.print("Stock de madera (varas): ");
        stockMadera = scanner1.nextInt();
        System.out.print("Stock de acero (kg): ");
        stockAcero = scanner1.nextDouble();
        // bucle para los encargos
        while (encargosTotales - encargoActual != 0) {
            encargoActual++;
            System.out.println("--- Encargo " + encargoActual + " ---");
            // pide el articulo al usuario y asigna un gasto dependiendo del articulo
            System.out.print("Indique el artículo a comprar (flecha, espada, escudo): ");
            articulo = scanner1.next();
            System.out.print("Indique el número de unidades a comprar: ");
            unidadesArticulo = scanner1.nextInt();
            if (articulo.equalsIgnoreCase("flecha")) {
                maderaGastada = 1 * unidadesArticulo;
                aceroGastado = 0.05 * unidadesArticulo;
                monedasGastadas = 2 * unidadesArticulo;
                unidadesFlechaCompradas += unidadesArticulo;
            } else if (articulo.equalsIgnoreCase("espada")) {
                maderaGastada = 3 * unidadesArticulo;
                aceroGastado = 1.5 * unidadesArticulo;
                monedasGastadas = 30 * unidadesArticulo;
                unidadesEspadaCompradas += unidadesArticulo;
            } else {
                maderaGastada = 1 * unidadesArticulo;
                aceroGastado = 1.2 * unidadesArticulo;
                monedasGastadas = 25 * unidadesArticulo;
                unidadesEscudoCompradas += unidadesArticulo;
            }
            // suma los gastos
            maderaAcumulada += maderaGastada;
            aceroAcumulado += aceroGastado;
            gastoMonedasAcumulado += monedasGastadas;
            stockMadera -= maderaGastada;
            stockAcero -= aceroGastado;
            // imprimir resultados de la compra
            System.out.println("Artículo: " + articulo + " | Unidades: " + unidadesArticulo + " | Importe cobrado: " + monedasGastadas);
            System.out.println("Madera gastada: " + maderaGastada + " | Acumulada: " + maderaAcumulada);
            System.out.printf("Acero gastado: %.2f | Acumulado: %.2f\n", aceroGastado, aceroAcumulado);
        }
        // cierra el escaner
        scanner1.close();
        // muestra el resumen final
        System.out.println("--- RESUMEN FINAL ---");
        System.out.println("Encargos registrados: " + encargoActual + " de " + encargosTotales);
        System.out.println("Unmidades -> Flecha: " + unidadesFlechaCompradas + " | Escudo: " + unidadesEscudoCompradas + " | Espada: " + unidadesEspadaCompradas);
        System.out.printf("Consumo total -> Madera: %2.f | Acero: %2.f", maderaAcumulada, aceroAcumulado);
        System.out.printf("Stock restante -> Madera: %2.f | Acero: %2.f", stockMadera, stockAcero);
        System.out.println("Importe total: " + gastoMonedasAcumulado);
        // dependiendo de si se ha completado sin problemas o no, muestra un u otro mensaje
        if (encargosTotales - encargoActual == 0) {
            System.out.println("Registro completado con éxito.");
        } else {
            System.out.println("Registro interrumpido por superación de stock.");
        }
    }
}
