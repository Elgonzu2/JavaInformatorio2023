package maestroJava;

public class ejercicio5 {
    public static void main(String[] args) {
        
        double m = 15.0;
        double v = 80.0;

        double formula = 0.5 * m * Math.pow(v, 2);
        System.out.println("La energia cinetica es: " + formula + " con masa " + m + " y velocidad " + v);
    }
}
