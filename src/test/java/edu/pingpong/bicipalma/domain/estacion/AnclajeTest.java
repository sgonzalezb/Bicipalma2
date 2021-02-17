package edu.pingpong.bicipalma.domain.estacion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import edu.pingpong.bicipalma.domain.bicicleta.Movil;
import edu.pingpong.bicipalma.domain.estacion.Anclaje;

public class AnclajeTest {

    Movil bici;

    @Test
    public void anclarBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(bici);
        assertTrue(anclaje.isOcupado());
    }

    @Test
    public void liberarbiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.liberarBici();
        assertFalse(anclaje.isOcupado());
    }
    
}
