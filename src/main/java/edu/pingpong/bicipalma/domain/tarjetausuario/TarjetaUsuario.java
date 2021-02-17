package edu.pingpong.bicipalma.domain.tarjetausuario;

public class TarjetaUsuario implements Autenticacion{

    private String id;
    private boolean activada;

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }


    @Override
    public boolean isActivada() {
        return this.activada;
    }

    @Override
    public String toString() {
        return this.id;
    }

    


    
}
