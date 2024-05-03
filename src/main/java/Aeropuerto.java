import java.util.ArrayList;
import java.util.concurrent.*;

public class Aeropuerto {
    //Atributos
    private String ciudad;
    private int pasajeros;
    private ArrayList<Avion> hangar = new ArrayList<>();
    private ArrayList<Avion> areaRodaje = new ArrayList<>();
    private ConcurrentLinkedQueue<Avion> areaEstacionamiento = new ConcurrentLinkedQueue<>();
    private ArrayList<Avion> aerovia = new ArrayList<>();
    private Semaphore[] puertasLibres = new Semaphore[4];
    private Semaphore puertaEmbarque = new Semaphore(1);
    private Semaphore puertaDesembarque = new Semaphore(1);
    
    //Constructor

    public Aeropuerto(String ciudad, int pasajeros) {
        this.ciudad = ciudad;
        this.pasajeros = pasajeros;
        for (int i=0; i<4 ; i++){
            puertasLibres[i] = new Semaphore(1);
        }
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

    public ConcurrentLinkedQueue<Avion> getAreaEstacionamiento() {
        return areaEstacionamiento;
    }

    public void setAreaEstacionamiento(ConcurrentLinkedQueue<Avion> areaEstacionamiento) {
        this.areaEstacionamiento = areaEstacionamiento;
    }

    public ArrayList<Avion> getAerovia() {
        return aerovia;
    }

    public void setAerovia(ArrayList<Avion> aerovia) {
        this.aerovia = aerovia;
    }
    
    
    //Metodos
    public void entrarHangar (Avion avion){
        hangar.add(avion);
    }
    
    public void salirHangar (Avion avion) {
        hangar.remove(avion);
    }
    
    public void entrarAreaEstacionamiento (Avion avion){
        areaEstacionamiento.offer(avion);
        synchronized(areaEstacionamiento){
            areaEstacionamiento.notifyAll();
        }
    }
    
    public Avion salirAreaEstacionamiento () {
        Avion avion = areaEstacionamiento.poll();
        try {
            if (avion == null){
                synchronized(areaEstacionamiento){
                    areaEstacionamiento.wait();
                }
            }
        } catch (InterruptedException e){
        }
        return avion;
    }
    
    public void entrarPuertaEmbarque (){
        try {
            puertaEmbarque.acquire();
        } catch (InterruptedException e){
        }
    }
    
    public void salirPuertaEmbarque (){
        puertaEmbarque.release();
    }
    
    public void entrarPuertaDesembarque (){
        try {
            puertaDesembarque.acquire();
        } catch (InterruptedException e){
        }
    }
    
    public void salirPuertaDesembarque (){
        puertaDesembarque.release();
    }
    
    public int entrarPuertasLibres(){
        for (int i=0; i < puertasLibres.length ; i++){
            if (puertasLibres[i].tryAcquire()){
                return i;
            }
        }
        return -1;
    }
    
    public void salirPuertasLibres(int i){
        puertasLibres[i].release();
    }
    
}
