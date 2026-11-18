import java.util.Scanner;

//Determine si un valor entero ingresado por teclado es un palíndromo (capicúa).
public class Ej07 {
    public static void main(String[] arg) {
     Scanner tec = new Scanner(System.in);
     System.out.println("Ingrese numero entero: ");
        int n = tec.nextInt();
        int aux = n;
        int invertido = 0;

        while (aux != 0) {
            System.out.print(aux % 10);
            invertido = invertido * 10 + aux % 10;
            aux /= 10;
        }
        if (invertido == n) {
            System.out.println(" es capicua");
        } else {
            System.out.println(" no es capicua");
        }
        
    }
}