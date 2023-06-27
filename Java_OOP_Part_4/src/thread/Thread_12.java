package thread;  // use of getName() method (10:14am,14 August,2020)

class Thread_Twelve extends Thread{
    @Override
    public void run() {

    }
}


public class Thread_12 {
    public static void main(String[] args) {

        Thread_Twelve ob = new Thread_Twelve();

        ob.start();

        System.out.println(ob.getName()); // it will print new thread name
        System.out.println(Thread.currentThread().getName());
    }
}

// main = main thread name
// Thread-0 = thread name which is created