import Funciones.EjemplosMetodos;
import Funciones.SobreCarga;

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


        SobreCarga sobreCarga = new SobreCarga();
        //sobreCarga.multiplicar(15,12);
        //sobreCarga.multiplicar(15.5,18.2);
        Integer valor = sobreCarga.multiplicar(15,12,3);
        sobreCarga.imprimirMensaje((valor.toString()));


    }
}