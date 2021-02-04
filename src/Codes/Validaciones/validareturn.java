package Codes.Validaciones;
import java.util.Scanner;

public class validareturn {
    char ValRef;

    public validareturn(){

    }

    public char valida(){
        Scanner input = new Scanner(System.in);
        System.out.println("'A' para vovler al menu...\n" +
                "'E' para salir");
        ValRef = input.nextLine().charAt(0);
        return ValRef;
    }
}
