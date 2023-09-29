package caballeroJava;

public class ejercicio2 {
    public static void main(String[] args) {
        
        double cantDolares = 50;
        double tasaCambio = 780;

        double pesos = cantDolares * tasaCambio;

        System.out.println("Con " + cantDolares + " dolares obtenes " + pesos + " pesos con una " +
        "tasa de cambio de " + tasaCambio + " pesos por cada dolar");
    }
}
