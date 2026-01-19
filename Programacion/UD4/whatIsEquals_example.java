package Programacion.UD4;

public class whatIsEquals_example {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;

        System.out.println(a == b);       // false
        System.out.println(a.equals(b));  // true
    }
}
