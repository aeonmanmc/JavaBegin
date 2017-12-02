package multithreading;

public class RunnableTest {

    public static void main(String[] args){

        Thread t1 = new Thread(new RunnableDemo("Thread 1"));
        t1.start();

        Thread t2 = new Thread(new RunnableDemo("Thread 2"));
        t2.start();

    }
}
