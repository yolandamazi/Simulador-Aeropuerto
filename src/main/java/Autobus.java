import java.util.*;

public class Autobus extends Thread {
    //Atributos
    private String id;
    private int pasajeros;
    private String lugar;
    private Aeropuerto aeropuerto;
    private Random r;
    
    //Constructor

    public Autobus(String id, int pasajeros, String lugar, Aeropuerto aeropuerto, Random r) {
        this.r = new Random();
        this.id = "B-" + String.valueOf(r.nextInt(9999-0000+1)+0000);
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
                Thread.sleep(r.nextInt(5000-2000+1)+2000);
                this.pasajeros = r.nextInt(50-0+1)+0;
                Thread.sleep(r.nextInt(10000-5000+1)+5000);
                
                this.lugar = "Aeropuerto";
                aeropuerto.setPasajeros(aeropuerto.getPasajeros() + pasajeros);
                Thread.sleep(r.nextInt(5000-2000+1)+2000);
                this.pasajeros = r.nextInt(50-0+1)+0;
                aeropuerto.setPasajeros(aeropuerto.getPasajeros() - pasajeros);
                Thread.sleep(r.nextInt(10000-5000+1)+5000);
                
                this.lugar = "Ciudad";
                this.pasajeros = 0;
            } catch (InterruptedException e){
            } finally {
            }
        }
    }
    
    
}
