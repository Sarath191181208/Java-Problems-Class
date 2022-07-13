public class test {
    public static void main(String[] args) {
        test obj = new test();
        System.out.println(obj.hashCode());
        obj = null;

        // calling garbage collector
        System.gc();
    }

    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}