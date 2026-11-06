//Hacer un algoritmo que permita Obtener la cantidad de horas, minutos y segundos de un tiempo dado en segundos. 

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        int segundos, minutos, horas;

        System.out.print("Ingrese el tiempo en segundos: ");
        segundos = tec.nextInt();

        minutos = segundos / 60 ;
        segundos = segundos % 60 ;

        horas = minutos / 60 ;
        minutos = minutos % 60 ;

        System.out.print("Eso son " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
    }
}