package org.lasencinas.tarifa;

import org.lasencinas.carrera.Carrera;

public class Tarifa {

    /*-------------- Variables -------------*/

    private double costeMilla = 1.35;
    private double costeMinuto = 0.35;
    private int costeMinimo = 5;
    private int porcentajeComision = 20;
    private double costeTotalEsperado = 0;
    private double costeDistancia = 0;
    private double costeTiempoMinutos = 0;

    /*-------------- Builders ----------------*/

    public Tarifa() {}

    /*---------------- Getters ------------------*/

    public double getCosteMilla() {
        return costeMilla;
    }

    public double getCosteMinuto() {
        return costeMinuto;
    }

    public int getCosteMinimo() {
        return costeMinimo;
    }

    public int getPorcentajeComision() {
        return porcentajeComision;
    }

    /*---------------- Getters with logic -----------*/

    public double getCosteDistancia(double distancia) {
        costeDistancia = getCosteMilla() * distancia;
        return costeDistancia;
    }

    public double getCosteTiempoMinutos(double tiempo) {
        costeTiempoMinutos = getCosteMinuto() * tiempo;
        return costeTiempoMinutos;
    }

    public double getCosteTotalEsperado(Carrera carrera) {
        costeTotalEsperado = getCosteDistancia(carrera.getDistanciaCarrera()) + getCosteTiempoMinutos(carrera.getTiempoCarrera());
        return costeTotalEsperado;
    }
}
