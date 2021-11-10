

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Buffer  {
    
    // Use BlockingQueue for bounded queues
    private final BlockingQueue<String> buffer;
    private GUIFrame gui;
    
    
    
    Buffer(int size, GUIFrame gui) {
        this.buffer = new ArrayBlockingQueue<>(size);
        this.gui = gui;
    }
    
    synchronized String consume(int id) {
        String product;
        
        while (this.buffer.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        product = this.buffer.remove();
        int result = -1;
        //TODO:- Agregar la lógica para calcular el resultado de la cadena de scheme.
        gui.completarTareaPorHacer();
        gui.anadirTareaRealizada(id, product, result);
        Buffer.print("Consumer consumed: " + product);
        notify();
        
        return product;
    }
    
    synchronized void produce(String product, int id) {
        while (this.buffer.remainingCapacity() == 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.buffer.add(product);
        gui.anadirTareaPorHacer(id, product);
       
        print("Producer produced: " + product);
        notify();
    }
    
    
    static int count = 1;
    synchronized static void print(String string) {
        System.out.print(count++ + " ");
        System.out.println(string);
    }
    
}

