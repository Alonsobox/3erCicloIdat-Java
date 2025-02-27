package model;

public class Docente extends Persona{

    @Override
    public boolean registrarAsistencia(String codIdentiifcador, String fechaAsistencia, String HoraAsistencia, Boolean ValorAsistencia) {
        System.out.println("Aplicar logica "+"para asitencia del"+"Docente");
        return true;
    }
}
