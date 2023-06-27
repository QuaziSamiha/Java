package thread;  // use of join() method(5:43pm,14 August,2020)

// main thread is waiting for child thread

class Thread_Eighteen extends Thread{
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


public class Thread_18 {
    public static void main(String[] args) throws InterruptedException {

        Thread_Eighteen t2 = new Thread_Eighteen();

        t2.start();
        t2.join(); // main thread will wait to execute until execution of child thread is end

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
    }
}
