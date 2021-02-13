// Librerias para el correcto funcionamiento del programa
import java.util.Scanner;
//Clases creadas para los ejemplos en la carpeta de Codes
import Codes.*;
//Códigos para el flujo correcto de la aplicación
import Codes.Validaciones.validareturn;

//Clase principal
public class Main {
    public static void main(String[] args) {
        //Declaración de objetos y variables de control para el flujo del programa
        Scanner input = new Scanner(System.in);
        validareturn V1 = new validareturn();
        char ValRef = '0';

        //Bucle de menu
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
                        "5.Multiplicación de 2 numeros\n" +
                        "6.Multiplicacion de n numeros\n" +
                        "7.Calculadora con sentencia switch\n" +
                        "8.Determinar si un numero es par o impar");

                ValRef = input.nextLine().charAt(0);
                switch (ValRef) {
                    case '1':
                        //ejemplo1
                        example1 E1 = new example1();
                        E1.runExample();
                        break;
                    case '2':
                        //Ejemplo2
                        example2 E2 = new example2();
                        E2.runExample();
                        break;
                    case '3':
                        //Ejemplo3
                        example3 E3 = new example3();
                        E3.runExample();
                        break;
                    case '4':
                        //Ejemplo4
                        example4 E4 = new example4();
                        E4.runExample();
                        break;
                    case '5':
                        //Ejemplo5
                        example5 E5 = new example5();
                        E5.runExample();
                        break;
                    case '6':
                        //Ejemplo6
                        example6 E6 = new example6();
                        E6.runExample();
                        break;
                    case '7':
                        example7 E7 = new example7();
                        E7.runExample();
                        break;
                    case '8':
                        example8 E8 = new example8();
                        E8.runExample();
                        break;
                    default:
                        System.out.println("Dato no valido para el sistema");
                        break;
                }
                ValRef = V1.valida();
            }
        }while(ValRef != 'E');
    }
}

