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
        
        System.out.println("Autobus:" + id);
        
        if (Integer.parseInt(numeros)%2 == 0){
            this.aeropuerto = aeropuertoMadrid;
        } else {
            this.aeropuerto = aeropuertoBarcelona;
        }
        
        this.pasajeros = pasajeros;
        this.lugar = lugar;
        this.aeropuerto = aeropuerto;
    }
    
    
    //Métodos
    @Override
    public void run(){
        while (true){
            try {
                this.lugar = "Ciudad";
                aeropuerto.addTransferAeropuerto(this);//Estan en la ciudad de camino al aeropuerto
                Thread.sleep(r.nextInt(5000-2000+1)+2000);
                this.pasajeros = r.nextInt(50-0+1)+0;
                Thread.sleep(r.nextInt(10000-5000+1)+5000);
                aeropuerto.removeTransferAeropuerto(this);
                
                this.lugar = "Aeropuerto";
                aeropuerto.addTransferCiudad(this);//Estan en el aeropuerto de camino a la ciudad
                aeropuerto.setPasajeros(aeropuerto.getPasajeros() + pasajeros);
                Thread.sleep(r.nextInt(5000-2000+1)+2000);
                this.pasajeros = r.nextInt(50-0+1)+0;
                aeropuerto.setPasajeros(aeropuerto.getPasajeros() - pasajeros);
                Thread.sleep(r.nextInt(10000-5000+1)+5000);
                aeropuerto.removeTransferCiudad(this);
                
                this.lugar = "Ciudad";
                this.pasajeros = 0;
            } catch (InterruptedException e){
            } finally {
            }
        }
    }
    
    
}
