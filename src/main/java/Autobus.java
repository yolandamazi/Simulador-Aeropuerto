import java.util.*;

public class Autobus extends Thread {
    //Atributos
    private String id;
    private int pasajeros;
    private String lugar;
    private Aeropuerto aeropuerto;
    private Random r;
    
    //Constructor
    public Autobus(Aeropuerto aeropuertoMadrid, Aeropuerto aeropuertoBarcelona) {
        this.r = new Random();
        String numeros = String.valueOf(r.nextInt(9999-0000+1)+0000);
        this.id = "B-" + numeros;
        
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
                Thread.sleep(r.nextInt(5000-2000+1)+2000);
                this.pasajeros = r.nextInt(50-0+1)+0;
                aeropuerto.addTransferAeropuerto(this);//Estan en la ciudad de camino al aeropuerto
                Thread.sleep(r.nextInt(10000-5000+1)+5000);
                aeropuerto.removeTransferAeropuerto(this);
                
                this.lugar = "Aeropuerto";
                int pasajerosLlegada = aeropuerto.dejarPasajeros(pasajeros);
                
                if (this.aeropuerto.getCiudad().equals("Madrid")){
                    aeropuerto.getMain().setjTextFieldPasajerosMadrid(String.valueOf(pasajerosLlegada));
                } else {
                    aeropuerto.getMain().setjTextFieldPasajerosBarcelona(String.valueOf(pasajerosLlegada));
                }
                
                Thread.sleep(r.nextInt(5000-2000+1)+2000);
                
                this.pasajeros = r.nextInt(50-0+1)+0;
                aeropuerto.addTransferCiudad(this);//Estan en el aeropuerto de camino a la ciudad
                int pasajerosIda = aeropuerto.cogerPasajeros(pasajeros);
                
                if (this.aeropuerto.getCiudad().equals("Madrid")){
                    aeropuerto.getMain().setjTextFieldPasajerosMadrid(String.valueOf(pasajerosIda));
                } else {
                    aeropuerto.getMain().setjTextFieldPasajerosBarcelona(String.valueOf(pasajerosIda));
                }
                
                Thread.sleep(r.nextInt(10000-5000+1)+5000);
                aeropuerto.removeTransferCiudad(this);
                
                this.lugar = "Ciudad";
                this.pasajeros = 0;
            } catch (InterruptedException e){
            }
        }
    }
    
    
}
