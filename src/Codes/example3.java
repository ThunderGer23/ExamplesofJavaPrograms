package Codes;

public class example3 {
    int number = 5;
    int result = 1;

    public example3(){

    }

    public void runExample(){
        System.out.println("El factorial" +
                "de "+number+" es:");
        for (int i = 1; i <= number; i++){
            result = result * i;
        }

        System.out.println(result);
    }
}
