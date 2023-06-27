package thread;  // use of setName() method (10:28am,14 August,2020)

class Thread_Thirteen extends Thread{ // Thread-0
    @Override
    public void run() {

    }
}

public class Thread_13 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()); // main = main thread name

        Thread_Thirteen ob = new Thread_Thirteen();

        ob.start();

        System.out.println(ob.getName());  // Thread-0
        System.out.println("i am child thread"); // changing Thread-0 name
        System.out.println(ob.getName()); // i am child thread = thread name after changing

        Thread.currentThread().setName("i am main thread"); // changing main thread name
        System.out.println(Thread.currentThread().getName());

//      int v = 100/0;
//      System.out.println(v);
    }
}

/*
main
Thread-0
i am child thread
Thread-0
i am main thread
Exception in thread "i am main thread" java.lang.ArithmeticException: / by zero
	at thread.Thread_13.main(Thread_13.java:26)

Process finished with exit code 1

 */