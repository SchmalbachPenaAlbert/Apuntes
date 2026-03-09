package programacion.ud6.ejercicio2;

public class Gerente extends Empleado {
    final double bonificadorGerente = 1.4;
    
    Gerente(String nombre, int sueldoBase) {
        super(nombre, sueldoBase);
    }

    public String calcularSueldo() {
        sueldoBase = (int) (sueldoBase * bonificadorGerente);
        return "Tiene un sueldo (con bonificación) de " + sueldoBase + "€ al mes.";
    }

    public String toString() {
        return nombre + " ocupa el rol de Gerente, y tiene un sueldo de " + sueldoBase + "€.";
    }
}