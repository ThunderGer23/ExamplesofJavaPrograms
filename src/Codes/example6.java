package Codes;
import java.util.Scanner;

public class example6 {

    int numberOne;
    int result = 1;
    int cant;

    public example6(){

    }

    public void runExample(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa la cantidad" +
                "de numeros a multiplicar:");

        cant = input.nextInt();

        for (int i = 0; i< cant; i++){
            System.out.println("Ingresa el numero " +
                    "a multiplicar:");
            numberOne = input.nextInt();
            result *= numberOne;
        }

        System.out.println("El resultado final es: " +
                "" + result);
    }
}
