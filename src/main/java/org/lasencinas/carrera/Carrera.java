package org.lasencinas.carrera;

import org.lasencinas.conductores.Conductor;
import org.lasencinas.tarifa.Tarifa;

public class Carrera {

    Tarifa tarifa = new Tarifa();

    /*------------ Variables -----------*/

    private double tiempoEsperado = 0;
    private double tiempoCarrera = 0;
    private double distanciaCarrera = 0;
    private double costeTotal = 0;
    Conductor conductor = new Conductor();
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0;
    private double costeEsperado = 0;

    /*------------ Builders ------------*/

    public Carrera(){}

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

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

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getCosteEsperado() {
        return costeEsperado;
    }

    /*------------ Logic -----------*/

}
