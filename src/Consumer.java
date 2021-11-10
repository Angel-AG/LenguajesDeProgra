


import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {
    Buffer buffer;
    private final int sleepTime;
    private final int id;
    
    Consumer(Buffer buffer, int sleepTime, int id) {
        this.buffer = buffer;
        this.sleepTime = sleepTime;
        this.id = id;
    }
    
    @Override
    public void run() {
        System.out.println("Running Consumer...");
        String product;
        
        //TODO :- Cambiar este ciclo a un while que use una bandera que cambiar de valor al dar clic en Inicio/Detener(pendiente)
        for(int i=0 ; i<1000 ; i++) {
            product = this.buffer.consume(id);
            
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
