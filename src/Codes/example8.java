package Codes;
import java.util.Scanner;

public class example8 {
    int numberOne;

    public example8(){

    }

    public void runExample(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numberOne = input.nextInt();

        if(numberOne%2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }

    }
}
