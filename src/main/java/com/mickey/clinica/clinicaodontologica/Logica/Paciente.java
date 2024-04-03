package com.mickey.clinica.clinicaodontologica.Logica;

import java.util.Date;
import java.util.List;

public class Paciente extends Persona{

    private int id_paciente;
    private boolean tiene_OS;
    private String tipo_sangre;

    //Relación de objetos en java uno a uno
    private Responsable responsable;
    //Relación de objetos en java uno a n
    private List<Turno> lista_Turnos;



    public Paciente() {
    }

    public Paciente(String nombre, String apellido, String teléfono, String dirección, String gen, Date fecha_nac, int id_paciente, boolean tiene_OS, String tipo_sangre, Responsable responsable, List<Turno> lista_Turnos) {
        super(nombre, apellido, teléfono, dirección, gen, fecha_nac);
        this.id_paciente = id_paciente;
        this.tiene_OS = tiene_OS;
        this.tipo_sangre = tipo_sangre;
        this.responsable = responsable;
        this.lista_Turnos = lista_Turnos;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public boolean isTiene_OS() {
        return tiene_OS;
    }

    public void setTiene_OS(boolean tiene_OS) {
        this.tiene_OS = tiene_OS;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public List<Turno> getLista_Turnos() {
        return lista_Turnos;
    }

    public void setLista_Turnos(List<Turno> lista_Turnos) {
        this.lista_Turnos = lista_Turnos;
    }
}
