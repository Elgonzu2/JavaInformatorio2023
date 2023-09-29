public class ejercicio1 {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i+=2) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 && j == 0){
                    System.out.print("      ");
                    System.out.print("*");
                }else if (i == 2 && j == 0) {
                    System.out.print("     ");
                    System.out.print("*");
                }else if (i == 4 && j == 0) {
                    System.out.print("    ");
                    System.out.print("*");
                }else if (i == 6 && j == 0) {
                    System.out.print("   ");
                    System.out.print("*");
                }else if (i == 8 && j == 0) {
                    System.out.print("  ");
                    System.out.print("*");
                }else if (i == 10 && j == 0) {
                    System.out.print(" ");
                    System.out.print("*");
                }else{
                    System.out.print("*");
                }
                
            }
            System.out.println("");
        }
    }
}