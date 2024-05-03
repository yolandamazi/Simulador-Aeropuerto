import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

public class Aeropuerto {
    //Atributos
    private Random r;
    private String ciudad;
    private int pasajeros;
    private ArrayList<Avion> hangar = new ArrayList<>();
    private ArrayList<Avion> areaEstacionamiento = new ArrayList<>();
    private ArrayList<Avion> aerovia = new ArrayList<>();
    private ArrayList<Avion> areaRodaje = new ArrayList<>();
     
    //Puertas de embarque con estructura FIFO
    private Semaphore puertasLibres = new Semaphore(4, true);
    private Semaphore puertaEmbarque = new Semaphore(1, true);
    private Avion avionPuertaEmbarque;
    private Semaphore puertaDesembarque = new Semaphore(1, true);
    private Avion avionPuertaDesembarque;
    
    
    //Constructor
    public Aeropuerto(String ciudad) {
        this.ciudad = ciudad;
        this.r = new Random();
        
    }
    
    //Getters y Setters
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    

    public ArrayList<Avion> getHangar() {
        return hangar;
    }

    public void setHangar(ArrayList<Avion> hangar) {
        this.hangar = hangar;
    }

    public ArrayList<Avion> getAreaRodaje() {
        return areaRodaje;
    }

    public void setAreaRodaje(ArrayList<Avion> areaRodaje) {
        this.areaRodaje = areaRodaje;
    }

    public ArrayList<Avion> getAerovia() {
        return aerovia;
    }

    public void setAerovia(ArrayList<Avion> aerovia) {
        this.aerovia = aerovia;
    }
    
    
    //Metodos
    public void embarcar (Avion avion){
        try {
            if (avion.getEstado().equals("Embarque") && (puertaEmbarque.availablePermits() > 0)){
                puertaEmbarque.acquire();
                avionPuertaEmbarque = avion;
            } else {
                puertasLibres.acquire();
            }
            
            salirAreaEstacionamiento(avion);
            
            int intentos = 1;
            while ((avion.getCapacidadMaxima() > avion.getPasajeros()) && intentos <= 3){
                if (pasajeros <= (avion.getCapacidadMaxima()) - avion.getPasajeros()){
                    avion.setPasajeros(avion.getPasajeros() + pasajeros);
                    pasajeros = 0;
                    
                    // Tiempo de espera si no hay pasajeros suficientes
                    try{
                        avion.sleep(r.nextInt(5000-1000+1)+1000);
                    } catch (InterruptedException e){
                    }
                } else {
                    int subidaPasajeros = (avion.getCapacidadMaxima() - avion.getPasajeros());
                    avion.setPasajeros(avion.getPasajeros() + subidaPasajeros);
                    pasajeros -= subidaPasajeros;
                }
                
                // Tiempo de transferencia
                try{
                    avion.sleep(r.nextInt(3000-1000+1)+1000);
                } catch (InterruptedException e){
                }
                intentos++;
            }
            
            if (avion.getEstado().equals("Embarque") && (avion.getMyId().equals(avionPuertaEmbarque.getMyId()))){
                puertaEmbarque.release();
            } else {
                puertasLibres.release();
            }
            
        } catch (InterruptedException e){
        }
    }
    
    public void desembarcar (Avion avion){
        try{
            if (avion.getEstado().equals("Desembarque") && (puertaDesembarque.availablePermits() > 0)){
                puertaDesembarque.acquire();
            } else {
                puertasLibres.acquire();
            }
        } catch (InterruptedException e){
        }
    }
    
    public void entrarHangar (Avion avion){
        hangar.add(avion);
    }
    
    public void salirHangar (Avion avion) {
        hangar.remove(avion);
    }
    
    public void entrarAreaRodaje (Avion avion){
        areaRodaje.add(avion);
        //Comprobacion pilotos
        try{
            sleep(r.nextInt(5000-1000+1)+1000);
        } catch (InterruptedException e){
        }
    }
    
    public void salirAreaRodaje (Avion avion) {
        areaRodaje.remove(avion);
    }
    
    public void entrarAreaEstacionamiento (Avion avion){
        salirHangar(avion);
        areaEstacionamiento.add(avion);
        
    }
    
    public void salirAreaEstacionamiento (Avion avion) { 
        areaEstacionamiento.remove(avion);
    }
    
    public void entrarAerovia(Avion avion){
        aerovia.add(avion);
        // Quedarse en autovia
        try{
            sleep(r.nextInt(30000-15000+1)+15000);
        } catch (InterruptedException e){
        }
    }
    
    public void salirAerovia(Avion avion){
        aerovia.remove(avion);
    }
    
}