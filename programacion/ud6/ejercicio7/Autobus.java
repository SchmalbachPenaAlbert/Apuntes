package programacion.ud6.ejercicio7;

public class Autobus implements Transporte {
    @Override
    public void arrancar(String horaInicio) {
        System.out.println("El autobus arranca a las " + horaInicio + ".");
    }
    @Override
    public void detener(String horaFin) {
        System.out.println("El autobus se detiene a las " + horaFin + ".");
    }
}
