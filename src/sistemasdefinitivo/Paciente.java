/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasdefinitivo;

/**
 *
 * @author USER
 */
public class Paciente extends Persona{
    private Habitacion habitacion;
    private String diagnostico;
    private Medico medico;
    private Turno turno;
    private Seguro seguro;
    private Receta receta;
    private double cuenta;
    private int estado;

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }
    
    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
    public String getEstado(){
        String estado1="";
        switch(this.estado){
            case 1:
                estado1="Sano";
                break;
            case 2:
                estado1="Enfermo";
                break;
            case 3:
                estado1="Critico";
                break;
        }
        return estado1;
    }
    
    public void setEstado(int estado){
        this.estado=estado;
    }
    
    public Paciente(int estado){
        super();
        this.estado=estado;
        this.receta=new Receta();
        this.seguro=new Seguro();
    } 
}
