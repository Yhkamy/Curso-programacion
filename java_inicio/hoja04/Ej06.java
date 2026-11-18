import java.util.Scanner;
//Ingresando un valor entero, muestre por pantalla sus dígitos en orden inverso, por ejemplo: 
//INGRESO: 3589, SALIDA: 9853. 
public class Ej06 {
    public static void main(String[] arg) {
     Scanner tec = new Scanner(System.in);
     System.out.println("Ingrese numero entero: ");
        int n = tec.nextInt();
        int aux = n;

        while (aux != 0) {
            System.out.print(aux % 10);
            aux /= 10;
        }
    }
}