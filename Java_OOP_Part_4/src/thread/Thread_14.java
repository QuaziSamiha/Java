package thread;  // use of getPriority and setPriority method (10:55am,14 August,2020)

class Thread_Fourteen extends Thread{
    @Override
    public void run() {

    }
}


public class Thread_14 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority()); // 5 -> set by default

        Thread_Fourteen ob = new Thread_Fourteen();
        ob.setPriority(8);
        ob.start();
        System.out.println(ob.getPriority());
    }
}
