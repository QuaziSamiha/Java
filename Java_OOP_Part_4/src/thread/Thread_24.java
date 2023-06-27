package thread;  // use of interrupt() method (7:25pm,14 August,2020)

// how a thread can interrupt another thread

class Twenty_Four extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("child thread");
                Thread.sleep(3000,100);
            }
        }
        catch (InterruptedException e){
            System.out.println("\ninterrupt");
        }
    }
}


public class Thread_24 {
    public static void main(String[] args) {

        Twenty_Four t = new Twenty_Four();

        t.start();
        t.interrupt(); // this line is executed by main thread

        System.out.println("main thread");
    }
}
