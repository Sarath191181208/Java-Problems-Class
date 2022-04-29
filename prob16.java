public class prob16 {
    /**
     * Q: synchronisation
     */

    public static void main(String[] args) {
        Thread t1 = new Thread(new ViewCntIncThread());
        Thread t2 = new Thread(new ViewCntIncThread());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // e.printStackTrace(); // recommended
            // don't use useless exceptions
        }

        int noViews = Views.get_view_count();

        System.out.println("No of views: " + noViews);
    }

}

class Views {
    private static int view_count = 0;

    public static synchronized void add_viewer() {
        view_count++;
    }

    public static int get_view_count() {
        return view_count;
    }

}

class ViewCntIncThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++)
            Views.add_viewer();
    }

}