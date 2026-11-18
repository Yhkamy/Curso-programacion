import java.util.Scanner;
//

public class Ej08 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese numero entero: ");
        int n = tec.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
