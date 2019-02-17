package org.lasencinas.carrera;

import org.lasencinas.conductores.Conductor;
import org.lasencinas.conductores.PoolConductores;
import org.lasencinas.tarifa.Tarifa;

public class Carrera {

    Conductor conductor = null;

    /*------------ Variables -----------*/

    private double tiempoEsperado = 0;
    private double tiempoCarrera = 0;
    private double distanciaCarrera = 0;
    private double costeTotal = 0;
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0;
    private double propinaTotal = 0;

    /*------------ Builders ------------*/

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    /*--------------------- Setters -------------------------*/

    public void setTiempoEsperado(double tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public void setTiempoCarrera(double tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
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
        return this.origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    public double getPropina() {
        return this.propinaTotal;
    }

    public double getCosteTotal() {
        return this.costeTotal;
    }

    /*------------ Logic -----------*/

    public void asignarConductor(PoolConductores conductores) {
        setConductor(conductores.asignarConductor());
    }

    public void realizarPago(double pago) {
        costeTotal = pago;
    }

    public void recibirPropina(double propina) {
        this.propinaTotal = propina;
    }

    public void liberarConductor() {
        getConductor().setOcupado(false);
    }
}
