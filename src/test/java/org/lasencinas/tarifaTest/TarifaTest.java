package org.lasencinas.tarifaTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.lasencinas.tarifa.Tarifa;


public class TarifaTest {

    @Test
    public void gettersTest() {

        Tarifa tarifa = new Tarifa();

        assertEquals(1.35, tarifa.getCosteMilla(), 0);
        assertEquals(0.35, tarifa.getCosteMinuto(), 0);
        assertEquals(5, tarifa.getCosteMinimo());
        assertEquals(20, tarifa.getPorcentajeComision());
    }
}