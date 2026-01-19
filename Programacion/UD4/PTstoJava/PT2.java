package Programacion.UD4.PTstoJava;

import java.util.ArrayList;
import java.util.Scanner;

public class PT2 {
    public static void main(String[] args) {
        ArrayList<Integer> tableroInterno = new ArrayList<Integer>();
            ArrayList<String> tableroVisible = new ArrayList<String>();
        Integer eleccionJugador = null;
        int numeroJugador = 1;
        boolean bombaExplotada = false;
        boolean tuberiasSegurasDescubiertas = false;
        String mensajeDesvelar = "";
        int numeroTuberiasElegidas = 0;
        int numeroBombasTotales = 0;
        int numeroBombasActual = 0;
        int posicionBombaActual = 0;
        final int NUMEROPOSICIONESTABLERO = 10;
        final int NUMEROBOMBASMAXIMAS = 5;
        final int NUMEROBOMBASMINIMAS = 1;
        
        Scanner scanner1 = new Scanner(System.in);
        // inicializacion de arrays
        for (int i = 0; i < NUMEROPOSICIONESTABLERO; i++) {
            tableroInterno.add(0);
            tableroVisible.add("🟩");
        }
        // aleatorización de bombas totales
        numeroBombasTotales = (int) (Math.floor(Math.random() * NUMEROBOMBASMAXIMAS) + NUMEROBOMBASMINIMAS);
        // aleatorizacion de posición de las bombas
        while (numeroBombasActual < numeroBombasTotales) {
            posicionBombaActual = (int) Math.floor(Math.random() * tableroInterno.size());
            // comprobación de si la bomba esta repetida
            if (tableroInterno.set(posicionBombaActual, 0) == 0) {
                tableroInterno.set(posicionBombaActual, 1);
                numeroBombasActual++;
            }
        }

        // bucle para el juego, que se ejecuta mientras que no se cumplan las opciones de derrota/victoria
        while (bombaExplotada == false && tuberiasSegurasDescubiertas == false) {
            // bucle que pide al usuario imputs si el imput es nulo o ninguno
            while (eleccionJugador == null) {
                System.out.println("JUGADOR " + numeroJugador + "\nIntroduce el índice de la tubería a descubrir:");
                if (scanner1.hasNextInt()) {
                    eleccionJugador = scanner1.nextInt();
                } else {
                    System.out.println("Entrada inválida! Introduce el índice de la tubería a descubrir:");
                    scanner1.next(); // limpiar entrada incorrecta
                }
            }
            // bucle que pide al usuario imputs si su elección es una tubería ya descubierta
            while ((tableroVisible.get(posicionBombaActual)).equals("⚪️")) {
                System.out.println("JUGADOR " + numeroJugador + "\n¡Esa tubería ya ha sido descubierta! Introduce el índice de la tubería a descubrir:");
                eleccionJugador = scanner1.nextInt();
                scanner1.close();
            }
            numeroTuberiasElegidas++;
            // verificacion del tipo de tuberia (segura/con bomba)
            if (tableroInterno.get(eleccionJugador).equals(0)) {
                tableroVisible.set(eleccionJugador, "⚪️");
                mensajeDesvelar = "Tubería segura";
            } else {
                tableroVisible.set(eleccionJugador, "💣");
                mensajeDesvelar = "Tubería con topo-bomba";
                bombaExplotada = true;
            }
            System.out.println(mensajeDesvelar + "\n" + String.join(",", tableroVisible));
            // cambio de jugador después de cada turno
            if (numeroJugador == 1) {
            numeroJugador++;
            } else {
                numeroJugador--;
            }
            // comprobación de la condición de victoria
            if (numeroTuberiasElegidas == (NUMEROPOSICIONESTABLERO - numeroBombasTotales)) {
                tuberiasSegurasDescubiertas = true;
            }
        }

        // mensajes de derrota/victoria
        if (bombaExplotada == true) {
            if (numeroJugador == 2) {
                System.out.println("💥 ¡Topo-bomba! Mario (Jugador 1) pierde.");
            } else {
                System.out.println("💥 ¡Topo-bomba! Luigi (Jugador 2) pierde.");
            }
        } else {
            System.out.println("¡Se han descubierto todas las tuberías seguras!\n¡Los topo-bomba restantes se han visto acorralados y han huido!\n\nMario y Luigi ganan.");
        }
    }
}   
// Known issues: when selecting which pipe you want to uncover, the number of correct answers rises until the player automatically wins