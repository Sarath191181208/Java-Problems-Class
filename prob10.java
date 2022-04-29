public class prob10 {
    /**
     * Q: Threading using Runnable interface
     * links:
     * https://www.upgrad.com/blog/runnable-interface-in-java/
     * https://www.javatpoint.com/how-to-create-a-thread-in-java
     * https://www.javatpoint.com/runnable-interface-in-java
     * 
     */

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            SomeFunc thread = new SomeFunc('T' +
                    Integer.toString(i));
            Thread t = new Thread(thread);
            t.start();
        }
    }
}

class SomeFunc implements Runnable {
    private String name;

    public SomeFunc(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": From Thread: " + this.name);
        }
    }
}
