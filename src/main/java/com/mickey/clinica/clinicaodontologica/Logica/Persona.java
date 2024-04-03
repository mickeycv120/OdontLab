package com.mickey.clinica.clinicaodontologica.Logica;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private String teléfono;
    private String dirección;
    private String gen;
    private Date fecha_nac;

    public Persona() {
    }

    public Persona( String nombre, String apellido, String teléfono, String dirección, String gen, Date fecha_nac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.teléfono = teléfono;
        this.dirección = dirección;
        this.gen = gen;
        this.fecha_nac = fecha_nac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
}
