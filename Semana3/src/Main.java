//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Ambitos para variables: private  public protected
    private String nombreCurso = "Desarrollo avanzado de Aplicaciones";
    public Integer credito = 5;

    //Protected:
    // Accesible por clases del mismo paquete
    // Accesible por clase de otros paquetes solo por herencia
    // Accesible por la misma clase

    protected Double precio = 3500.00;

    // Ambitos para clases solo se usa public

    public static void main(String[] args) {

    }

    private void Saludar(){
        System.out.println("Hola Mundo");
    }

    public void Despedirce(){
        System.out.println("Adios Mundo");
    }

    protected void Conversar(){
        System.out.println("Conversemos");
    }
}