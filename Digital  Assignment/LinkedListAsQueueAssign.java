
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAsQueueAssign {
    static LinkedList<String> createLinkedList(String... elements) {
        LinkedList<String> newLinkedList = new LinkedList<String>();
        for (String el : elements) {
            newLinkedList.add(el);
        }
        return newLinkedList;
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = createLinkedList("A", "B", "C", "D", "E", "F", "G");
        System.out.println("Linked List: " + linkedList);

        // add
        linkedList.add("H");
        System.out.println("add H -> Linked List: " + linkedList);

        // add all
        LinkedList<String> addAll = new LinkedList<String>(linkedList);
        addAll.addAll(createLinkedList("F", "G", "H", "I", "J", "K", "L"));
        System.out.println("added from F-L" + addAll);

        // add first
        linkedList.addFirst("M");
        System.out.println("add M -> Linked List: " + linkedList);

        // add last
        linkedList.addLast("N");
        System.out.println("add N -> Linked List: " + linkedList);

        // remove first
        linkedList.removeFirst();
        System.out.println("remove first -> Linked List: " + linkedList);

        // remove last
        linkedList.removeLast();
        System.out.println("remove last -> Linked List: " + linkedList);

        // get first
        System.out.println("get first -> Linked List: " + linkedList.getFirst());

        // get last
        System.out.println("get last -> Linked List: " + linkedList.getLast());

        // peek
        System.out.println("peek -> Linked List: " + linkedList.peek());

        // poll
        System.out.println("poll -> Linked List: " + linkedList.poll());

        // iterate through iterator
        System.out.print("iterate: ");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // clear
        linkedList.clear();
        System.out.println("\nclear LinkedList: " + linkedList);

    }
}
