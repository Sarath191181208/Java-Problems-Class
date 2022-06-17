import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeAssign {
    static ArrayDeque<String> createArrayDeque(String... elements) {
        ArrayDeque<String> newArrayDeque = new ArrayDeque<String>();
        for (String el : elements) {
            newArrayDeque.add(el);
        }
        return newArrayDeque;
    }

    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = createArrayDeque("A", "B", "C", "D", "E", "F", "G");
        System.out.println("arrayDeque: " + arrayDeque);

        // add
        arrayDeque.add("H");
        System.out.println("add H -> arrayDeque: " + arrayDeque);

        // add all
        ArrayDeque<String> addAll = new ArrayDeque<String>(arrayDeque);
        addAll.addAll(createArrayDeque("F", "G", "H", "I", "J", "K", "L"));
        System.out.println("added from F-L" + addAll);

        // add first
        arrayDeque.addFirst("M");
        System.out.println("add M -> arrayDeque: " + arrayDeque);

        // add last
        arrayDeque.addLast("N");
        System.out.println("add N -> arrayDeque: " + arrayDeque);

        // remove first
        arrayDeque.removeFirst();
        System.out.println("remove first -> arrayDeque: " + arrayDeque);

        // remove last
        arrayDeque.removeLast();
        System.out.println("remove last -> arrayDeque: " + arrayDeque);

        // get first
        System.out.println("get first -> arrayDeque: " + arrayDeque.getFirst());

        // get last
        System.out.println("get last -> arrayDeque: " + arrayDeque.getLast());

        // peek
        System.out.println("peek -> arrayDeque: " + arrayDeque.peek());

        // poll
        System.out.println("poll -> arrayDeque: " + arrayDeque.poll());

        // iterate through iterator
        System.out.print("iterate: ");
        Iterator<String> iterator = arrayDeque.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // clear
        arrayDeque.clear();
        System.out.println("\nclear arrayDeque: " + arrayDeque);

    }
}
