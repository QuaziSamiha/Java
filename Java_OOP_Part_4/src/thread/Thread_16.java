package thread; // use of setPriority method (11:34am,14 August,2020)

// high priority thread executes first than low priority thread (but every system doesn't support it)

class Thread_Sixteen_1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread_Sixteen_1");
        }
    }
}

class Thread_Sixteen_2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread_Sixteen_2");
        }
    }
}

public class Thread_16 {
    public static void main(String[] args) {

        Thread_Sixteen_1 ob1 = new Thread_Sixteen_1();
        Thread_Sixteen_2 ob2 = new Thread_Sixteen_2();

        ob1.setPriority(8); // setting priority of thread Thread_Sixteen_1

        // priority of thread Thread_Sixteen_2 is 5 because main thread priority is 5 by default

        ob1.start();
        ob2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
    }
}
