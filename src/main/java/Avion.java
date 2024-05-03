import java.util.*;

public class Avion extends Thread {
    //Atributos
    private String id;
    private Aeropuerto aeropuerto;
    private Random r;
    
    //Constructor

    public Avion(String id, Random r) {
        this.id = ((char)(r.nextInt(26) + 'A')) + ((char) (r.nextInt(26) + 'A')) + String.valueOf(r.nextInt(9999-0000+1)+0000);
        this.r = r;
    }
    
    
    //Métodos
    @Override
    public void run(){
        while(true){
            
        }
    }
    
}
