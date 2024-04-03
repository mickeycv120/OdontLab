package com.mickey.clinica.clinicaodontologica.Logica;

import java.util.Date;

public class Turno {

    private int id_turno;
    private Date fecha_turno;
    private String horaturno;
    private String affeccion;

    public Turno() {
    }

    public Turno(int id_turno, Date fecha_turno, String horaturno, String affeccion) {
        this.id_turno = id_turno;
        this.fecha_turno = fecha_turno;
        this.horaturno = horaturno;
        this.affeccion = affeccion;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public Date getFecha_turno() {
        return fecha_turno;
    }

    public void setFecha_turno(Date fecha_turno) {
        this.fecha_turno = fecha_turno;
    }

    public String getHoraturno() {
        return horaturno;
    }

    public void setHoraturno(String horaturno) {
        this.horaturno = horaturno;
    }

    public String getAffeccion() {
        return affeccion;
    }

    public void setAffeccion(String affeccion) {
        this.affeccion = affeccion;
    }
}
