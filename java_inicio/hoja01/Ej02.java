//Dados los lados de un rectangulo, calcular su perimetro y su area

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double base, altura, area, perimetro;

        System.out.print("Ingresa número de la base= ");
        base = tec.nextDouble();
        System.out.print("Ingresa número de la altura= ");
        altura = tec.nextDouble();
    
        perimetro = 2 * (base + altura);
        area = base * altura;

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area= " + area);
    }
}