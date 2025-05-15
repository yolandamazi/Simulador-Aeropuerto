package pecl.programacion.concurrente;


import java.util.concurrent.LinkedBlockingQueue;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;
import java.util.Random;


public class Aeropuerto{
    //ATRIBUTOS
    private Random r;
    private String ciudad;
    private Semaphore detencion;
    private Main main; 
    private LogSistema logSistema;
    private int pasajeros;
    private Lock lockPasajeros = new ReentrantLock();
 
    //Autobuses
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
    private Semaphore puertasLibres[] = new Semaphore[4];
    private Avion avionPuertasLibres[] = new Avion[4];
    private Semaphore puertaEmbarque = new Semaphore(1, true);
    private Avion avionPuertaEmbarque;
    private Semaphore puertaDesembarque = new Semaphore(1, true);
    private Avion avionPuertaDesembarque;
    private Semaphore colaPuertasEmbarque = new Semaphore(5, true);
    private Semaphore colaPuertasDesembarque = new Semaphore(5, true);
    
    //Pistas
    private Semaphore pistas[] = new Semaphore[4];
    private Avion avionPistas[] = new Avion[4];
    
    
    
    
    //CONSTRUCTOR
    public Aeropuerto(String ciudad, Main main, LogSistema logSistema, Semaphore detencion) {
        this.detencion = detencion;
        this.ciudad = ciudad;
        this.main = main;
        this.logSistema = logSistema;
        this.r = new Random();
        this.pasajeros = 0;
        this.hangar = hangar;
        this.avionPuertaEmbarque = avionPuertaEmbarque;
        this.avionPuertaDesembarque = avionPuertaDesembarque;
        this.transfersAeropuerto = transfersAeropuerto;
        this.transfersCiudad = transfersCiudad;
        for (int i=0; i < pistas.length ; i++){
            pistas[i] = new Semaphore(1);
        }
        for (int i=0; i < avionPistas.length; i++){
            avionPistas[i] = null;
        }
        for (int i=0; i < puertasLibres.length; i++){
            puertasLibres[i] = new Semaphore(1, true);;
        }
        for (int i=0; i < avionPuertasLibres.length; i++){
            avionPuertasLibres[i] = null;
        }
    }
    
    //GETTERS Y SETTERS
    public Lock getLockPasajeros() {
        return lockPasajeros;
    }

    public void setLockPasajeros(Lock lockPasajeros) {
        this.lockPasajeros = lockPasajeros;
    }

    public Avion[] getAvionPuertasLibres() {
        return avionPuertasLibres;
    }

    public void setAvionPuertasLibres(Avion[] avionPuertasLibres) {    
        this.avionPuertasLibres = avionPuertasLibres;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

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

    public Semaphore[] getPuertasLibres() {
        return puertasLibres;
    }

    public void setPuertasLibres(Semaphore[] puertasLibres) {
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
    public int cogerPasajeros(int nPasajeros){
        lockPasajeros.lock();
        try{
            if (pasajeros > nPasajeros){
                this.pasajeros -= nPasajeros;
            } else {
                nPasajeros = this.pasajeros;
                this.pasajeros = 0;
            }
            if (this.ciudad.equals("Madrid")){
                main.setjTextFieldPasajerosMadrid(String.valueOf(pasajeros));
            } else {
                main.setjTextFieldPasajerosBarcelona(String.valueOf(pasajeros));
            }
        } finally {
            lockPasajeros.unlock();
        }
        return nPasajeros;
    }
    
    public int dejarPasajeros (int nPasajeros){
        lockPasajeros.lock();
        try{
            this.pasajeros += nPasajeros;
            if (this.ciudad.equals("Madrid")){
                main.setjTextFieldPasajerosMadrid(String.valueOf(pasajeros));
            } else {
                main.setjTextFieldPasajerosBarcelona(String.valueOf(pasajeros));
            }
        } finally {
            lockPasajeros.unlock();
        }
        return nPasajeros;
    }
    
    public void embarcar (Avion avion){
        mirarDetencionAvion(avion);
        try {
            colaPuertasEmbarque.acquire();
            if (puertasLibres[0].tryAcquire()){
                colaPuertasDesembarque.acquire();
                avionPuertasLibres[0] = avion;
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate3Madrid("Embarque: " + avion.getMyId());
                } else {
                    main.setjTextFieldGate3Barcelona("Embarque: " + avion.getMyId());
                }
            } else if (puertasLibres[1].tryAcquire()){
                colaPuertasDesembarque.acquire();
                avionPuertasLibres[1] = avion;
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate4Madrid("Embarque: " + avion.getMyId());
                } else {
                    main.setjTextFieldGate4Barcelona("Embarque: " + avion.getMyId());
                }
            } else if (puertasLibres[2].tryAcquire()){
                colaPuertasDesembarque.acquire();
                avionPuertasLibres[2] = avion;
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate5Madrid("Embarque: " + avion.getMyId());
                } else {
                    main.setjTextFieldGate5Barcelona("Embarque: " + avion.getMyId());
                }
            } else if (puertasLibres[3].tryAcquire()){
                colaPuertasDesembarque.acquire();
                avionPuertasLibres[3] = avion;
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate6Madrid("Embarque: " + avion.getMyId());
                } else {
                    main.setjTextFieldGate6Barcelona("Embarque: " + avion.getMyId());
                }
            } else {
                puertaEmbarque.acquire();
                avionPuertaEmbarque = avion;
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate1Madrid("Embarque: " + avion.getMyId());
                } else {
                    main.setjTextFieldGate1Barcelona("Embarque: " + avion.getMyId());
                }
            } 
            
            
            avion.getAeropuertoOrigen().salirAreaEstacionamiento(avion);
            
            
            //SUBIR A LOS PASAJEROS
            int intentos = 1;
            avion.setPasajeros(this.cogerPasajeros(avion.getCapacidadMaxima()));
            //Tiempo de subida
            try{
                avion.sleep(r.nextInt(3000-1000+1)+1000);
            } catch (InterruptedException e){
            }
            
            while ((avion.getPasajeros() < avion.getCapacidadMaxima()) && (intentos <= 3)){
                //Tiempo de espera si no hay pasajeros suficientes
                try{
                    avion.sleep(r.nextInt(5000-1000+1)+1000);
                } catch (InterruptedException e){
                }
                
                avion.setPasajeros(this.cogerPasajeros((avion.getCapacidadMaxima()) - avion.getPasajeros()));
                
                // Tiempo de subida
                try{
                    avion.sleep(r.nextInt(3000-1000+1)+1000);
                } catch (InterruptedException e){
                }
                intentos++;
            }
            mirarDetencionAvion(avion);
        } catch (InterruptedException e){
        }
    }

    public void salirEmbarque(Avion avion){
        mirarDetencionAvion(avion);
            if (!(avionPuertaEmbarque == null) && avionPuertaEmbarque.getMyId().equals(avion.getMyId())){
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate1Madrid("");
                } else {
                    main.setjTextFieldGate1Barcelona("");
                }
                puertaEmbarque.release();
            } else if (avionPuertasLibres[0].getMyId().equals(avion.getMyId())){
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate3Madrid("");
                } else {
                    main.setjTextFieldGate3Barcelona("");
                }
                puertasLibres[0].release();
                colaPuertasDesembarque.release();
            } else if (avionPuertasLibres[1].getMyId().equals(avion.getMyId())){
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate4Madrid("");
                } else {
                    main.setjTextFieldGate4Barcelona("");
                }
                puertasLibres[1].release();
                colaPuertasDesembarque.release();
            } else if (avionPuertasLibres[2].getMyId().equals(avion.getMyId())){
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate5Madrid("");
                } else {
                    main.setjTextFieldGate5Barcelona("");
                }
                puertasLibres[2].release();
                colaPuertasDesembarque.release();
            } else if (avionPuertasLibres[3].getMyId().equals(avion.getMyId())){
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate6Madrid("");
                } else {
                    main.setjTextFieldGate6Barcelona("");
                }
                puertasLibres[3].release();
                colaPuertasDesembarque.release();
            }
            colaPuertasEmbarque.release();
            mirarDetencionAvion(avion);
    }
    
    public void desembarcar (Avion avion){
        mirarDetencionAvion(avion);
        try{
            colaPuertasDesembarque.acquire();
            if (puertasLibres[0].tryAcquire()){
                colaPuertasEmbarque.release();
                avionPuertasLibres[0] = avion;
                logSistema.escribirLog("Aeropuerto " + this.ciudad + " Avion " + avion.getMyId() +
                                        " accede a Embarque 3 para desembarcar " + avion.getPasajeros() + " pasajeros");
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate3Madrid("Desembarque: " + avion.getMyId());
                } else {
                    main.setjTextFieldGate3Barcelona("Desembarque: " + avion.getMyId());
                }
            } else if (puertasLibres[1].tryAcquire()){
                colaPuertasEmbarque.release();
                avionPuertasLibres[1] = avion;
                logSistema.escribirLog("Aeropuerto " + this.ciudad + " Avion " + avion.getMyId() + 
                                        " accede a Embarque 4 para desembarcar " + avion.getPasajeros() + " pasajeros");
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate4Madrid("Desembarque: " + avion.getMyId());
                } else {
                    main.setjTextFieldGate4Barcelona("Desembarque: " + avion.getMyId());
                }
            } else if (puertasLibres[2].tryAcquire()){
                colaPuertasEmbarque.release();
                avionPuertasLibres[2] = avion;
                logSistema.escribirLog("Aeropuerto " + this.ciudad + " Avion " + avion.getMyId() + 
                                        " accede a Embarque 5 para desembarcar " + avion.getPasajeros() + " pasajeros");
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate5Madrid("Desembarque: " + avion.getMyId());
                } else {
                    main.setjTextFieldGate5Barcelona("Desembarque: " + avion.getMyId());
                }
            } else if (puertasLibres[3].tryAcquire()){
                colaPuertasEmbarque.release();
                avionPuertasLibres[3] = avion;
                logSistema.escribirLog("Aeropuerto " + this.ciudad + " Avion " + avion.getMyId() +
                                        " accede a Embarque 6 para desembarcar " + avion.getPasajeros() + " pasajeros");
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate6Madrid("Desembarque: " + avion.getMyId());
                } else {
                    main.setjTextFieldGate6Barcelona("Desembarque: " + avion.getMyId());
                }
            } else {
                puertaDesembarque.acquire();
                avionPuertaDesembarque = avion;
                logSistema.escribirLog("Aeropuerto " + this.ciudad + " Avion " + avion.getMyId() +
                                        " accede a Embarque 2 para desembarcar " + avion.getPasajeros() + " pasajeros");
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldGate2Madrid("Desembarque: " + avion.getMyId());
                } else {
                    main.setjTextFieldGate2Barcelona("Desembarque: " + avion.getMyId());
                }
            }
            salirAreaRodaje(avion);
            mirarDetencionAvion(avion);
        } catch (InterruptedException e){
        }
    }
    public void salirDesembarque (Avion avion){
        mirarDetencionAvion(avion);
        try{
            this.dejarPasajeros(avion.getPasajeros());
            avion.sleep(r.nextInt(5000-1000+1)+1000);
        } catch (InterruptedException e){
        }
        avion.setPasajeros(0);
        if (!(avionPuertaDesembarque == null) && avionPuertaDesembarque.getMyId().equals(avion.getMyId())){
            if (this.ciudad.equals("Madrid")){
                main.setjTextFieldGate2Madrid("");
            } else {
                main.setjTextFieldGate2Barcelona("");
            }
            puertaDesembarque.release();
        } else if (avionPuertasLibres[0].getMyId().equals(avion.getMyId())){
            if (this.ciudad.equals("Madrid")){
                main.setjTextFieldGate3Madrid("");
            } else {
                main.setjTextFieldGate3Barcelona("");
            }
            puertasLibres[0].release();
            colaPuertasDesembarque.release();
        } else if (avionPuertasLibres[1].getMyId().equals(avion.getMyId())){
            if (this.ciudad.equals("Madrid")){
                main.setjTextFieldGate4Madrid("");
            } else {
                main.setjTextFieldGate4Barcelona("");
            }
            puertasLibres[1].release();
            colaPuertasDesembarque.release();
        } else if (avionPuertasLibres[2].getMyId().equals(avion.getMyId())){
            if (this.ciudad.equals("Madrid")){
                main.setjTextFieldGate5Madrid("");
            } else {
                main.setjTextFieldGate5Barcelona("");
            }
            puertasLibres[2].release();
            colaPuertasDesembarque.release();
        } else if (avionPuertasLibres[3].getMyId().equals(avion.getMyId())){
            if (this.ciudad.equals("Madrid")){
                main.setjTextFieldGate6Madrid("");
            } else {
                main.setjTextFieldGate6Barcelona("");
            }
            puertasLibres[3].release();
            colaPuertasDesembarque.release();
        }
        colaPuertasDesembarque.release();
        mirarDetencionAvion(avion);
    }
    
    public void entrarHangar (Avion avion){
        mirarDetencionAvion(avion);
        hangar.add(avion);
        if (this.ciudad.equals("Madrid")){
            main.setjTextFieldHangarMadrid(avion.getMyId() + " " + main.getjTextFieldHangarMadrid());
        } else {
            main.setjTextFieldHangarBarcelona(avion.getMyId() + " " + main.getjTextFieldHangarBarcelona());
        }
        mirarDetencionAvion(avion);
    }
    
    public void salirHangar (Avion avion) {
        mirarDetencionAvion(avion);
        hangar.remove(avion);
        if (this.ciudad.equals("Madrid")){
            main.setjTextFieldHangarMadrid(main.getjTextFieldHangarMadrid().replace(avion.getMyId()+" ", ""));
        } else {
            main.setjTextFieldHangarBarcelona(main.getjTextFieldHangarBarcelona().replace(avion.getMyId()+" ",""));
        }
        mirarDetencionAvion(avion);
    }
    
    public void entrarAreaRodaje (Avion avion){
        mirarDetencionAvion(avion);
        areaRodaje.add(avion);
        if (this.ciudad.equals("Madrid")){
            main.setjTextFieldRodajeMadrid(avion.getMyId() + " " + main.getjTextFieldRodajeMadrid());
        } else {
            main.setjTextFieldRodajeBarcelona(avion.getMyId() + " " + main.getjTextFieldRodajeBarcelona());
        }
        mirarDetencionAvion(avion);
    }
    
    public void salirAreaRodaje (Avion avion) {
        mirarDetencionAvion(avion);
        areaRodaje.remove(avion);
        if (this.ciudad.equals("Madrid")){
            main.setjTextFieldRodajeMadrid(main.getjTextFieldRodajeMadrid().replace(avion.getMyId()+" ", ""));
        } else {
            main.setjTextFieldRodajeBarcelona(main.getjTextFieldRodajeBarcelona().replace(avion.getMyId()+" ",""));
        }
        mirarDetencionAvion(avion);
    }
    
    public void entrarAreaEstacionamiento (Avion avion){
        mirarDetencionAvion(avion);
        areaEstacionamiento.add(avion);
        if (this.ciudad.equals("Madrid")){
            main.setjTextFieldAEstacionamientoMadrid(avion.getMyId() + " " + main.getjTextFieldAEstacionamientoMadrid());
        } else {
            main.setjTextFieldAEstacionamientoBarcelona(avion.getMyId() + " " + main.getjTextFieldAEstacionamientoBarcelona());
        }
        mirarDetencionAvion(avion);
    }
    
    public void salirAreaEstacionamiento (Avion avion) {
        mirarDetencionAvion(avion);
        areaEstacionamiento.remove(avion);
        if (this.ciudad.equals("Madrid")){
            main.setjTextFieldAEstacionamientoMadrid(main.getjTextFieldAEstacionamientoMadrid().replace(avion.getMyId()+" ", ""));
        } else {
            main.setjTextFieldAEstacionamientoBarcelona(main.getjTextFieldAEstacionamientoBarcelona().replace(avion.getMyId()+" ",""));
        }
        mirarDetencionAvion(avion);
    }
    
    public void entrarAerovia(Avion avion){
        mirarDetencionAvion(avion);
        aerovia.add(avion);
        if (this.ciudad.equals("Madrid")){
            main.setjTextFieldAeroviaMadrid(avion.getMyId() + "(" + avion.getPasajeros() + ") " + main.getjTextFieldAeroviaMadrid());
            logSistema.escribirLog("Aeropuerto " + this.ciudad + " Avion " + avion.getMyId() + "(" + avion.getPasajeros() + " pasajeros) entra a la aerovia Madrid-Barcelona");
        } else {
            main.setjTextFieldAeroviaBarcelona(avion.getMyId()+ "(" + avion.getPasajeros() + ") " + main.getjTextFieldAeroviaBarcelona());
            logSistema.escribirLog("Aeropuerto " + this.ciudad + " Avion " + avion.getMyId() + "(" + avion.getPasajeros() + " pasajeros) entra a la aerovia Barcelona-Madrid");
        }
        // Quedarse en autovia
        try{
            avion.sleep(r.nextInt(30000-15000+1)+15000);
        } catch (InterruptedException e){
        }
        mirarDetencionAvion(avion);
    }
    
    public void salirAerovia(Avion avion){
        mirarDetencionAvion(avion);
        aerovia.remove(avion);
        if (this.ciudad.equals("Madrid")){
            main.setjTextFieldAeroviaMadrid(main.getjTextFieldAeroviaMadrid().replace(avion.getMyId()+"("+avion.getPasajeros()+") ", ""));
        } else {
            main.setjTextFieldAeroviaBarcelona(main.getjTextFieldAeroviaBarcelona().replace(avion.getMyId()+"("+avion.getPasajeros()+") ",""));
        }
        mirarDetencionAvion(avion);
    }
    
    public void entrarPistas (Avion avion){
        mirarDetencionAvion(avion);
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
                logSistema.escribirLog("Aeropuerto " + this.ciudad + " Avion " + avion.getMyId() + "(" + avion.getPasajeros() +
                                        " pasajeros) accede a Pista 1 para despegue");
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldPista1Madrid("Despegue: " + avion.getMyId());
                } else {
                    main.setjTextFieldPista1Barcelona("Despegue: " + avion.getMyId());
                }
            } else if (pistas[1].tryAcquire()){
                avionPistas[1] = avion;
                logSistema.escribirLog("Aeropuerto " + this.ciudad + " Avion " + avion.getMyId() + "(" + avion.getPasajeros() +
                                        " pasajeros) accede a Pista 2 para despegue");
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldPista2Madrid("Despegue: " + avion.getMyId());
                } else {
                    main.setjTextFieldPista2Barcelona("Despegue: " + avion.getMyId());
                }
            } else if (pistas[2].tryAcquire()){
                avionPistas[2] = avion;
                logSistema.escribirLog("Aeropuerto " + this.ciudad + " Avion " + avion.getMyId() + "(" + avion.getPasajeros() +
                                        " pasajeros) accede a Pista 3 para despegue");
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldPista3Madrid("Despegue: " + avion.getMyId());
                } else {
                    main.setjTextFieldPista3Barcelona("Despegue: " + avion.getMyId());
                }
            } else if (pistas[3].tryAcquire()){
                avionPistas[3] = avion;
                logSistema.escribirLog("Aeropuerto " + this.ciudad + " Avion " + avion.getMyId() + "(" + avion.getPasajeros() +
                                        " pasajeros) accede a Pista 4 para despegue");
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldPista4Madrid("Despegue: " + avion.getMyId());
                } else {
                    main.setjTextFieldPista4Barcelona("Despegue: " + avion.getMyId());
                }
            }
            
            // Ultimas verificaciones antes de despegar
            try{
                avion.sleep(r.nextInt(3000-1000+1)+1000);
            } catch (InterruptedException e){
            } 
        }
        mirarDetencionAvion(avion);
    }
    
    public void despegar (Avion avion){
        mirarDetencionAvion(avion);
        synchronized(avion){
            // Proceso de despegue
            try{
                avion.sleep(r.nextInt(5000-1000+1)+1000);
            } catch (InterruptedException e){
            }
            if (avionPistas[0].getMyId().equals(avion.getMyId())){
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldPista1Madrid("");
                } else {
                    main.setjTextFieldPista1Barcelona("");
                }
                pistas[0].release();
            } else if (avionPistas[1].getMyId().equals(avion.getMyId())){
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldPista2Madrid("");
                } else {
                    main.setjTextFieldPista2Barcelona("");
                }
                pistas[1].release();
            } else if (avionPistas[2].getMyId().equals(avion.getMyId())){
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldPista3Madrid("");
                } else {
                    main.setjTextFieldPista3Barcelona("");
                }
                pistas[2].release();
            } else if (avionPistas[3].getMyId().equals(avion.getMyId())){
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldPista4Madrid("");
                } else {
                    main.setjTextFieldPista4Barcelona("");
                }
                pistas[3].release();
            }
            
            //Avisar salida pista
            avion.notify();
        }
        mirarDetencionAvion(avion);
    }
    
    public void aterrizar (Avion avion){
        mirarDetencionAvion(avion);
        try {
            synchronized (avion){
                //Esperar pista
                while (pistas[0].availablePermits() + pistas[1].availablePermits() + pistas[2].availablePermits() + pistas[3].availablePermits() < 1){
                    avion.wait(r.nextInt(5000-1000+1)+1000);
                }
                
                //Entrar pista
                if (pistas[0].tryAcquire()){
                    avionPistas[0] = avion;
                    if (this.ciudad.equals("Madrid")){
                        main.setjTextFieldPista1Madrid("Aterrizaje: " + avion.getMyId());
                    } else {
                        main.setjTextFieldPista1Barcelona("Aterrizaje: " + avion.getMyId());
                    }
                } else if (pistas[1].tryAcquire()){
                    avionPistas[1] = avion;
                    if (this.ciudad.equals("Madrid")){
                        main.setjTextFieldPista2Madrid("Aterrizaje: " + avion.getMyId());
                    } else {
                        main.setjTextFieldPista2Barcelona("Aterrizaje: " + avion.getMyId());
                    }
                } else if (pistas[2].tryAcquire()){
                    avionPistas[2] = avion;
                    if (this.ciudad.equals("Madrid")){
                        main.setjTextFieldPista3Madrid("Aterrizaje: " + avion.getMyId());
                    } else {
                        main.setjTextFieldPista3Barcelona("Aterrizaje: " + avion.getMyId());
                    }
                } else if (pistas[3].tryAcquire()){
                    avionPistas[3] = avion;
                    if (this.ciudad.equals("Madrid")){
                        main.setjTextFieldPista4Madrid("Aterrizaje: " + avion.getMyId());
                    } else {
                        main.setjTextFieldPista4Barcelona("Aterrizaje: " + avion.getMyId());
                    }
                }
                
                //Salir de la aerovia
                avion.getAeropuertoOrigen().salirAerovia(avion);
                
                //Aterrizar
                try{
                    avion.sleep(r.nextInt(5000-1000+1)+1000);
                } catch (InterruptedException e){
                }
            }
            mirarDetencionAvion(avion);
        } catch (InterruptedException e){
        }
    }
    
    public void salirPistas (Avion avion){
        mirarDetencionAvion(avion);
        synchronized (avion){
            //Abandonar Pista
            if (avionPistas[0].getMyId().equals(avion.getMyId())){
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldPista1Madrid("");
                } else {
                    main.setjTextFieldPista1Barcelona("");
                }
                pistas[0].release();
            } else if (avionPistas[1].getMyId().equals(avion.getMyId())){
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldPista2Madrid("");
                } else {
                    main.setjTextFieldPista2Barcelona("");
                }
                pistas[1].release();
            } else if (avionPistas[2].getMyId().equals(avion.getMyId())){
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldPista3Madrid("");
                } else {
                    main.setjTextFieldPista3Barcelona("");
                }
                pistas[2].release();
            } else if (avionPistas[3].getMyId().equals(avion.getMyId())){
                if (this.ciudad.equals("Madrid")){
                    main.setjTextFieldPista4Madrid("");
                } else {
                    main.setjTextFieldPista4Barcelona("");
                }
                pistas[3].release();
            }
            
            // Avisar Pista Libre
            avion.notifyAll();
        }
        mirarDetencionAvion(avion);
    }
    
    public void entrarTaller (Avion avion){
        mirarDetencionAvion(avion);
        lockTaller.lock();
        try {
            colaTaller.offer(avion);
            while(!colaTaller.peek().equals(avion) || (taller.size() >= 20)){
                condTaller.await();
            }
            taller.offer(colaTaller.poll());
            condTaller.signalAll();
        } catch (InterruptedException e){
        } finally {
            lockTaller.unlock();
            if (this.ciudad.equals("Madrid")){
                main.setjTextFieldTallerMadrid(avion.getMyId() + " " + main.getjTextFieldTallerMadrid());
            } else {
                main.setjTextFieldTallerBarcelona(avion.getMyId() + " " + main.getjTextFieldTallerBarcelona());
            }
        }
        mirarDetencionAvion(avion);
    }
    
    public void salirTaller (Avion avion){
        mirarDetencionAvion(avion);
        lockTaller.lock();
        try {
            while(!taller.contains(avion)){
                condTaller.await();		
            }
            taller.remove(avion);
            if (this.ciudad.equals("Madrid")){
                main.setjTextFieldTallerMadrid(main.getjTextFieldTallerMadrid().replace(avion.getMyId()+" ", ""));
            } else {
                main.setjTextFieldTallerBarcelona(main.getjTextFieldTallerBarcelona().replace(avion.getMyId()+" ",""));
            }
            condTaller.signalAll();
        } catch (InterruptedException e){
        } finally {
            lockTaller.unlock();
        }
        mirarDetencionAvion(avion);
    }
    
    public void addTransferCiudad(Autobus autobus){
        mirarDetencionAutobus(autobus);
        transfersCiudad.add(autobus);
        if (autobus.getAeropuerto().ciudad.equals("Madrid")){
            main.setjTextFieldTransfersCiudadMadrid(autobus.getMyId() + "(" + autobus.getPasajeros() + ") " + main.getjTextFieldTransfersCiudadMadrid());
        } else {
            main.setjTextFieldTransfersCiudadBarcelona(autobus.getMyId() + "(" + autobus.getPasajeros() + ") " + main.getjTextFieldTransfersCiudadBarcelona());
        }
        mirarDetencionAutobus(autobus);
    }
    
    public void removeTransferCiudad(Autobus autobus){
        mirarDetencionAutobus(autobus);
        transfersCiudad.remove(autobus);
        if (autobus.getAeropuerto().ciudad.equals("Madrid")){
                main.setjTextFieldTransfersCiudadMadrid(main.getjTextFieldTransfersCiudadMadrid().replace(autobus.getMyId() + "(" + autobus.getPasajeros() + ") ", ""));
        } else {
                main.setjTextFieldTransfersCiudadBarcelona(main.getjTextFieldTransfersCiudadMadrid().replace(autobus.getMyId() + "(" + autobus.getPasajeros() + ") ",""));
        }
        mirarDetencionAutobus(autobus);
    }
    
    public void addTransferAeropuerto(Autobus autobus){
        mirarDetencionAutobus(autobus);
        transfersAeropuerto.add(autobus);
        if (autobus.getAeropuerto().ciudad.equals("Madrid")){
            main.setjTextFieldTransfersAeropuertoMadrid(autobus.getMyId() + "(" + autobus.getPasajeros() + ") " + main.getjTextFieldTransfersAeropuertoMadrid());
        } else {
            main.setjTextFieldTransfersAeropuertoBarcelona(autobus.getMyId() + "(" + autobus.getPasajeros() + ") " + main.getjTextFieldTransfersAeropuertoBarcelona());
        }
        mirarDetencionAutobus(autobus);
    }
    
    public void removeTransferAeropuerto(Autobus autobus){
        mirarDetencionAutobus(autobus);
        transfersAeropuerto.remove(autobus);
        if (autobus.getAeropuerto().ciudad.equals("Madrid")){
                main.setjTextFieldTransfersAeropuertoMadrid(main.getjTextFieldTransfersAeropuertoMadrid().replace(autobus.getMyId() + "(" + autobus.getPasajeros() + ") ", ""));
        } else {
                main.setjTextFieldTransfersAeropuertoBarcelona(main.getjTextFieldTransfersAeropuertoMadrid().replace(autobus.getMyId() + "(" + autobus.getPasajeros() + ") ",""));
        }
        mirarDetencionAutobus(autobus);
    }
    
    public void mirarDetencionAutobus (Autobus autobus){
        while ((detencion.availablePermits() == 0)){
            synchronized (autobus){
                try {
                    autobus.wait();
                } catch (InterruptedException e){
                }
            }
        }
    }
    
    public void mirarDetencionAvion (Avion avion){
        while ((detencion.availablePermits() == 0)){
            synchronized (avion){
                try {
                    avion.wait();
                } catch (InterruptedException e){
                }
            }
        }
    }
}
