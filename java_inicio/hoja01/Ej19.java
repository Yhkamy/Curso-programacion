// Suponiendo que el primer día del año fue lunes, escribir un programa que reciba un número con el día del año (de 1 a 366) e imprima el día de la semana que le toca. Por ejemplo: si recibe 3 debe imprimir ’miércoles’, si recibe 9 debe imprimir ’martes’

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        int dia;

        System.out.print("Ingresa un dia del año (num de 1 al 366): ");
        dia = tec.nextInt();
        
        if ( dia > 366) {
            System.out.print("el año en este planeta no tiene tantos días :)");
        }

        if ( dia % 7 == )
    }
}