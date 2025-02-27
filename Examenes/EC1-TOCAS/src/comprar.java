import java.util.Scanner;

public class comprar {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese precio del articulo");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese cantidad de articulos");
        int cantidad = scanner.nextInt();
        double total=precio*cantidad;

        if (cantidad>10 && cantidad <= 20){
            total = total-(total*0.05);
            System.out.println("Ustede debe pagar: "+total);
        } else if (cantidad> 20) {
            total = total-(total*0.10);
            System.out.println("Ustede debe pagar: "+total);
        }
    }
}
