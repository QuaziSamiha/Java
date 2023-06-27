package thread;  // use of getPriority and setPriority method (11:06am,14 August,2020)

class Thread_Fifteen extends Thread{
    @Override
    public void run() {

    }
}

public class Thread_15 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority()); // main thread -> 5 (by default)
       // Thread.currentThread().setPriority(7); // setting main thread priority

        Thread_Fifteen ob = new Thread_Fifteen();
        ob.start();
        System.out.println(ob.getPriority());

        System.out.println(Thread.currentThread().getPriority()); // main thread -> 7
    }
}
