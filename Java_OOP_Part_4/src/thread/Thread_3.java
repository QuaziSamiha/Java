package thread;  // overloading run() method (12:25am,14 August,2020)

class Thread_Three extends Thread{

    @Override
    public void run() {

        System.out.println("no arguments");
    }

    public void run(int i){

        System.out.println("with arguments");
    }
}


public class Thread_3 {
    public static void main(String[] args) {

        Thread_Three object = new Thread_Three();
        object.start();
        object.run(10); // main thread
    }
}

// output will be change continuously