package multithreading;

public class ThreadTest {

    public static void main(String[] args){

        Thread t1 = new Thread(new ThreadDemo("Thread 1"));
        t1.start();

        Thread t2 = new Thread(new ThreadDemo("Thread 2"));
        t2.start();

    }
}
