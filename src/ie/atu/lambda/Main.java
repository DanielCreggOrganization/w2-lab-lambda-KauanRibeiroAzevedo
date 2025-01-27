package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        
        Runnable runnable = () -> System.out.println("Hello from the thread");

        Thread thread = new Thread(runnable);
        thread.start();

        
        try {
            thread.join();  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



