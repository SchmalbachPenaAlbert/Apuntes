public class Ejercicio6 {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj(12, 38, 23);
        reloj1.sumarMinutos(54);
        reloj1.restarSegundos(28);
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
    void sumarMinutos(int minutos) {
        minuto += minutos;
    }
    void restarMinutos(int minutos) {
        minuto -= minutos;
    }
    void sumarSegundos(int segundos) {
        segundo += segundos;
    }
    void restarSegundos(int segundos) {
        segundo -= segundos;
    }

    @Override
    public String toString() {
        return "Hora actual - " + hora + ":" + minuto + ":" + segundo;
    }
}