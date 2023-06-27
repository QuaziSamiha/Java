package thread; // overriding start() method  (7:51am,14 August,2020)

class Thread_Four extends Thread{

    @Override
    public void start() {

        System.out.println("start method");
    }

    @Override
    public void run() { // run method doesn't execute here because no thread is started

        System.out.println("run method");
    }
}


public class Thread_4 {
    public static void main(String[] args) {

        Thread_Four object = new Thread_Four();

        object.start(); // working as a normal method since because of override so no thread is starting

        System.out.println("main method");
    }
}

// we should never override start method