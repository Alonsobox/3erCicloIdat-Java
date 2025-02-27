package model;

import java.time.LocalDate;
import java.util.Calendar;

public class CicloAcademico {

    public Integer idCiclo;
    public String descripCiclo;



    public Integer getIdCiclo() {
        return idCiclo;
    }

    public CicloAcademico(Integer idCiclo, String descripCiclo, LocalDate fechaIni, LocalDate fechaFin) {
        this.idCiclo = idCiclo;
        this.descripCiclo = descripCiclo;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    public void setIdCiclo(Integer idCiclo) {
        this.idCiclo = idCiclo;
    }

    public String getDescripCiclo() {
        return descripCiclo;
    }

    public void setDescripCiclo(String descripCiclo) {
        this.descripCiclo = descripCiclo;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate fechaIni;
    public LocalDate fechaFin;
}
