import java.util.*;

public class StackAssign {
    // creating a stack using generics
    static <T> Stack<T> createStack(T... ele) {
        Stack<T> newStack = new Stack<T>();
        for (T el : ele) {
            newStack.push(el);
        }
        return newStack;
    }

    public static void main(String[] args) {
        Stack<String> stack1 = createStack("A", "B", "C", "D", "E", "F", "G");
        Stack<String> stack2 = createStack("H", "I", "J", "K", "L", "M", "N");

        System.out.println("stack1: " + stack1);

        // peek
        System.out.println("peek: " + stack1.peek());

        // pop
        System.out.println("pop: " + stack1.pop());
        System.out.println("stack1: " + stack1);

        // push
        stack1.push("H");
        System.out.println("push H -> stack1: " + stack1);

        // add
        stack1.add("I");
        System.out.println("add I -> stack1: " + stack1);

        // remove
        stack1.remove("I");
        System.out.println("remove I -> stack1: " + stack1);

        // add all
        stack1.addAll(stack2);
        System.out.println("add all stack2 -> stack1: " + stack1);

        // get
        System.out.println("get(2): " + stack1.get(2));

        // set
        stack1.set(2, "O");

        // size
        System.out.println("size: " + stack1.size());

        // to array
        String[] array = stack1.toArray(new String[stack1.size()]);
        System.out.println("to array: " + Arrays.toString(array));

        // contains
        System.out.println("contains H: " + stack1.contains("H"));

        // iterate
        System.out.print("iterate: ");
        for (String el : stack1) {
            System.out.print(el + " ");
        }

        // iterate throught iterator
        System.out.print("\niterate through iterator: ");
        Iterator<String> it = stack1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}
