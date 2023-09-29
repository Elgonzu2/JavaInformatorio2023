package caballeroJava;

public class ejercicio3 {
    public static void main(String[] args) {
        double cantEuros = 50;
        double tasaCambio = 1.056;

        double dolares = cantEuros * tasaCambio;

        System.out.println("Con " + cantEuros + " euros obtenes " + dolares + " dolares con una " +
        "tasa de cambio de " + tasaCambio + " dolares por cada euro");
    }
}
