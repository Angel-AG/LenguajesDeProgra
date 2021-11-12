


import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {
    Buffer buffer;
    private final int sleepTime;
    private final int id;
    private boolean ban;
    
    Consumer(Buffer buffer, int sleepTime, int id) {
        this.buffer = buffer;
        this.sleepTime = sleepTime;
        this.id = id;
        this.ban = true;
    }
    
    @Override
    public void run() {
        System.out.println("Running Consumer...");
        String product;
        
        
        //TODO :- Cambiar este ciclo a un while que use una bandera que cambiar de valor al dar clic en Inicio/Detener(pendiente)
        while(ban) {
            product = this.buffer.consume(id);
            
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void ApagarProcesos(){
        this.ban = false;
    }
}
