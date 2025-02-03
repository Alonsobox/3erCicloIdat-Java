import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Tipo Variable nombreVariable = (Opcional) Valor;
        String cursoIdat = "Desarrollo Avanzado de Aplicaciones I";
        //Tipos de Variables primitivas
        int credito = 3;
        double precio = 1500.00;
        boolean activo = true;
        long numero = 10;
        float numeroFloat = 18f;
        //Tipos de Variables de clases
        Integer sesiones = 14;
        Double promedio = 18.5;
        Boolean predecesor = false;
        Long numeroLong = 15L;
        Float numeroClaseFloat = 25F;
        //Combinando tipos de variables
        int combinacion = credito + sesiones;
        /*
        System.out.println(cursoIdat);
        System.out.println("sesiones: " + combinacion);
        System.out.println("promedio: " + promedio);
        System.out.println("predecesor: " + predecesor);
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();
        System.out.println("Bienvenido " + nombre); */
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = input.nextInt();
        System.out.println(("Ingrese otro número: "));
        int num2 = input.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplica = num1 * num2;
        double division = num1 / num2;
        double residuo = num1 % num2;
        System.out.println("Suma " + suma);
        System.out.println("Resta " + resta);
        System.out.println("Multiplica " + multiplica);
        System.out.println("Divide " + division);
        //Conversiones utilizando Tipo Clase
        Integer numeroConvertido = Integer.parseInt("3");


    }
}