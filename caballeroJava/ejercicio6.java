package caballeroJava;

public class ejercicio6 {
    public static void main(String[] args) {
        double cantBitcoins = 2.5;
        double tasaCambio = 27149.0;

        double dolares = cantBitcoins * tasaCambio;

        System.out.println("Con " + cantBitcoins + " bitcoins obtenes " + dolares + " dolares con una " +
        "tasa de cambio de " + tasaCambio + " dolares por cada bitcoin");
    }
}
