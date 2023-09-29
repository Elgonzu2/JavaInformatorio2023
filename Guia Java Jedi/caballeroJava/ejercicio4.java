package caballeroJava;

public class ejercicio4 {
    public static void main(String[] args) {
        double cantLibraEsterlina = 50;
        double tasaCambio = 1.219624;

        double dolares = cantLibraEsterlina * tasaCambio;

        System.out.println("Con " + cantLibraEsterlina + " libras esterlinas obtenes " + dolares + " dolares con una " +
        "tasa de cambio de " + tasaCambio + " dolares por cada libra esterlina");
    }
}
