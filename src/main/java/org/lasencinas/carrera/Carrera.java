package org.lasencinas.carrera;

import org.lasencinas.tarifa.Tarifa;

public class Carrera {

    Tarifa tarifa = new Tarifa();

    /*------------ Variables -----------*/

    private double tiempoEsperado = 0;
    private double tiempoCarrera = 0;
    private double distanciaCarrera = 0;

    /*------------ Builders ------------*/

    public Carrera(){}

    /*----------- Getters -------------*/

    public double getTiempoEsperado() {
        return tiempoEsperado;
    }

    public double getTiempoCarrera() {
        return tiempoCarrera;
    }

    public double getDistanciaCarrera() {
        return distanciaCarrera;
    }
}
