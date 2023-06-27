package thread; // (13 August,2020)

// in java main thread is created automatically

class Thread_one extends Thread{

    @Override
    public void run() { // override method of Thread class
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread");
        }
    }

    // task of this thread is to print 'child thread' five times
}


public class Thread_1 {
    public static void main(String[] args) {

        Thread_one object = new Thread_one(); // creating child thread object
        object.start(); //starting child thread (start() is a method of Thread class)

        for (int i = 0; i < 5; i++) { // part of main thread
            System.out.println("main thread");
        }
    }
}
// output will be change continuously