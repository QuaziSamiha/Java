package thread;  // (6:26pm,14 August,2020)

// main thread waiting for main thread -> dead

public class Thread_22 {
    public static void main(String[] args) throws InterruptedException{

        Thread.currentThread().join();

        for (int i = 0; i < 5; i++) {

            System.out.println("main thread");
            Thread.sleep(3000);
        }
    }
}
