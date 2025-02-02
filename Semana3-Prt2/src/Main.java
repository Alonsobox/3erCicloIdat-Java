import Funciones.EjemplosMetodos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EjemplosMetodos ejemplosMetodos = new EjemplosMetodos();

        ejemplosMetodos.imprimirMensaje("Hola");

        int[] numeros= {15,10,12,13};
        Integer resultado =ejemplosMetodos.buscarEnLista(numeros, 13);
        ejemplosMetodos.imprimirMensaje(resultado.toString());

        // en nuestro arrreglo tenemos 15,10,12,13, intercambiamos la posicion 0(15), por la posicion 3(13)
        ejemplosMetodos.intercambiarDatos(numeros,0,3);

        ejemplosMetodos.ordenarLista(numeros);

    }
}