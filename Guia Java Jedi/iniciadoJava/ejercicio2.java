public class ejercicio2 {
    public static void main(String[] args) {
        int num1 = 22;
        int num2 = 27;

        int suma = num1 + num2;
        
        String resultado = (suma % 2 == 0) ? "par" : "impar";
        
        System.out.println("El resultado es " + suma + " y es " + resultado);
        
    }
}