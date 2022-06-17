import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PriorityQueueAssign {
    static PriorityQueue<Integer> createPriorityQueue(Integer... elements) {
        PriorityQueue<Integer> newPriorityQueue = new PriorityQueue<Integer>();
        for (Integer el : elements) {
            newPriorityQueue.add(el);
        }
        return newPriorityQueue;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = createPriorityQueue(2, 5, 1, 8, 3, 7, 6, 4);
        System.out.println("priorityQueue: " + priorityQueue);

        // add
        priorityQueue.add(11);
        priorityQueue.add(5);
        System.out.println("add 11 -> priorityQueue: " + priorityQueue);

        // add all
        PriorityQueue<Integer> addAll = new PriorityQueue<Integer>(priorityQueue);
        List<Integer> intList = IntStream.rangeClosed(1, 20)
                .boxed().collect(Collectors.toList());
        addAll.addAll(intList);

        System.out.println("added from 1-20 +List: " + addAll);

        // remove
        priorityQueue.remove(5);
        System.out.println("remove 5 -> priorityQueue: " + priorityQueue);

        // remove first
        Integer ele = priorityQueue.remove();
        System.out.println("remove first -> priorityQueue: " + priorityQueue + " Removed Element: " + ele);

        // poll
        System.out.println("poll -> priorityQueue: " + priorityQueue.poll());

        // peek
        System.out.println("peek -> priorityQueue: " + priorityQueue.peek());

        // iterate through iterator
        System.out.print("iterate: ");
        Iterator<Integer> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // iterate through stream
        System.out.print("\niterate through stream: ");
        priorityQueue.stream().forEach(System.out::print);
        System.out.println();

        // clear
        priorityQueue.clear();
        System.out.println("clear -> priorityQueue: " + priorityQueue);
    }
}
