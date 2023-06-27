package thread;  // overloading run() method (12:25am,14 August,2020)

class Thread_Two extends Thread{

    @Override
    public void run() {
        System.out.println("no arguments");
    }

    public void run(int i){
        System.out.println("with arguments");
    }
}


public class Thread_2 {
    public static void main(String[] args) {

        Thread_Two object = new Thread_Two();
        object.start();
    }
}
