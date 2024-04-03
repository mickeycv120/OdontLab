package com.mickey.clinica.clinicaodontologica.Logica;

import java.util.Date;
import java.util.List;

public class Odontologo extends Persona{
    private int id_odontologo;
    private String especialidad;
    private List<Turno> lista_Turnos;
    private Usuario unUsuario;
    private Horario unHorario;

    public Odontologo() {
    }

    public Odontologo(String nombre, String apellido, String teléfono, String dirección, String gen, Date fecha_nac, int id_odontologo, String especialidad, List<Turno> lista_Turnos, Usuario unUsuario, Horario unHorario) {
        super(nombre, apellido, teléfono, dirección, gen, fecha_nac);
        this.id_odontologo = id_odontologo;
        this.especialidad = especialidad;
        this.lista_Turnos = lista_Turnos;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
    }

    public int getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getLista_Turnos() {
        return lista_Turnos;
    }

    public void setLista_Turnos(List<Turno> lista_Turnos) {
        this.lista_Turnos = lista_Turnos;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }
}
