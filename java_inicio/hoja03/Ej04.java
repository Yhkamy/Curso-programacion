import java.util.Scanner;

//Realizar un programa que adivine el número (entre 0 y 100) que ha pensado el usuario. En 
//cada paso, el programa propone un número y el usuario debe contestar, introduciendo su 
//contestación como dato, si ha acertado, o bien si el número que ha propuesto el 
//ordenador es mayor o es menor que el que tenía pensado. Por ejemplo, ingresando: 
//0 –> Acierto 
//1 –> El valor propuesto es mayor -1 –> El valor propuesto es Menor 

public class Ej04 {
    public void main () {
        Scanner tec = new Scanner(System.in);
        int minimo = 0;
        int maximo = 100;
        int num, respuesta;
        boolean adivino = false;
        int cont = 0;

        do {
            num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + minimo);

            cont++;

            System.out.println("Mi numero es: " + num);
            System.out.println("0 = acierto");
            System.out.println("1 = mi numero es mayor");
            System.out.println("-1 = mi numero es menor");

            System.out.print("Tu respuesta: ");
            respuesta = tec.nextInt();

            if (respuesta == 0)
                adivino = true;
            if (respuesta == 1)
                maximo = num - 1;
            if (respuesta == -1)
                minimo = num + 1;
            
        
        } while (!adivino);

        System.out.println("He acertadooo!!!! tras " + cont + " intentos");

    }
}