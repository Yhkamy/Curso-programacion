import java.util.Scanner;

//El programa generará un número aleatorio entre 0 y 100 y le pedirá al usuario que lo 
//adivine. Cuando el usuario ingrese el número para ver si acertó, el programa le indicará si 
//el número a adivinar es mayor, menor o bien si acertó. Cuando acierte, finaliza. 

public class Ej03 {
    public void main () {
        Scanner tec = new Scanner(System.in);

        int num = (int) Math.floor(Math.random() * 101);
        boolean adivino = false;
        int intento;
        int cont = 0;

        do {
            System.out.print("Cúal es mi numero? ");
            intento = tec.nextInt();

            cont++;

            if (intento == num) adivino = true;

            if (intento < num)
                System.out.println("El " + intento + " es menor");
            if (intento > num)
                System.out.println("El " + intento + " es mayor");
                
        }while(!adivino);

        System.out.println("Felicitaciones!! has acertado en " + cont + " intentos");

    }
}