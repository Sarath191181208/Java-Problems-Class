import java.util.concurrent.Executors;

public class prob29 {

    static int stu_id = 0;

    public static Student create_student(Store store_obj) {
        stu_id++;
        return new Student(store_obj, stu_id);
    }

    public static void main(String[] args) {
        var c = new Store(100);
        var p1 = new Manager(c, 1);
        var c1 = new Student(c, 1);
        // var c2 = new Student(c, 2);
        var executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 5; i++) {
            executor.submit(create_student(c));
        }

        p1.start();
        // c1.start();
    }
}

class Store {
    private int capacity;
    private int contents;

    public Store(int capacity) {
        this.capacity = capacity;
    }

    public synchronized int fetch(int num_items) {
        while (isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        contents -= num_items;
        notifyAll();
        return contents;
    }

    public synchronized boolean isEmpty() {
        return contents == 0;
    }

    public synchronized boolean isFilled() {
        return contents == this.capacity;
    }

    public synchronized void fill() {
        while (isFilled()) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        contents = 100;
        notifyAll();
    }

}

class Student extends Thread {
    private Store cubbyhole;
    private int number;

    public Student(Store c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        while (true) {
            value = cubbyhole.fetch(5);
            System.out.println("Student #" + this.number + " got: " + value);
            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
    }
}

class Manager extends Thread {
    private Store cubbyhole;
    private int number;

    public Manager(Store c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        while (true) {
            cubbyhole.fill();
            System.out.println("-------------------  ");
            System.out.println("Manager #" + " filled: ");
            System.out.println("-------------------  ");

            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
    }
}