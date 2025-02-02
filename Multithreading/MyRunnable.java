public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        
        // Using Lambda Expression (Modern approach)
        Thread lambdaThread = new Thread(() -> {
            System.out.println("Thread using lambda expression");
        });
        lambdaThread.start();
    }
}
