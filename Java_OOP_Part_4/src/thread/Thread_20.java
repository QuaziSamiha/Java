package thread;  // use of join() method (6:08pm,14 August,2020)

// child thread is waiting for main thread

class Thread_Twenty extends Thread{

    static Thread variable;

    @Override
    public void run() {

        try {
            variable.join();
        }
        catch (InterruptedException e){
        }

        for (int i = 0; i < 5; i++) {

            System.out.println("child thread");
        }
    }
}

public class Thread_20 {
    public static void main(String[] args) throws InterruptedException {

        Thread_Twenty.variable = Thread.currentThread();

        Thread_Twenty t2 = new Thread_Twenty();

        t2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
            Thread.sleep(3000);
        }
    }
}
