package thread;  // (6:19pm,14 August,2020)

// main thread and child thread is waiting for each other so output will be nothing (dead)

class Twenty_One extends Thread{

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
public class Thread_21 {
    public static void main(String[] args) throws InterruptedException {

        Twenty_One.variable = Thread.currentThread();

        Twenty_One t2 = new Twenty_One();

        t2.start();
        t2.join();

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
            Thread.sleep(3000);
        }
    }
}
