import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
    //Atributos
    private String id;
    private int pasajeros;
    ArrayList<Avion> hangar = new ArrayList<>();
    ArrayList<Avion> areaRodaje = new ArrayList<>();
    ArrayList<Avion> areaEstacionamiento = new ArrayList<>();
    ArrayList<Avion> aerovía = new ArrayList<>();
    
    //Constructor
    public Aeropuerto(String id, int pasajeros) {
        this.id = id;
        this.pasajeros = pasajeros;
    }
    
    //Metodos
    public String getId() {
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
    
    
    
}
