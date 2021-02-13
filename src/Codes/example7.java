package Codes;
import java.util.Scanner;

public class example7 {
    double numberOne;
    double numberTwo;
    char operator;
    double result;
    public example7(){

    }

    public void runExample(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        numberOne = input.nextDouble();
        System.out.println("Ingresa el segundo numero");
        numberTwo = input.nextDouble();
        System.out.println("Ingresa el operador");
        operator = input.next().charAt(0);

        switch (operator){
            case '+':
                result = numberOne+numberTwo;
                break;
            case '-':
                result = numberOne-numberTwo;
                break;
            case '*':
                result = numberOne*numberTwo;
                break;
            case '/':
                result = numberOne/numberTwo;
                break;
            default:
                System.out.println("Opción no valida para el sistema");
                break;
        }
        System.out.println(numberOne + " " + operator +
                " " + numberTwo + " = "+result);
    }
}
