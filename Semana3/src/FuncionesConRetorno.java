public class FuncionesConRetorno {

    public String prepararCurso(){
        return "Curso en Elaboracion";
    }

    public Integer estadoCalificacion(){
        Double nota = 14.0;
        if(nota>=12.5){
            return "Alumno Aprobado";
        }else {
            return "Alumno Reprobado";
        }
    }
}
