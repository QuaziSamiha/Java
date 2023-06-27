package thread;  // overriding start() method  (8:06am,14 August,2020)

class Thread_Five extends Thread{

    @Override
    public void start() {

        super.start(); // starting thread

        System.out.println("start method"); // executing by main thread
    }

    @Override
    public void run() { // executing by child thread

        System.out.println("run method");
    }
}


public class Thread_5 {
    public static void main(String[] args) {

        Thread_Five object = new Thread_Five();

        object.start(); // // executing by main thread

        System.out.println("main method"); // executing by main thread
    }
}


