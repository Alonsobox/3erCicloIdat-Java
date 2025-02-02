package Funciones;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemplosMetodos {


    public void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }


    //int[] lista = {45,10,23,2
    //lista.length = 4
    public int buscarEnLista(int[] lista, int valor){
        for (int i=0; i < lista.length; i++){
            if(lista[i] == valor){
                return i;
            }
        }
        return  -1;
    }

    //int[] lista = {45,10,23,2
    //indiceInicial==1 indiceFinal ==3
    //int[] lista = {45,2,23,10
    public void intercambiarDatos(int[] lista, int indiceValorInicial, int indiceValorCambiar){
        int temporal = lista[indiceValorInicial];
        lista[indiceValorInicial] = lista[indiceValorCambiar];
        lista[indiceValorCambiar]=temporal;
        //System.out.println(Arrays.toString(lista));
    }

    public void ordenarLista(int[] lista){

        for (int i = 0; i< lista.length -1; i++){
            for (int j = i+1; j< lista.length; j++){
                if (lista[i]> lista[j]){
                    intercambiarDatos(lista,i,j);
                }
            }
        }
        System.out.println(Arrays.toString(lista));
    }
}
