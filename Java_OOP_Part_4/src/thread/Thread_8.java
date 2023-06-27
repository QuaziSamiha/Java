package thread;  // Thread class constructor (9:12am,14 August,2020)

class Thread_Eight extends Thread{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }

    Thread_Eight(String name){
        super(name);
    }
}

public class Thread_8 {
    public static void main(String[] args) {

        Thread_Eight object = new Thread_Eight("My_Thread_New_Name");

        object.start();

        System.out.println("main method");
    }
}
