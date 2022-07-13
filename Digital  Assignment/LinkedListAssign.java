import java.util.*;

public class LinkedListAssign {

    // creating a linked list using generics
    static <T> LinkedList<T> createLinkedList(T... ele) {
        LinkedList<T> newList = new LinkedList<T>();
        for (T el : ele) {
            newList.add(el);
        }
        return newList;
    }

    public static void main(String[] args) {

        LinkedList<String> list1 = createLinkedList("A", "B", "C", "D", "E", "F", "G");
        LinkedList<String> list2 = createLinkedList("F", "G", "H", "I", "J");
        LinkedList<String> list3 = createLinkedList("F", "G", "I");

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);

        // remove
        list3.remove("A");
        System.out.println("Remove A from list3 -> list3: " + list3);

        // remove all
        // list3.removeAll();
        list3.clear();
        System.out.println("remove all -> list3: " + list3);

        // add
        list1.add("A");
        list1.add("B");
        System.out.println("add A and B -> list1: " + list1);

        // add at index
        list1.add(1, "C");
        System.out.println("Add at index 1 -> list1: " + list1);

        // add first and last
        list1.addFirst("F");
        System.out.println("Add first 'F'-> list1: " + list1);
        list1.addLast("G");
        System.out.println("Add last 'G'-> list1: " + list1);

        // get
        System.out.println("list1.get(0): " + list1.get(0));

        // set
        list1.set(0, "D");
        System.out.println("set method (0, 'D') -> list1: " + list1);

        // index of
        System.out.println("list1.indexOf(\"B\"): " + list1.indexOf("B"));

        // last index of
        System.out.println("list1.lastIndexOf(\"B\"): " + list1.lastIndexOf("B"));

        // size
        System.out.println("list1.size(): " + list1.size());

        // toArray
        Object[] array = list1.toArray();
        System.out.println("list1.toArray(): " + Arrays.toString(array));

        // iterate
        System.out.print("Iterate list1: ");
        for (String s : list1) {
            System.out.print(s + ' ');
        }

        // iterate using iterator
        System.out.print("\nIterate list1 using iterator: ");
        Iterator<String> itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ' ');
        }
    }
}