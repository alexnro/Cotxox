package org.lasencinas.conductores;

import java.util.ArrayList;
import java.util.List;

public class Conductor {

    private String nombre = null;
    private String modelo = null;
    private String matricula = null;
    private double valoracionMedia = 0;
    private List<Double> valoraciones = new ArrayList<>();
    private boolean ocupado = false;

    public Conductor() {}

    public Conductor(String nombreConductor) {
        this.nombre = nombreConductor;
    }

    public void setModelo(String modeloCoche) {
        this.modelo = modeloCoche;
    }

    public void setMatricula(String matriculaCoche) {
        this.matricula = matriculaCoche;
    }

    public void setOcupado(Boolean isOcupado) {
        this.ocupado = isOcupado;
    }

    public void setValoracion(double valoracion) {
        this.valoraciones.add(valoracion);
        double auxiliar = 0;
        for (double valor : this.valoraciones) {
            auxiliar += valor;
        }
        this.valoracionMedia = auxiliar / valoraciones.size();
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getModeloCoche() {
        return this.modelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public double getValoracionMedia() {
        return this.valoracionMedia;
    }

    public boolean isOcupado() {
        if (ocupado) {
            return true;
        } else {
            return false;
        }
    }
}
