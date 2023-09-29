package caballeroJava;

public class ejercicio5 {
    public static void main(String[] args) {
        double cantPesos = 80000;
        double tasaCambio = 0.0027045374;

        double euros = cantPesos * tasaCambio;

        System.out.println("Con " + cantPesos + " pesos obtenes " + euros + " euros con una " +
        "tasa de cambio de " + tasaCambio + " euros por cada peso");
    }
}
