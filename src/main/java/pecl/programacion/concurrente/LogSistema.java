package pecl.programacion.concurrente;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LogSistema {
    //ATRIBUTOS
    private String nombreArchivo = "evolucionAeropuerto.txt";
    private ReadWriteLock lockReadWrite = new ReentrantReadWriteLock();
    private Lock lockWrite = lockReadWrite.writeLock();
    
    private FileWriter fw;
    private BufferedWriter bw;
    private PrintWriter out;
    private LocalDateTime ahora;
    private DateTimeFormatter formatter;
    private String fechaHora;
    
    //CONSTRUCTOR
    public LogSistema(){
        
    }
    
    //METODOS
    public void escribirLog(String mensaje){
        lockWrite.lock();
        try {
            fw = new FileWriter(nombreArchivo, true);
            bw = new BufferedWriter(fw);
            out = new PrintWriter(bw);
            formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            ahora = LocalDateTime.now();
            fechaHora = formatter.format(ahora);
            
            out.println(fechaHora + " " + mensaje);
            
            out.flush();
        } catch (IOException e) {
        } finally {
            lockWrite.unlock();
        }
    }
    
    // Método para cerrar los recursos
    public void cerrar() {
        try {
            out.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
