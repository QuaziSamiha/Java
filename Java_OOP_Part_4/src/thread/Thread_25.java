package thread;  // use of interrupt() method (7:33pm,14 August,2020)

// how a thread can interrupt another thread

class Twenty_Five extends Thread{

    @Override
    public void run() {

        for (int i = 0; i < 20; i++) {
            System.out.println("child thread");
        }

        System.out.println("sleeping");

        try {

            Thread.sleep(3000,100);
        }
        catch (InterruptedException e){
            System.out.println("\ninterrupt");
        }
    }
}


public class Thread_25 {
    public static void main(String[] args) {

        Twenty_Five t = new Twenty_Five();

        t.start();
        t.interrupt(); // this line is executed by main thread

        System.out.println("main thread");
    }
}

