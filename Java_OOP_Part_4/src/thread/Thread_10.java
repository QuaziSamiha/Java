package thread;  // Thread class constructor (9:32am,14 August,2020)

class Thread_Ten implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


public class Thread_10 {
    public static void main(String[] args) {

        Thread_Ten object_1 = new Thread_Ten();

        Thread object_2 = new Thread(object_1,"My_Thread_Name");

        object_2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
    }
}
