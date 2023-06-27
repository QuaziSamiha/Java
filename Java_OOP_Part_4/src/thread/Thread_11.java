package thread;  // currentThread() method (9:48am,14 August,2020)

class Thread_Eleven extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}


public class Thread_11 {
    public static void main(String[] args) {

        Thread_Eleven object_1 = new Thread_Eleven();
        Thread_Eleven object_2 = new Thread_Eleven();

        object_1.start();
        object_2.start();

        System.out.println(Thread.currentThread());
    }
}


// Thread-0,Thread-1 are thread name given by JVM by default