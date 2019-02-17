package org.lasencinas.conductores;

import java.util.ArrayList;
import java.util.List;

public class Conductor {

    private String nombre = null;
    private String modeloCoche = null;
    private String matricula = null;
    private int valoracionMedia = 0;
    private List<Integer> valoraciones = new ArrayList<Integer>();
    private boolean ocupado = false;

    public Conductor() {}

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public void setModeloCoche(String modeloCoche) {
        this.modeloCoche = modeloCoche;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setValoracion(int valoracion) {
        valoraciones.add(valoracion);
        int auxiliar = 0;
        for (int valor : valoraciones) {
            auxiliar += valor;
        }
        valoracionMedia = auxiliar / valoraciones.size()-1;
    }

    public String getModeloCoche() {
        return modeloCoche;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getValoracionMedia() {
        return valoracionMedia;
    }

    public List<Integer> getValoraciones() {
        return valoraciones;
    }
}
