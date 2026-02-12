
import java.util.Date;

public class Ejercicio6 {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj(12, 38, 23);
        System.out.println(reloj1);
    }
}
class Reloj {
    int hora;
    int minuto;
    int segundo;
    Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    int sumarMinutos(minutos) {
        int nuevoMinuto;
        //TODO
        return nuevoMinuto;
    }
    int restarMinutos(minutos) {
        int nuevoMinuto;
        //TODO
        return nuevoMinuto;
    }
    int sumarSegundos(segundos) {
        int nuevoSegundo;
        //TODO
        return nuevoSegundo;
    }
    int restarSegundos(segundos) {
        int nuevoSegundo;
        //TODO
        return nuevoSegundo;
    }

    @Override
    public String toString() {
        return "Hora actual - " + hora + ":" + minuto + ":" + segundo;
    }
}