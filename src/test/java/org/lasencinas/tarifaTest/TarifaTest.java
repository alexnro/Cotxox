package org.lasencinas.tarifaTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.carrera.Carrera;
import org.lasencinas.tarifa.Tarifa;


public class TarifaTest {

    private Tarifa tarifa = null;
    private Carrera carrera = null;

    @Before
    public void init() {

        tarifa = new Tarifa();
        carrera = new Carrera();
    }

    @Test
    public void getCosteDistanciaTest() {

        assertEquals(10.46, tarifa.getCosteDistancia(7.75), 0.005);
    }

    @Test
    public void getCosteTiempoTest() {

        assertEquals(3.5, tarifa.getCosteTiempoMinutos(10), 0.5);
    }

    @Test
    public void getCosteTotalEsperado() {

        tarifa.getCosteDistancia(7.75);
        tarifa.getCosteTiempoMinutos(10);
        //TODO
//        assertEquals(13.96, tarifa.getCosteTotalEsperado(carrera), 0.5);
    }
}