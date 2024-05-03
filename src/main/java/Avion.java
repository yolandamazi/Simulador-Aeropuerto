import java.util.*;

public class Avion extends Thread {
    //Atributos
    private String id;
    private Aeropuerto aeropuerto;
    private int pasajeros;
    private Random r;
    
    //Constructor

    public Avion(String id, Random r) {
        this.id = ((char)(r.nextInt(26) + 'A')) + ((char) (r.nextInt(26) + 'A')) + String.valueOf(r.nextInt(9999-0000+1)+0000);
        this.r = new Random();
        this.aeropuerto = aeropuerto;
        this.pasajeros = pasajeros;
    }
    
    
    //Métodos
    @Override
    public void run(){
        while(true){
            aeropuerto.entrarHangar(this);
            aeropuerto.entrarAreaEstacionamiento(this);
            
            
        }
    }
}
