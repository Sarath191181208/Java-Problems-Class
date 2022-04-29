public class prob5 {
    /**
     * Q : Wrapper classes and methods
     * Java is a OOPS lang but int isn't an object therefore
     * using Integer Object is recomended in modules ...
     * something like that.
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        int a = 5;
        // Integer intObj = Integer.valueOf(a);
        Integer intObj = a;

        if (intObj instanceof Integer) {
            System.out.println("intObj is an instance of Integer");
        }
        print_spacer(20);
        System.out.println("IMP! Remember");
        System.out.println(ANSI_RED + "Remember Java passes an object into by value." + ANSI_RESET);
        checkIsIntInstance(intObj, "Int Object");
        checkIsIntInstance(a, "int");
    }

    private static void print_spacer(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
    }

    private static void checkIsIntInstance(Object obj, String name) {
        if (obj instanceof Integer) {
            System.out.println(name + ": Is an Integer Object");
        } else {
            System.out.println(name + ": Is Not Integer Object");
        }
    }

}
