import java.util.*;

public class TreeSetAssign {

    // creating a stack using a method
    static <T> TreeSet<T> createTreeSet(T... ele) {
        TreeSet<T> newTreeSet = new TreeSet<T>();
        for (T el : ele) {
            newTreeSet.add(el);
        }
        return newTreeSet;
    }

    public static void main(String[] args) {
        TreeSet<String> treeSet1 = createTreeSet("A", "B", "C", "D", "E", "F", "G");
        TreeSet<String> treeSet2 = createTreeSet("F", "G", "H", "I", "J", "K", "L");

        System.out.println("treeSet1: " + treeSet1);
        System.out.println("treeSet2: " + treeSet2);

        // add
        treeSet1.add("H");
        System.out.println("add H -> treeSet1: " + treeSet1);

        // remove
        treeSet1.remove("H");
        System.out.println("remove H -> treeSet1: " + treeSet1);

        // add all
        TreeSet<String> addAll = new TreeSet<String>(treeSet1);
        addAll.addAll(treeSet2);
        System.out.println("addAll(treeSet1 + treeSet2): " + addAll);

        // union
        TreeSet<String> union = new TreeSet<String>(treeSet1);
        union.addAll(treeSet2);
        System.out.println("union: " + union);

        // intersection
        TreeSet<String> intersection = new TreeSet<String>(treeSet1);
        intersection.retainAll(treeSet2);
        System.out.println("intersection: " + intersection);

        // difference
        TreeSet<String> difference = new TreeSet<String>(treeSet1);
        difference.removeAll(treeSet2);
        System.out.println("difference: " + difference);

        // subset
        System.out.println("treeSet1 is subset of treeSet2: " + treeSet1.containsAll(treeSet2));

        // clear
        treeSet2.clear();
        System.out.println("clear treeSet2: " + treeSet2);

        // size
        System.out.println("size: " + treeSet1.size());

        // to array
        String[] array = treeSet1.toArray(new String[treeSet1.size()]);
        System.out.println("to array: " + Arrays.toString(array));

        // iterate
        System.out.print("iterate: ");
        for (String el : treeSet1) {
            System.out.print(el + " ");
        }

        // iterate throught iterator
        Iterator<String> iterator = treeSet1.iterator();
        System.out.print("\niterate through iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
