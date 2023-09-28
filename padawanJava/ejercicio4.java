package padawanJava;

public class ejercicio4 {
    public static void main(String[] args) {
        
        String nombre1 = "juan";
        int edad1 = 33;

        String nombre2 = "carlos";
        int edad2 = 54;

        String nombre3 = "martin";
        int edad3 = 47;

        String nombre4 = "victor";
        int edad4 = 18;

        String nombre5 = "pablo";
        int edad5 = 29;

        int cantPers = 5; 

        int promedio = (edad1 + edad2 + edad3 + edad4 + edad5) / cantPers;

        System.out.println("Persona 1: " + nombre1 + ", edad: " + edad1 +
        "\nPersona 2: " + nombre2 + ", edad: " + edad2 +
        "\nPersona 3: " + nombre3 + ", edad: " + edad3 +
        "\nPersona 4: " + nombre4 + ", edad: " + edad4 +
        "\nPersona 5: " + nombre5 + ", edad: " + edad5 +
        "\nSu promedio de edad es: " + promedio);
    }
}
