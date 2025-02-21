package model;

public class Administrativo extends Persona {

    @Override
    public boolean registrarAsistencia(String codIdentiifcador, String fechaAsistencia, String HoraAsistencia, Boolean ValorAsistencia) {
        System.out.println("Aplicar logica "+"para asitencia del"+"Administrador");
        return true;
    }
}
