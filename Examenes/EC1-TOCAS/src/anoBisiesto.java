import java.util.Scanner;

public class anoBisiesto {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un año: ");
        int ano = scanner.nextInt();

        if(calculo(ano)){
            System.out.println(ano + " es un año bisiesto");
        }else {
            System.out.println(ano+ " no es un año bisiesto");
        }
    }

    public static boolean calculo(int year){
        if (year % 4 ==0){
            if (year % 100==0){
                return year % 400==0;
            }else {
                return true;
            }
        }else {
            return false;
        }
    }

}
