package org.lasencinas.conductoresTest;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.conductores.Conductor;

import static org.junit.Assert.assertEquals;


public class ConductorTest {

    Conductor conductor = null;

    @Before
    public void init(){
        conductor = new Conductor();
    }

    @Test
    public void gettersTest() {
        conductor.setModelo("Toyota");
        assertEquals("Toyota", conductor.getModeloCoche());

        conductor.setMatricula("77420");
        assertEquals("77420", conductor.getMatricula());
    }

    @Test
    public void setValoracionTest() {
        conductor.setValoracion(5.0);
        conductor.setValoracion(4.0);
        assertEquals(4.5, conductor.getValoracionMedia(), 0);
    }
}
