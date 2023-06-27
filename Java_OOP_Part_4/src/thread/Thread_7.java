package thread;  // creating thread by implementing Runnable interface (8:37am,14 August,2020)

class Thread_Seven implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread");
        }
    }
}

public class Thread_7 {
    public static void main(String[] args) {

        Thread_Seven object_1 = new Thread_Seven();

        Thread object_2 = new Thread(object_1); // creating object of Thread class because only it has start() method

        object_2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
    }
}


