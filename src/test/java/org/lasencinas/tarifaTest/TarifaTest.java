package org.lasencinas.tarifaTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.tarifa.Tarifa;


public class TarifaTest {

    private Tarifa tarifa = null;

    @Before
    public void init() {

        tarifa = new Tarifa();
    }
    @Test
    public void gettersTest() {

        assertEquals(1.35, tarifa.getCosteMilla(), 0);
        assertEquals(0.35, tarifa.getCosteMinuto(), 0);
        assertEquals(5, tarifa.getCosteMinimo());
        assertEquals(20, tarifa.getPorcentajeComision());
    }

    @Test
    public void getCosteDistanciaTest() {

        assertEquals(10.46, tarifa.getCosteDistancia(7.75), 0.005);
    }
}