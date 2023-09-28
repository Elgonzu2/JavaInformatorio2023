package maestroJava;

public class ejercicio7 {
    public static void main(String[] args) {
        double m = 50;
        double v = 30;
        double r = 4;

        double FC = m * (Math.pow(v, 2)/r);
        System.out.println("La fuerza centripeta es: " + FC+ " con " + m + "\n masa, " + v + " velocidad angular, " + r + " radio trayectoria");

    }
}
