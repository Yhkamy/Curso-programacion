// Suponiendo que el primer día del año fue lunes, escribir un programa que reciba un número con el día del año (de 1 a 366) e imprima el día de la semana que le toca. Por ejemplo: si recibe 3 debe imprimir ’miércoles’, si recibe 9 debe imprimir ’martes’

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        int dia;
        //String nombreDia = ""

        System.out.print("Ingresa un dia del año (num de 1 al 366): ");
        dia = tec.nextInt();
        
        if ( dia > 366) {
            System.out.print("el año en este planeta no tiene tantos días :) PD:continuando seria ");
        }
        if ( dia % 7 == 1) {
            System.out.print("Lunes");
        }
        if ( dia % 7 == 2) {
            System.out.print("Martes");
        }
        if ( dia % 7 == 3) {
            System.out.print("Miercoles");
        }
        if ( dia % 7 == 4) {
            System.out.print("Jueves");
        }
        if ( dia % 7 == 5) {
            System.out.print("Viernes");
        }
        if ( dia % 7 == 6) {
            System.out.print("Sabado");
        }
        if ( dia % 7 == 0) {
            System.out.print("Domingo");
        }

        //condicional multiple 
        //switch(dia % 7) {
        //  case 0 
        //      nombreDia = "Domingo"
        //      break;
        //  case 1 
        //      nombreDia = "lunes"
        //      break;
        //  case 2 
        //      nombreDia = "martes"
        //      break;
        //  case 3 
        //      nombreDia = "miercoles"
        //      break;
        //  case 4 
        //      nombreDia = "jueves"
        //      break;
        //  case 5 
        //      nombreDia = "viernes"
        //      break;
        //  case 6 
        //      nombreDia = "sabado"
        //      break;
        //}
    }
}