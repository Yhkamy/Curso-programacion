//De una lista de n números ingresados por teclado, imprimir el mayor.

import java.util.Scanner;
public class Ej01 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        int n ;
        double num, mayor = 0;

        System.out.print("Numero de valores: ");
        n = tec.nextInt();
        //for(sentencia de inicializacion;expresion logica;sentencia de actualización)
        for (int i = 1; i <= n; i++) {
                System.out.print("ingrese valores: ");
                num = tec.nextDouble();
                if (num > mayor) 
                    mayor = num;
        }
        System.out.print("El mayor es " + mayor);
    }
}