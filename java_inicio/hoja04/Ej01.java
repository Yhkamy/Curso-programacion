import java.util.Scanner;

//Calculadora de 4 operaciones. El usuario ingresa dos números y un carácter (+, -, *, / ) y el 
//programa debe mostrar la operación y su resultado. 
//Por ejemplo: 
//Ingrese valor: 12.5 
//Ingrese valor: 2 
//Ingrese operación: - 
//12.5 – 2 = 10.5 

public class Ej01 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        double num1, num2, resu;
        char operacion;

        System.out.print("Ingrese primer valor: ");
        num1 = tec.nextDouble();

        System.out.print("Ingrese segundo valor: ");
        num2 = tec.nextDouble();

        System.out.print("Ingrese operador (+,-,*,/): ");
        operacion = tec.next().charAt(0);

        switch(operacion){ 
            case '+':
                resu = num1 + num2;
                System.out.print(num1 + " + " + num2 + " = " + resu);
                break;
            case '-':
                resu = num1 - num2;
                System.out.print(num1 + " - " + num2 + " = " + resu);
                break;
            case '*':
                resu = num1 * num2;
                System.out.print(num1 + " * " + num2 + " = " + resu);
                break;
            case '/':
                resu = num1 / num2;
                System.out.print(num1 + " / " + num2 + " = " + resu);
                break;
        }

    }
}