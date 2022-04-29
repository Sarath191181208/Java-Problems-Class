import java.util.ArrayList;
import java.util.Arrays;

public class prob13 {
    /**
     * Q: Java Collections
     * links:
     * https://www.programiz.com/java-programming/collections
     * https://www.geeksforgeeks.org/collections-in-java-2/
     * https://www.javatpoint.com/collections-in-java
     */

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>(
                Arrays.asList(80, 90, 73, 61, 58));
        for (Integer mark : marks) {
            System.out.println(mark);
        }
    }
}
