import java.util.*;

public class Avion extends Thread {
    //Atributos
    private String id;
    private Aeropuerto aeropuertoOrigen;
    private Aeropuerto aeropuertoDestino;
    private int pasajeros;
    private int capacidadMaxima;
    private String estado; //embarque o desembarque
    private Random r;
    
    //Constructor
    public Avion(Aeropuerto aeropuertoOrigen, Aeropuerto aeropuertoDestino) {
        
        String letra1 = String.valueOf(r.nextInt(26) + 'A');
        String letra2 = String.valueOf(r.nextInt(26) + 'A');
        String numeros = String.valueOf(r.nextInt(9999-0000+1)+0000);
        
        this.id = String.valueOf(letra1 + letra2 + "-" + numeros);
        this.r = new Random();
        this.capacidadMaxima = r.nextInt(300-100+1)+100;
        this.estado = estado;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
        this.pasajeros = pasajeros;
    }
    
    //Getters y Setters
    public String getMyId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public Aeropuerto getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }

    public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    public Aeropuerto getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    //Métodos
    @Override
    public void run(){
        while(true){
            aeropuertoOrigen.entrarHangar(this);
            aeropuertoOrigen.entrarAreaEstacionamiento(this);
            aeropuertoOrigen.embarcar(this);
            aeropuertoOrigen.entrarAreaRodaje(this);
            //acceder a pista origen y despegar
            aeropuertoOrigen.salirAreaRodaje(this);
            aeropuertoOrigen.entrarAerovia(this);
            //acceder pista destino y aterrizar
            aeropuertoOrigen.salirAerovia(this);
            
            
            
        }
    }
}
