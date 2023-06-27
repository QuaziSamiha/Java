package thread;  // use of sleep() method (6:40pm,14 August,2020)

public class Thread_23 {
    public static void main(String[] args) throws InterruptedException{

        for (int i = 0; i < 5; i++) {

            System.out.println("presentation : " +(i+1));
            Thread.sleep(3000,100); // use to pause thread
        }
    }
}
