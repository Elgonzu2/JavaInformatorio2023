package maestroJava;

public class ejercicio6 {
    public static void main(String[] args) {
        double g = 9.8;
        double vi = 50;
        double t = 10;

        double vf = vi + g * t;

        System.out.println("La velocidad final es: " + vf + " con " + vi + "\n velocidad inicial, " + t + " tiempo, " + g + " gravedad");
    }
}
