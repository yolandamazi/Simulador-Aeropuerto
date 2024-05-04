import java.util.*;

public class Avion extends Thread {
    //Atributos
    private String id;
    private Aeropuerto aeropuertoOrigen;
    private Aeropuerto aeropuertoDestino;
    private int pasajeros;
    private int capacidadMaxima;
    private String estado; //embarque o desembarque
    private int vuelos;
    private Random r;
    
    //Constructor
    public Avion(Aeropuerto aeropuertoMadrid, Aeropuerto aeropuertoBarcelona) {
        this.r = new Random();
        
        String[] abecedario = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        String letra1 = String.valueOf(abecedario[r.nextInt(26)]);
        String letra2 = String.valueOf(abecedario[r.nextInt(26)]);
        String numeros = String.valueOf(r.nextInt(9999-0000+1)+0000);
        
        this.id = String.valueOf(letra1 + letra2 + "-" + numeros);
        
        if (Integer.parseInt(numeros)%2 == 0){
            this.aeropuertoOrigen = aeropuertoMadrid;
            this.aeropuertoDestino = aeropuertoBarcelona;
        } else {
            this.aeropuertoOrigen = aeropuertoBarcelona;
            this.aeropuertoDestino = aeropuertoMadrid;
        }
        
        this.capacidadMaxima = r.nextInt(300-100+1)+100;
        this.estado = null;
        this.pasajeros = 0;
        this.vuelos = 0;
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
        //Entrada inicial
            aeropuertoOrigen.entrarHangar(this);
            aeropuertoOrigen.salirHangar(this);
            
        while(true){
            // AEROPUERTO ORIGEN
                //Entrada Area de estacionamiento y Embarque
                aeropuertoOrigen.entrarAreaEstacionamiento(this);
                this.estado = "Embarque";
                aeropuertoOrigen.embarcar(this); // Cuando embarque, saldra del area de estacionamiento
                aeropuertoOrigen.salirEmbarque(this);
                
                //Area de Rodaje y buscar pista
                aeropuertoOrigen.entrarAreaRodaje(this);
                aeropuertoOrigen.entrarPistas(this);
                aeropuertoOrigen.salirAreaRodaje(this); //Cuando haya entrado a una pista, saldra del area de rodaje

                //Despejar y entrar a la aerovia
                aeropuertoOrigen.despegar(this); //Despegar implica salir de las pistas
                aeropuertoOrigen.entrarAerovia(this);
                
            //AEROPUERTO DESTINO
                //Aterrizar
                aeropuertoDestino.aterrizar(this); //Aterrizar implica salir de la aerovia y entrar a pistas de aeropuerto destino
                aeropuertoDestino.salirPistas(this);
                aeropuertoDestino.entrarAreaRodaje(this);
                try{
                    sleep(r.nextInt(30000-15000+1)+15000);
                } catch (InterruptedException e){
                }
                this.estado = "Desembarque";
                aeropuertoDestino.desembarcar(this);
                aeropuertoDestino.salirDesembarque(this);
                aeropuertoDestino.entrarAreaEstacionamiento(this);
                try{
                    sleep(r.nextInt(5000-1000+1)+1000);
                } catch (InterruptedException e){
                }
                
                if (vuelos == 15){
                    aeropuertoDestino.entrarTaller(this);
                    try{
                        sleep(r.nextInt(10000-5000+1)+5000);
                    } catch (InterruptedException e){
                    }
                    aeropuertoDestino.salirTaller(this);
                    vuelos = 0;
                } else {
                    aeropuertoDestino.entrarTaller(this);
                    try{
                        sleep(r.nextInt(5000-1000+1)+1000);
                    } catch (InterruptedException e){
                    }
                    aeropuertoDestino.salirTaller(this);
                    vuelos++;
                }
            
                if (r.nextDouble() > 0.5){
                    aeropuertoDestino.entrarHangar(this);
                    try{
                        sleep(r.nextInt(30000-15000+1)+15000);
                    } catch (InterruptedException e){
                    }
                    aeropuertoDestino.salirHangar(this);
                }
              
            this.pasajeros = 0;
            aeropuertoOrigen = aeropuertoDestino;
            aeropuertoDestino = aeropuertoOrigen;
        }
    }
}
