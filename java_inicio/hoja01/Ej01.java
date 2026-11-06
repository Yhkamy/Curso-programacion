import java.util.Scanner;

public class Ej01 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double numero, valorabsoluto;

        System.out.print("Ingresa un numero: ");
        numero = tec.nextDouble();

        valorabsoluto = numero;

        if (numero < 0) {
            valorabsoluto = numero * -1;
        }

        System.out.print("Valor Absoluto= " + valorabsoluto);
    }
}