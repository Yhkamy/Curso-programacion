//Hacer un programa que Dado un año indicar si es bisiesto. Un año es bisiesto si es un número divisible por 4, pero si es divisible por 100 debe ser es divisible por 400.

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        int anio;

        System.out.print("Ingresa año para saber si es bisiesto: ");
        anio = tec.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.print(anio + " es bisiesto.");
        } else {
            System.out.print(anio + " no es bisiesto.");
        }
        
    }
}