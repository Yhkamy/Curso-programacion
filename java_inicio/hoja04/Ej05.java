import java.util.Scanner;

//Repetir el ejercicio anterior, pero ingresando un número entero de cualquier cantidad de 
//cifras. 

public class Ej05 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        System.out.println("ingrese valor: ");
        int n = tec.nextInt();
        int aux = n;

        while (aux != 0) {
            System.out.println(aux % 10);
            aux /= 10;
        }

        aux = n;
        int cifras = (int) Math.ceil(Math.log(n));
        System.out.println("Cifras: " + cifras);
    }
}