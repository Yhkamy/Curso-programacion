import java.util.Scanner;

public class Ej04 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double base, altura, area;

        System.out.print("Medida base: ");
        base = tec.nextDouble();
        System.out.print("Medida altura: ");
        altura = tec.nextDouble();

        area = (base * altura) / 2;

        System.out.print("Area: " + area);
    }
}