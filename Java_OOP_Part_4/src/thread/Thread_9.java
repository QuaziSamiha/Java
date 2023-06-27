package thread;  // Thread class constructor (9:30am,14 August,2020)

class Thread_Nine extends Thread{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}

public class Thread_9 {
    public static void main(String[] args) {

        Thread_Nine object = new Thread_Nine(); // by default a name will be created for thread

        object.start();

        System.out.println("main method");
    }
}
