package edu.pingpong.bicipalma;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.bicipalma.domain.tarjetausuario.TarjetaUsuario;

public class TarjetaUsuarioTest {

    TarjetaUsuario tarjeta;

    @Before
    public void setTarjeta(){
        TarjetaUsuario tarjeta = new TarjetaUsuario("258545", false);
        this.tarjeta = tarjeta;
    }

    @Test
    public void constructorTest(){
        assertNotNull(this.tarjeta);
    }

    @Test
    public void isActivadaTest(){
        assertEquals(false, tarjeta.isActivada());
    }

    @Test
    public void setActivadaTest(){
        tarjeta.setActivada(true);
        assertEquals(true, tarjeta.isActivada());
    }
    
}
