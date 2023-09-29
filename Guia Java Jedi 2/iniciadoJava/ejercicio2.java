public class ejercicio2 {
    public static void main(String[] args) {
        String nombre1 = "juan";
        String nombre2 = "pedro";
        String nombre3 = "martin";
        String nombre4 = "carlos";
        String nombre5 = "santiago";

        int cantNombres = 5;

        for (int i = 0; i <= cantNombres; i++) {
            switch(i){
                case 1:
                    System.out.println(nombre1);
                    break;
                case 2:
                    System.out.println(nombre2);
                    break;
                case 3:
                    System.out.println(nombre3);
                    break;
                case 4:
                    System.out.println(nombre4);
                    break;
                case 5:
                    System.out.println(nombre5);
                    break;
            }
        }
    }
}
