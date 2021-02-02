package Codes;

public class example2 {
    int numberOne = 20;
    int numberTwo = 20;

    public example2(){

    }

    public void runExample(){
        if (numberOne < numberTwo){
            System.out.println(numberOne+"" +
                    " es menor que:"+ numberTwo);
        }else if (numberTwo < numberOne){
            System.out.println(numberTwo+"" +
                    " es menor que:"+ numberOne);
        }else{
            System.out.println("Ambos numeros son" +
                    "iguales");
        }
    }
}
