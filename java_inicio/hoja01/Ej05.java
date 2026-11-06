import java.util.Scanner;

public class Ej05 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double radio, volumen;

        System.out.print("Radio del circulo: ");
        radio = tec.nextDouble();

        volumen = 4. / 3 * Math.PI * Math.pow(radio, 3);

        System.out.print("Valumen= " + volumen);
    }
}