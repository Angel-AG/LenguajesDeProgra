


import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {
    Buffer buffer;
    private final int sleepTime;
    
    Consumer(Buffer buffer, int sleepTime) {
        this.buffer = buffer;
        this.sleepTime = sleepTime;
    }
    
    @Override
    public void run() {
        System.out.println("Running Consumer...");
        String product;
        
        for(int i=0 ; i<5 ; i++) {
            product = this.buffer.consume();
            
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
