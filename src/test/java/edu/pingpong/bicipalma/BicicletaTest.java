package edu.pingpong.bicipalma;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.*;

import edu.pingpong.bicipalma.domain.bicicleta.Bicicleta;

public class BicicletaTest {
    
    private Bicicleta bici;
    

    @Before
    public void setBici(){
        Bicicleta bici = new Bicicleta(2);
        this.bici = bici;
    } 

    @Test
    public void constructorTest(){
        assertNotNull(this.bici);
    }

    @Test
    public void getIdTest(){
       assertEquals(2, bici.getId()); 
    }
    

}
