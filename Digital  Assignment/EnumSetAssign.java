import java.util.*;

enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
};

public class EnumSetAssign {
    public static void main(String[] args) {
        EnumSet<Weekday> weekdays = EnumSet.allOf(Weekday.class);

        System.out.println("weekdays enum set: " + weekdays);

        // add
        weekdays.add(Weekday.SATURDAY);
        System.out.println("add SATURDAY -> weekdays enum set: " + weekdays);

        // remove
        weekdays.remove(Weekday.SATURDAY);
        System.out.println("remove SATURDAY -> weekdays enum set: " + weekdays);

        // contains
        System.out.println("contains SATURDAY: " + weekdays.contains(Weekday.SATURDAY));

        // size
        System.out.println("size: " + weekdays.size());

        // to array
        Weekday[] array = weekdays.toArray(new Weekday[weekdays.size()]);

        System.out.println("to array: " + Arrays.toString(array));

        // iterate
        System.out.print("iterate: ");
        for (Weekday el : weekdays) {
            System.out.print(el + " ");
        }

        // iterate using iterator
        System.out.print("\nIterate list1 using iterator: ");
        Iterator<Weekday> itr = weekdays.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }
}