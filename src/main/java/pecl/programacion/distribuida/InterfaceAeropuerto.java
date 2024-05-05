package pecl.programacion.distribuida;

import pecl.programacion.concurrente.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface InterfaceAeropuerto extends Remote {
    
    int consultarNumeroPasajeros() throws RemoteException;
    int consultarNumeroAvionesHangar() throws RemoteException;
    int consultarNumeroAvionesTaller() throws RemoteException;
    int consultarNumeroAvionesEstacionamiento() throws RemoteException;
    int consultarNumeroAvionesRodaje() throws RemoteException;
    String consultarCiudad() throws RemoteException;
    
    String consultarColaAerovia() throws RemoteException;
    
    void controlarPista(int numeroPista, boolean estado) throws RemoteException;
    
}
