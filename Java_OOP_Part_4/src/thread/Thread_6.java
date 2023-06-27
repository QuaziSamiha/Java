package thread; // (8:16am,14 August,2020)

// restart same thread again is not possible

class Thread_Six extends Thread{

    @Override
    public void run() {

        System.out.println("run method");
    }
}


public class Thread_6 {
    public static void main(String[] args) {

        Thread_Six object = new Thread_Six();

        object.start();
        System.out.println("main method");
        object.start(); // restart same thread creates an error in output
    }
}
