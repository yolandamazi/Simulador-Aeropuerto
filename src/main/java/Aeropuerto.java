import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

public class Aeropuerto {
    //ATRIBUTOS
    private Random r;
    private String ciudad;
    private int pasajeros;
    private ArrayList<Autobus> transfersCiudad = new ArrayList<>();
    private ArrayList<Autobus> transfersAeropuerto = new ArrayList<>();
    //Elementos sin limite
    private ArrayList<Avion> hangar = new ArrayList<>();
    private ArrayList<Avion> areaEstacionamiento = new ArrayList<>();
    private ArrayList<Avion> aerovia = new ArrayList<>();
    private ArrayList<Avion> areaRodaje = new ArrayList<>();
    //Taller
    private Lock lockTaller = new ReentrantLock();
    private Condition condTaller = lockTaller.newCondition();
    private LinkedBlockingQueue taller = new LinkedBlockingQueue(20);
    private LinkedBlockingQueue colaTaller = new LinkedBlockingQueue();
    //Gates con estructura FIFO
    private Semaphore puertasLibres = new Semaphore(4, true);
    private ArrayList<Avion> avionPuertasLibres = new ArrayList<>(4);
    private Semaphore puertaEmbarque = new Semaphore(1, true);
    private Avion avionPuertaEmbarque;
    private Semaphore puertaDesembarque = new Semaphore(1, true);
    private Avion avionPuertaDesembarque;
    //Pistas
    private Semaphore pistas[] = new Semaphore[4];
    private Avion avionPistas[] = new Avion[4];
    
    //CONSTRUCTOR
    public Aeropuerto(String ciudad) {
        this.ciudad = ciudad;
        this.r = new Random();
        this.pasajeros = 0;
        this.avionPuertaEmbarque = null;
        this.avionPuertaDesembarque = null;
        this.transfersAeropuerto = transfersAeropuerto;
        this.transfersCiudad = transfersCiudad;
        for (int i=0; i < pistas.length ; i++){
            pistas[i] = new Semaphore(1);
        }
        for (int i=0; i < avionPistas.length; i++){
            avionPistas[i] = null;
        }
    }
    
    //GETTERS Y SETTERS
    public ArrayList<Autobus> getTransfersCiudad() {
        return transfersCiudad;
    }

    public void setTransfersCiudad(ArrayList<Autobus> transfersCiudad) {
        this.transfersCiudad = transfersCiudad;
    }

    public ArrayList<Autobus> getTransfersAeropuerto() {
        return transfersAeropuerto;
    }

    public void setTransfersAeropuerto(ArrayList<Autobus> transfersAeropuerto) {
        this.transfersAeropuerto = transfersAeropuerto;
    }
    
    
    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

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

    public ArrayList<Avion> getAreaEstacionamiento() {
        return areaEstacionamiento;
    }

    public void setAreaEstacionamiento(ArrayList<Avion> areaEstacionamiento) {
        this.areaEstacionamiento = areaEstacionamiento;
    }

    public ArrayList<Avion> getAerovia() {
        return aerovia;
    }

    public void setAerovia(ArrayList<Avion> aerovia) {
        this.aerovia = aerovia;
    }

    public ArrayList<Avion> getAreaRodaje() {
        return areaRodaje;
    }

    public void setAreaRodaje(ArrayList<Avion> areaRodaje) {
        this.areaRodaje = areaRodaje;
    }

    public Lock getLockTaller() {
        return lockTaller;
    }

    public void setLockTaller(Lock lockTaller) {
        this.lockTaller = lockTaller;
    }

    public Condition getCondTaller() {
        return condTaller;
    }

    public void setCondTaller(Condition condTaller) {
        this.condTaller = condTaller;
    }

    public LinkedBlockingQueue getTaller() {
        return taller;
    }

    public void setTaller(LinkedBlockingQueue taller) {
        this.taller = taller;
    }

    public LinkedBlockingQueue getColaTaller() {
        return colaTaller;
    }

    public void setColaTaller(LinkedBlockingQueue colaTaller) {
        this.colaTaller = colaTaller;
    }

    public Semaphore getPuertasLibres() {
        return puertasLibres;
    }

    public void setPuertasLibres(Semaphore puertasLibres) {
        this.puertasLibres = puertasLibres;
    }

    public Semaphore getPuertaEmbarque() {
        return puertaEmbarque;
    }

    public void setPuertaEmbarque(Semaphore puertaEmbarque) {
        this.puertaEmbarque = puertaEmbarque;
    }

    public Avion getAvionPuertaEmbarque() {
        return avionPuertaEmbarque;
    }

    public void setAvionPuertaEmbarque(Avion avionPuertaEmbarque) {
        this.avionPuertaEmbarque = avionPuertaEmbarque;
    }

    public Semaphore getPuertaDesembarque() {
        return puertaDesembarque;
    }

    public void setPuertaDesembarque(Semaphore puertaDesembarque) {
        this.puertaDesembarque = puertaDesembarque;
    }

    public Avion getAvionPuertaDesembarque() {
        return avionPuertaDesembarque;
    }

    public void setAvionPuertaDesembarque(Avion avionPuertaDesembarque) {
        this.avionPuertaDesembarque = avionPuertaDesembarque;
    }

    public Semaphore[] getPistas() {
        return pistas;
    }

    public void setPistas(Semaphore[] pistas) {
        this.pistas = pistas;
    }

    public Avion[] getAvionPistas() {
        return avionPistas;
    }

    public void setAvionPistas(Avion[] avionPistas) {
        this.avionPistas = avionPistas;
    }
    
    
    
    //METODOS
    public void embarcar (Avion avion){
        try {
            if (avion.getEstado().equals("Embarque") && (puertaEmbarque.availablePermits() > 0)){
                puertaEmbarque.acquire();
                avionPuertaEmbarque = avion;
            } else {
                puertasLibres.acquire();
                
            }
            
            avion.getAeropuertoOrigen().salirAreaEstacionamiento(avion);
            
            int intentos = 1;
            while ((avion.getCapacidadMaxima() > avion.getPasajeros()) || intentos <= 3){
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
                
                // Tiempo de transferencia de pasajeros
                try{
                    avion.sleep(r.nextInt(3000-1000+1)+1000);
                } catch (InterruptedException e){
                }
                intentos++;
            }
            
            if (avion.getEstado().equals("Embarque") && (avion.getMyId().equals(avionPuertaEmbarque.getMyId()))){
                puertaEmbarque.release();
                avionPuertaEmbarque = null;
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
                avionPuertaDesembarque = avion;
            } else {
                puertasLibres.acquire();
            }
            
            salirAreaRodaje(avion);
            
            try{
                avion.sleep(r.nextInt(5000-1000+1)+1000);
            } catch (InterruptedException e){
            }
            
            
            pasajeros += avion.getPasajeros();
            avion.setPasajeros(0);
            
            if (avion.getEstado().equals("Desembarque") && (avion.getMyId().equals(avionPuertaDesembarque.getMyId()))){
                puertaDesembarque.release();
                avionPuertaDesembarque = null;
            } else {
                puertasLibres.release();
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
    }
    
    public void salirAreaRodaje (Avion avion) {
        areaRodaje.remove(avion);
    }
    
    public void entrarAreaEstacionamiento (Avion avion){
        areaEstacionamiento.add(avion);
        
    }
    
    public void salirAreaEstacionamiento (Avion avion) { 
        areaEstacionamiento.remove(avion);
    }
    
    public void entrarAerovia(Avion avion){
        aerovia.add(avion);
        // Quedarse en autovia
        try{
            avion.sleep(r.nextInt(30000-15000+1)+15000);
        } catch (InterruptedException e){
        }
    }
    
    public void salirAerovia(Avion avion){
        aerovia.remove(avion);
    }
    
    public void entrarPistas (Avion avion){
        synchronized(avion){
            //Esperar pistas disponibles
            try {
                while (pistas[0].availablePermits() + pistas[1].availablePermits() + pistas[2].availablePermits() + pistas[3].availablePermits() < 1){
                    avion.wait();
                }
            } catch (InterruptedException e){
            }
            //Entrar a la pista disponible
            if (pistas[0].tryAcquire()){
                avionPistas[0] = avion;
            } else if (pistas[1].tryAcquire()){
                avionPistas[1] = avion;
            } else if (pistas[2].tryAcquire()){
                avionPistas[2] = avion;
            } else if (pistas[3].tryAcquire()){
                avionPistas[3] = avion;
            }
            
            // Ultimas verificaciones antes de despegar
            try{
                avion.sleep(r.nextInt(3000-1000+1)+1000);
            } catch (InterruptedException e){
            } 
        }
    }
    
    public void despegar (Avion avion){
        synchronized(avion){
            // Proceso de despegue
            try{
                avion.sleep(r.nextInt(5000-1000+1)+1000);
            } catch (InterruptedException e){
            }
            if (avionPistas[0].getMyId().equals(avion.getMyId())){
                pistas[0].release();
            } else if (avionPistas[1].getMyId().equals(avion.getMyId())){
                pistas[1].release();
            } else if (avionPistas[2].getMyId().equals(avion.getMyId())){
                pistas[2].release();
            } else if (avionPistas[3].getMyId().equals(avion.getMyId())){
                pistas[3].release();
            }
            
            //Avisar salida pista
            avion.notify();
        }
    }
    
    public void aterrizar (Avion avion){
        try {
            synchronized (avion){
                //Esperar pista
                while (pistas[0].availablePermits() + pistas[1].availablePermits() + pistas[2].availablePermits() + pistas[3].availablePermits() < 1){
                    avion.wait(r.nextInt(5000-1000+1)+1000);
                }
                
                //Entrar pista
                if (pistas[0].tryAcquire()){
                    avionPistas[0] = avion;
                } else if (pistas[1].tryAcquire()){
                    avionPistas[1] = avion;
                } else if (pistas[2].tryAcquire()){
                    avionPistas[2] = avion;
                } else if (pistas[3].tryAcquire()){
                    avionPistas[3] = avion;
                }
                
                //Salir de la aerovia
                avion.getAeropuertoOrigen().salirAerovia(avion);
                
                //Aterrizar
                try{
                    avion.sleep(r.nextInt(5000-1000+1)+1000);
                } catch (InterruptedException e){
                }
            }
        } catch (InterruptedException e){
        }
    }
    
    public void salirPistas (Avion avion){
        synchronized (avion){
            //Abandonar Pista
            if (avionPistas[0].getMyId().equals(avion.getMyId())){
                pistas[0].release();
            } else if (avionPistas[1].getMyId().equals(avion.getMyId())){
                pistas[1].release();
            } else if (avionPistas[2].getMyId().equals(avion.getMyId())){
                pistas[2].release();
            } else if (avionPistas[3].getMyId().equals(avion.getMyId())){
                pistas[3].release();
            }
            
            // Avisar Pista Libre
            avion.notify();
        }
    }
    
    public void entrarTaller (Avion avion){
        lockTaller.lock();
        try {
            colaTaller.offer(avion);
            while(!colaTaller.peek().equals(avion) && (taller.size() >= 20)){
                condTaller.await();		
            }
            taller.offer(colaTaller.poll());
            condTaller.signalAll();
        } catch (InterruptedException e){
        } finally {
            lockTaller.unlock();
        }
    }
    
    public void salirTaller (Avion avion){
        lockTaller.lock();
        try {
            while(!taller.contains(avion)){
                condTaller.await();		
            }
            taller.remove(avion);
            condTaller.signalAll();
        } catch (InterruptedException e){
        } finally {
            lockTaller.unlock();
        }
    }
    
    public void addTransferCiudad(Autobus autobus){
        transfersCiudad.add(autobus);
    }
    
    public void removeTransferCiudad(Autobus autobus){
        transfersCiudad.remove(autobus);
    }
    
    public void addTransferAeropuerto(Autobus autobus){
        transfersAeropuerto.add(autobus);
    }
    
    public void removeTransferAeropuerto(Autobus autobus){
        transfersAeropuerto.remove(autobus);
    }
}