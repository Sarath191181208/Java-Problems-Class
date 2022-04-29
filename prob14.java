public class prob14 {
    /**
     * Q: Generics (or dynamic types)
     * links:
     * https://www.youtube.com/watch?v=XMvznsY02Mk
     * https://www.geeksforgeeks.org/generics-in-java/
     * https://www.programiz.com/java-programming/generics
     * https://docs.oracle.com/javase/tutorial/java/generics/types.html
     */
    public static void main(String[] args) {
        print(12);
        print("String");
        print(new int[] { 1, 2, 3 });
        print(new String[] { "a", "b", "c" });
        print(31.23);
    }

    private static <T> void print(T ele) {
        System.out.println(ele);
    }

    private static <T> void print(T[] arr) {
        for (T ele : arr) {
            System.out.print(ele);
            System.out.print(" ");
        }
        System.out.println();
    }
}
