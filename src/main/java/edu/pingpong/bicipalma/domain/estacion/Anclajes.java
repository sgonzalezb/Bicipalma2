package edu.pingpong.bicipalma.domain.estacion;

import java.util.concurrent.ThreadLocalRandom;

import edu.pingpong.bicipalma.domain.bicicleta.Movil;
import edu.pingpong.bicipalma.domain.estacion.Anclaje;

public class Anclajes{
    
    private final Anclaje[] anclajes;

    Anclajes(int numAnclajes){
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes(){
        for(int i = 0 ; i < anclajes.length ; i++ ){
            this.anclajes[i] = new Anclaje();
        }
    }


    public Anclaje [] arrayAnclajes(){
                    return this.anclajes;
    }

    int numAnclajes(){
        return anclajes.length;
    }

    
    @Override
    public String toString() {
        return "numero de anclajes es: " + Integer.toString(numAnclajes());
    }


    void ocuparAnclaje(int i, Movil bici){
        this.anclajes[i].anclarBici(bici); 
    }

    void liberarAnclaje(int i){
        this.anclajes[i].liberarBici();
    }

    boolean isAnclajeOcupado(int i){
        return this.anclajes[i].isOcupado();
    }

    Movil getBici(int i){
        return this.anclajes[i].getBici(); //Llama al metodo de la Clase Anclaje
    }

    int seleccionarAnclaje(){
        Integer idAnclaje = ThreadLocalRandom.current().nextInt(0, numAnclajes());
        return idAnclaje;
    }

}
