//Dado el radio de un círculo, calcular su perímetro y su área.

//PI
//Math.PI

//calculo de potencias base^exp
//Math.pow(base, exp)

//Calcula raíz cuadrada de num
//Math.sqrt(num)

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double radio, perimetro, area;

        System.out.print("Ingrese el radio del circulo= ");
        radio = tec.nextDouble();

        perimetro = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("Perimetro= " + perimetro);
        System.out.println("Area= " + area);
    }
}
