package multithreading;

public class ThreadDemo extends Thread {

    private String name;

    public ThreadDemo(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Running " + name);
    }
}
