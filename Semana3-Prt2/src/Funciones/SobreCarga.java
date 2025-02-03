package Funciones;

public class SobreCarga {

    public int multiplicar(int n1, int n2){
        return n1 * n2;
    }

    public double multiplicar(double n1, double n2){
        return n1*n2;

    }

    public int multiplicar(int n1, int n2, int n3){
        return n1 *n2 *n3;
    }

    public String asistencia(String codigoAlumno, Boolean valorAsistencia){
        return "Marcado de assitencia para el alumno";
    }

    public String asistencia(String codigoDocente, String horaMarcacion){
        return "Marcado de asitencia para docente";
    }


    public void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
