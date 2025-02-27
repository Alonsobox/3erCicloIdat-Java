import model.Alumno;
import model.CicloAcademico;
import model.Curso;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Creado un objeto desde un costructor vacio
        Curso objCurso= new Curso();

        objCurso.setIdcurso(1);     // el metodo Set es para asignar parametro

        System.out.println(objCurso.getIdcurso());  // el metodo Get es para retornar la variable


        //Creando un objeto desde un costructor con parametros
        Curso objCurso2 = new Curso(2);
        System.out.println(objCurso2.getIdcurso());

        CicloAcademico objCiclo = new CicloAcademico(2,"dasd", LocalDate.now(),LocalDate.now());
        System.out.println(objCiclo.getIdCiclo());

        Alumno objAlumno = new Alumno();
        objAlumno.setId(123);
        objAlumno.setDni("7854");
        objAlumno.setNombre("Pachas");
        objAlumno.setApellido("La L");
        objAlumno.setEdad(32);

    }
}