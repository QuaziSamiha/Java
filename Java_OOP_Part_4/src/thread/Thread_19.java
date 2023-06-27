package thread;  // use of join() method(5:55pm,14 August,2020)

// main thread is waiting for child thread

class Thread_Nineteen extends Thread{
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            System.out.println("child thread");
            try {
                Thread.sleep(10000);
            }
            catch (InterruptedException e){

            }
        }
    }
}


public class Thread_19 {
    public static void main(String[] args) throws InterruptedException {

        Thread_Nineteen t2 = new Thread_Nineteen();

        t2.start();
        t2.join(9000); // main thread will wait to execute 9000 milli sec execution

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
    }
}
