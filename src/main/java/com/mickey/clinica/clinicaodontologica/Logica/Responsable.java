package com.mickey.clinica.clinicaodontologica.Logica;

import java.util.Date;

public class Responsable extends Persona{
    private int id_responsable;
    private String tipo_resp;

    public Responsable() {
    }

    public Responsable(String nombre, String apellido, String teléfono, String dirección, String gen, Date fecha_nac, int id_responsable, String tipo_resp) {
        super(nombre, apellido, teléfono, dirección, gen, fecha_nac);
        this.id_responsable = id_responsable;
        this.tipo_resp = tipo_resp;
    }

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getTipo_resp() {
        return tipo_resp;
    }

    public void setTipo_resp(String tipo_resp) {
        this.tipo_resp = tipo_resp;
    }
}
