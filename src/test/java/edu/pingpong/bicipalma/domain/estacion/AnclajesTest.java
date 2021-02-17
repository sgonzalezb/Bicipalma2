package edu.pingpong.bicipalma.domain.estacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import edu.pingpong.bicipalma.domain.bicicleta.Movil;
import edu.pingpong.bicipalma.domain.estacion.*;

import org.junit.Before;
import org.junit.Test;

public class AnclajesTest {

    Anclaje[] arrayAnclajes;
    Movil bici;
    
    @Test
    public void constructorTest(){
        Anclajes[] arrayAnclajes = new Anclajes[8]; // Crea un objeto de la clase  ANCLAJES que crea un array de objetos ANCLAJE
        assertNotNull(arrayAnclajes);
    }

    @Test
    public void lengthBici(){
        Anclajes[] arrayAnclajes = new Anclajes[8]; // Crea un objeto de la clase  ANCLAJES que crea un array de objetos ANCLAJE
        assertEquals(8, arrayAnclajes.length);
    }

    
}
