package multithreading;

public class RunnableDemo implements Runnable{

    private String name;

    public RunnableDemo(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Running " + name);
    }
}
