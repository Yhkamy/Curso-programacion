//Escribir un programa que dados dos puntos en el plano 𝐴(𝑥1,𝑦1) y 𝐵(𝑥2,𝑦2), imprima la distancia entre ambos(𝐴,𝐵) = √(𝑥2 − 𝑥1)2 +(𝑦2 − 𝑦1)2

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double x1, y1, x2, y2, dist;

        System.out.print("Ingresa la coordenada x del primer punto ");
        x1 = tec.nextDouble();
        System.out.print("Ingresa la coordenada y del primer punto ");
        y1 = tec.nextDouble();
        System.out.print("Ingresa la coordenada x del segundo punto ");
        x2 = tec.nextDouble();
        System.out.print("Ingresa la coordenada y del segundo punto ");
        y2 = tec.nextDouble();

        dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));
        
        System.out.print("La distancia entre ambos puntos es= " + dist);

    }
}