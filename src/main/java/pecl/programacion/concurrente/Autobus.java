package pecl.programacion.concurrente;
import java.util.*;

public class Autobus extends Thread {
    //Atributos
    private String id;
    private int pasajeros;
    private String lugar;
    private Aeropuerto aeropuerto;
    private LogSistema logSistema;
    private Random r;
    
    //Constructor
    public Autobus(Aeropuerto aeropuertoMadrid, Aeropuerto aeropuertoBarcelona, LogSistema logSistema) {
        this.r = new Random();
        String numeros = String.valueOf(r.nextInt(9999-0000+1)+0000);
        this.id = "B-" + numeros;
        
        this.logSistema = logSistema;
        logSistema.escribirLog("Autobus: " + this.id + " es creado.");
        
        if (Integer.parseInt(numeros)%2 == 0){
            this.aeropuerto = aeropuertoMadrid;
        } else {
            this.aeropuerto = aeropuertoBarcelona;
        }
        
        this.pasajeros = pasajeros;
        this.lugar = lugar;
        this.aeropuerto = aeropuerto;
    }

    
    //GETTERS Y SETTERS
    public String getMyId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }
    
    
    
    //Métodos
    @Override
    public void run(){
        while (true){
            try {
                this.lugar = "Ciudad";
                this.pasajeros = r.nextInt(50-0+1)+0;
                this.sleep(r.nextInt(5000-2000+1)+2000);//Espera a que se suban
                aeropuerto.addTransferAeropuerto(this);//Estan en la ciudad de camino al aeropuerto
                this.sleep(r.nextInt(10000-5000+1)+5000);//De camino al aeropuerto
                aeropuerto.removeTransferAeropuerto(this);//Llegan al aeropuerto
                aeropuerto.dejarPasajeros(pasajeros);
                
                this.lugar = "Aeropuerto";
                this.pasajeros = 0;
                this.sleep(r.nextInt(5000-2000+1)+2000);//Esperando por pasajeros
                this.pasajeros = aeropuerto.cogerPasajeros(r.nextInt(50-0+1)+0);;
                aeropuerto.addTransferCiudad(this);//Estan en el aeropuerto de camino a la ciudad
                this.sleep(r.nextInt(10000-5000+1)+5000); //De camino a la ciudad
                this.pasajeros = 0;
                
                this.lugar = "Ciudad";
                aeropuerto.removeTransferCiudad(this);
            } catch (InterruptedException e){
            }
        }
    }
    
    
}
