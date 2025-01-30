import java.util.Scanner;
public class MultaVehiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Velocidad del Vehiculo");
        int velocidad = scanner.nextInt();
        if (velocidad<70){
            System.out.println("Sin sancion");
        } else if (velocidad>=71 && velocidad<=90) {
            System.out.println("Tendra que pagar 100 euros");
        } else if (velocidad>=91 && velocidad<=100) {
            System.out.println("Tendra que pagar 140 euros");
        }else {
            System.out.println("Tendra que pagar 200 euros");
        }
    }
}
