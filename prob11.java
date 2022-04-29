public class prob11 {
    /**
     * Q: Exceptional handling using predefined exceptions
     * links:
     * 
     * https://www.geeksforgeeks.org/java-exception-handling-predefined-exceptions/
     * https://www.javatpoint.com/exception-handling-in-java
     * https://www.upgrad.com/blog/exception-handling-java/
     */

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0 };

        for (int i : arr) {
            try {
                System.out.println(100 / i);
            } catch (ArithmeticException e) {
                // log the error
                System.out.println(ANSI_RED + "Arithmetic Exception Occured! FIX IT!" + ANSI_RESET);
            }

        }
    }
}
