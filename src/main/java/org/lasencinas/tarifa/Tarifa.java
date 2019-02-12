package org.lasencinas.tarifa;

public class Tarifa {

    /*-------------- Variables -------------*/

    private double costeMilla = 1.35;
    private double costeMinuto = 0.35;
    private int costeMinimo = 5;
    private int porcentajeComision = 20;
    private double costeTotalEsperado = 0;

    /*-------------- Builders ----------------*/

    public Tarifa() {}

    public Tarifa(double costeMilla, double costeMinuto, int costeMinimo, int porcentajeComision) {
        this.costeMilla = costeMilla;
        this.costeMinuto = costeMinuto;
        this.costeMinimo = costeMinimo;
        this.porcentajeComision = porcentajeComision;
        this.costeTotalEsperado = costeTotalEsperado;
    }

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
}
