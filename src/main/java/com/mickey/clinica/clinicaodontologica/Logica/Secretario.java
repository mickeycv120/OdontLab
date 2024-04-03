package com.mickey.clinica.clinicaodontologica.Logica;

import java.util.Date;

public class Secretario extends Persona{
    private int id_secretario;
    private String sector;
    private Usuario unUsuario;

    public Secretario() {
    }

    public Secretario(String nombre, String apellido, String teléfono, String dirección, String gen, Date fecha_nac, int id_secretario, String sector, Usuario unUsuario) {
        super(nombre, apellido, teléfono, dirección, gen, fecha_nac);
        this.id_secretario = id_secretario;
        this.sector = sector;
        this.unUsuario = unUsuario;
    }

    public int getId_secretario() {
        return id_secretario;
    }

    public void setId_secretario(int id_secretario) {
        this.id_secretario = id_secretario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
}
