import java.util.Scanner;

    public class promedio {
        public static void main(String[] args) {
            Scanner scarnner =  new Scanner(System.in);
            System.out.println("Ingrese la primera nota");
            int nota1 = scarnner.nextInt();
            System.out.println("Ingrese la segunda nota");
            int nota2 = scarnner.nextInt();
            System.out.println("Ingrese la tercera nota");
            int nota3 = scarnner.nextInt();
            int promedio=0;
            promedio = (nota1+nota2+nota3)/3;
            System.out.println("Promedio es: "+ promedio);
            if (promedio>=70){
                System.out.println("Aprueba");
            }else {
                System.out.println("Desaprueba");
            }
        }
}
