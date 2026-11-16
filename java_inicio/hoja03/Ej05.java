import java.util.Scanner;

//scribir un programa que pida al usuario un número, que representará una cantidad de 
//dinero expresada en euros. A continuación, el programa le ofrecerá un menú al usuario en 
//el que le preguntará a qué divisa quiere convertir del dinero e imprimirá la conversión. Las 
//posibles divisas son las siguientes (se indica el tipo de cambio):  
//• Dólares (1 dólar = 0,88 euros)  eu / 0.88
//• Libra Esterlina (1 Libra = 1,20 euros)  eu / 1.20
//• Yen (1 yen = 0,0077 euros).  eu / 0.0077
//• Dólares Canadienses (1 dólar C. = 0,71 euros) eu / 0.71

public class Ej05 {
    public void main () {
        Scanner tec = new Scanner(System.in);
        double euros, resultado;
        int opcion;

        System.out.print("Ingrese numero de euros: ");
        euros = tec.nextDouble();
        
        System.out.println("Elige a que divisa quieres convertir");
        System.out.println("1. Dolares");
        System.out.println("2. Libra Esterlina");
        System.out.println("3. Yen");
        System.out.println("4. Dolares Canadienses");
        System.out.println("Elige una opcion: (del 1 al 4)");
        opcion = tec.nextInt();

        switch(opcion){
            case 1:
                resultado = euros / 0.88; 
                System.out.println( euros + " euros son " + resultado + " Dolares");
                break;
            case 2:
                resultado = euros / 1.20;
                System.out.println(euros + " euros son " + resultado + " Libras");
                break;
            case 3:
                resultado = euros / 0.0077;
                System.out.println(euros + " euros son " + resultado + " Yen");
                break;
            case 4:
                resultado = euros / 0.71;
                System.out.println(euros + " euros son " + resultado + " Dolares canadienses");
                break;

        }
        

        
    }
}
