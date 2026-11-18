import java.util.Scanner;

//Ingresando un número entero por teclado de 4 cifras, mostrar sus dígitos uno por línea. 

public class Ej04 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese un número de 4 cifras: ");
        int numero = tec.nextInt();

        if (numero < 1000 || numero > 9999) {
            System.out.println("El número no tiene 4 cifras.");
        } else{
        int d1 = numero / 1000;        
        int d2 = (numero / 100) % 10;  
        int d3 = (numero / 10) % 10;   
        int d4 = numero % 10;          

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        }

    }
}
 