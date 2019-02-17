package org.lasencinas.tarifa;

import org.lasencinas.carrera.Carrera;

public class Tarifa {

    private static double costeMilla = 1.35;
    private static double costeMinuto = 0.35;
    private static int costeMinimo = 5;
    private static int porcentajeComision = 20;
    private static double costeTotalEsperado = 0;
    private static double costeDistancia = 0;
    private static double costeTiempoMinutos = 0;


    public static double getCosteDistancia(double distancia) {
        costeDistancia = costeMilla * distancia;
        return costeDistancia;
    }

    public static double getCosteTiempoMinutos(double tiempo) {
        costeTiempoMinutos = costeMinuto * tiempo;
        return costeTiempoMinutos;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {
        costeTotalEsperado = getCosteDistancia(carrera.getDistancia()) + getCosteTiempoMinutos(carrera.getTiempoEsperado());
        if (costeTotalEsperado >= costeMinimo) {
            return costeTotalEsperado;
        } else {
            return costeMinimo;
        }
    }
}
