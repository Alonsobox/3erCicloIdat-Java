package model;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Especialidad {

    public Integer idEspe;
    public String nomEspe;
    public Boolean estado;
    public LocalDate fechaCrea;

    public Especialidad(){

    }

    public Especialidad(Integer idEspe, String nomEspe, Boolean estado, LocalDate fechaCrea) {
        this.idEspe = idEspe;
        this.nomEspe = nomEspe;
        this.estado = estado;
        this.fechaCrea = fechaCrea;
    }

    public Integer getIdEspe() {
        return idEspe;
    }

    public void setIdEspe(Integer idEspe) {
        this.idEspe = idEspe;
    }

    public String getNomEspe() {
        return nomEspe;
    }

    public void setNomEspe(String nomEspe) {
        this.nomEspe = nomEspe;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(LocalDate fechaCrea) {
        this.fechaCrea = fechaCrea;
    }
}
