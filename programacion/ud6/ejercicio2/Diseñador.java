package programacion.ud6.ejercicio2;

public class Diseñador extends Empleado {
    final double bonificadorDiseñador = 1.25;
    
    Diseñador(String nombre, int sueldoBase) {
        super(nombre, sueldoBase);
    }

    public String calcularSueldo() {
        sueldoBase = (int) (sueldoBase * bonificadorDiseñador);
        return "Tiene un sueldo (con bonificación) de " + sueldoBase + "€ al mes.";
    }

    public String toString() {
        return nombre + " ocupa el rol de Diseñador/a, y tiene un sueldo de " + sueldoBase + "€.";
    }
}