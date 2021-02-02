import java.util.Scanner;
import Codes.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ValRef = '0';
        do {
            if (ValRef == '0') {
                System.out.println("Ingresa una opción" +
                        " valida para el sistema:");
                ValRef = 'P';
            }else {
                System.out.println("1.Suma de 2 numeros\n" +
                        "2.Encontrar el numero mayor\n" +
                        "3.Calcular el factorial de un numero\n" +
                        "4.Comprobar si el numero es positivo o" +
                        "negativo \n" +
                        "5.Multiplicación de 2 numeros");

                ValRef = input.nextLine().charAt(0);
                switch (ValRef) {
                    case '1':
                        example1 E1 = new example1();
                        E1.runExample();
                        System.out.println("Enter para vovler al menu...\n" +
                                "'E' para salir");
                        ValRef = input.nextLine().charAt(0);
                        break;
                    case '2':
                        example2 E2 = new example2();
                        E2.runExample();
                        break;
                    case '3':
                        example3 E3 = new example3();
                        E3.runExample();
                        break;
                    case '4':
                        example4 E4 = new example4();
                        E4.runExample();
                        break;
                    case '5':
                        example5 E5 = new example5();
                        E5.runExample();
                        break;
                    default:
                        System.out.println("Dato no valido para el sistema");
                        break;
                }
            }
        }while(ValRef != 'E');
    }
}

