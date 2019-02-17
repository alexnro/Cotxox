package org.lasencinas.conductoresTest;

import org.junit.Test;
import org.lasencinas.conductores.Conductor;
import org.lasencinas.conductores.PoolConductores;

import java.util.ArrayList;


public class PoolConductoresTest {

    @Test
    public void ConstructorTest() {

        ArrayList<Conductor> poolConductores = new ArrayList<>();
        Conductor conductor = null;

        String[] nombres = { "Samantha", "Fox" };
        for (String nombre : nombres) {
            conductor = new Conductor(nombre);
            poolConductores.add(conductor);
        }

        String[] matricula = { "4ABC123", "5DHJ234" };
        String[] modelos = { "Chevy Malibu", "Toyota Prius" };

        int index = 0;
        for (Conductor conductora : poolConductores) {
            conductora.setMatricula(matricula[index]);
            conductora.setModelo(modelos[index]);
            conductora.setValoracion((byte) 0);
            index++;
        }

        PoolConductores conductores = new PoolConductores(poolConductores);

        for (Conductor conductora : conductores.getPoolConductores()) {
            System.out.println(conductora.getNombre());
            System.out.println(conductora.getModeloCoche());
            System.out.println(conductora.getMatricula());
            System.out.println(conductora.getValoracionMedia());
        }
    }
}
