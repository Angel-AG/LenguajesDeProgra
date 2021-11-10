


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {
    Buffer buffer;
    private final int sleepTime;
    private final int floorVal;
    private final int ceilingVal;
    int id;
    
    private static final String OPERATIONS = "+-*/";
    
    Producer(Buffer buffer, int sleepTime, int floorVal, int ceilingVal, int id) {
        this.buffer = buffer;
        this.sleepTime = sleepTime;
        this.floorVal = floorVal;
        this.ceilingVal = ceilingVal;
        this.id = id;
    }
    
    @Override
    public void run() {
        System.out.println("Running Producer...");
        String product;

        //TODO :- Cambiar este ciclo a un while que use una bandera que cambiar de valor al dar clic en Inicio/Detener(pendiente)
        for(int i=0 ; i<1000 ; i++) {
            int idxOperation = ThreadLocalRandom.
                    current().nextInt(OPERATIONS.length());
            int firstNum = ThreadLocalRandom.
                    current().nextInt(floorVal, ceilingVal + 1);
            int secondNum = ThreadLocalRandom.
                    current().nextInt(floorVal, ceilingVal + 1);
            
            product = String.format("(%c %d %d)", 
                    OPERATIONS.charAt(idxOperation), firstNum, secondNum);
            this.buffer.produce(product, id);

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
