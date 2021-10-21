


public class ProducerConsumer {

    public static void main(String[] args) {
        
        
    }

    public void start() {
        Buffer buffer = new Buffer();
        
        Producer producer = new Producer(buffer);
        producer.start();
        
        Consumer consumer = new Consumer(buffer);
        consumer.start();
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
