package thread;  // use of yield() method (11:51am,14 August,2020)

class Thread_Seventeen extends Thread{

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            System.out.println("Thread_Seventeen");
            Thread.yield(); // yield() method is a static method...so we can call it using class name
        }
    }
}


public class Thread_17 {
    public static void main(String[] args) {

        Thread_Seventeen ob = new Thread_Seventeen();

        ob.start();

        for (int i = 0; i < 5; i++) {

            System.out.println("main thread");
        }
    }
}
