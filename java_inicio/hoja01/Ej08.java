//Dados tres números, indicar el mayor y el menor valor de los tres. 
import java.util.Scanner;

public class Ej08 {
    public static void main(String[] arg) {
         Scanner tec = new Scanner(System.in);
         double num1, num2, num3, mayor, menor;

         System.out.print("Ingresar primer numero: ");
         num1 = tec.nextDouble();
         System.out.print("Ingresar segundo numero: ");
         num2 = tec.nextDouble();
         System.out.print("Ingresar tercer numero: ");
         num3 = tec.nextDouble();
        
        mayor = num1;
        menor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
   
}