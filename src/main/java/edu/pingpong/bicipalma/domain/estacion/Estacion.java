package edu.pingpong.bicipalma.domain.estacion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import edu.pingpong.bicipalma.domain.bicicleta.Movil;
import edu.pingpong.bicipalma.domain.tarjetausuario.Autenticacion;

public class Estacion {

    private final int  id;
    private final  String direccion;
    private final Anclajes anclaje;

    public Estacion(int id, String direccion, int numAnclajes){
        this.id = id;
        this.direccion = direccion;
        this.anclaje = new Anclajes(numAnclajes);
    }
    
    private int getId() {
        return id;
    }
    
    private String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "el id  es: " + Integer.toString(getId()) + "\n"+
                "la direccion es: " + getDireccion();
    }

    private Anclaje[] anclajes(){
        return this.anclaje.arrayAnclajes();
    }

    private int numAnclajes(){
        return this.anclaje.numAnclajes();
    }

    public void consultarEstacion(){
        System.out.println(this); //Muestra los SOLO los valores de los atributos de la clase.
    }

    public int anclajesLibre(){
        //return (int) Arrays.stream(anclajes()).filter(a ->!a.isOcupado()).count(); Hecho con un stream 
        int libres = 0;
        for (Anclaje i : anclajes() ){              //Recorre el Array anclajes()
            libres = i.isOcupado()? libres : ++ libres; //[Nombre de el contador] = [objeto.metodo()? ] si es TRUE ejecuta [esto] : si es falos ejecuta esto  [condadorr += ]    
        }
        return libres;
    }


    public void anclarBicicleta(Movil bici) {
		// insertar el objeto bicicleta en cualquier anclaje libre del array

		Optional<Anclaje> anclajeLibre = Arrays.stream(anclajes()).filter(a -> !a.isOcupado()).findAny();

		if (anclajeLibre.isPresent()) {
			anclajeLibre.get().anclarBici(bici);
		} else {
			System.out.println("No existen anclajes disponibles para bici " + bici);
		}
	}
         
    public boolean leerTarjetaUsuario(Autenticacion activada ){
        return activada.isActivada();
    }

    private void  mostrarBicicleta(Movil bici/*, int i**/){
        System.out.println(" Bicicleta : "+ bici.getId()/** +  "retirada del anclaje: " + i*/ );

    }

    private void mostrarAnclaje(Movil bici, int i){
        System.out.println("Bicicleta: "+ bici.getId() + "anclada en la posicion: " + i );



    }


    public void retirarBicicleta (Autenticacion activada){

        if (leerTarjetaUsuario(activada)) {

            Optional<Anclaje> anclajeOcupado = Arrays.stream(anclajes()).filter(Anclaje::isOcupado).findAny();

                if (anclajeOcupado.isPresent()) {

                    mostrarBicicleta(anclajeOcupado.get().getBici());
                    anclajeOcupado.get().liberarBici();

                } else {
                    System.out.println("No hay bicis");
                }
            
        } else {
            System.out.println("Tarjeta de usuario inactiva");
            }
    }

    public void consultarAnclajes(){
        for (Anclaje i  : anclajes()) {
            if (i.isOcupado()) {
                System.out.print("El anclaje esta ocupado por la bici: "+ getId());
                
            } else {
                System.out.print("El anclaje NO esta ocupado");       
            }
            
        }

    }
       

    
        


    
}
