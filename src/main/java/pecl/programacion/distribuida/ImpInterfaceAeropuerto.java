package pecl.programacion.distribuida;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import pecl.programacion.concurrente.Avion;
import pecl.programacion.concurrente.Aeropuerto;

public class ImpInterfaceAeropuerto  extends UnicastRemoteObject implements InterfaceAeropuerto {
    private Aeropuerto aeropuerto;
    
    //CONSTRUCTOR
    public ImpInterfaceAeropuerto(Aeropuerto aeropuerto) throws RemoteException {
        this.aeropuerto = aeropuerto;
    }
    
    //METODOS
    @Override
    public int consultarNumeroPasajeros() throws RemoteException {
        return aeropuerto.getPasajeros();
    }

    @Override
    public int consultarNumeroAvionesHangar() throws RemoteException {
        return aeropuerto.getHangar().size();
    }

    @Override
    public int consultarNumeroAvionesTaller() throws RemoteException {
        return aeropuerto.getTaller().size();
    }

    @Override
    public int consultarNumeroAvionesEstacionamiento() throws RemoteException {
        return aeropuerto.getAreaEstacionamiento().size();
    }

    @Override
    public int consultarNumeroAvionesRodaje() throws RemoteException {
        return aeropuerto.getAreaRodaje().size();
    }

    @Override
    public String consultarCiudad() throws RemoteException{
        return aeropuerto.getCiudad();
    }
    
    @Override
    public String consultarColaAerovia() throws RemoteException {
        ArrayList<Avion> aerovia = aeropuerto.getAerovia();
        String stringAeroviaBarcelona = "";
        for (int i=0; i < aerovia.size(); i++){
                stringAeroviaBarcelona = stringAeroviaBarcelona + aerovia.get(i).getMyId() + "(" + aerovia.get(i).getPasajeros() + ") ";
            }
        return stringAeroviaBarcelona;
    }

    @Override
    public void controlarPista(int numeroPista, boolean abrir) throws RemoteException {
        if (!abrir) {
            aeropuerto.getPistas()[numeroPista].acquireUninterruptibly();
        } else { 
            aeropuerto.getPistas()[numeroPista].release();
        }
    }
   
}
