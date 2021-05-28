package functionalInterfaces;

import java.util.Comparator;

public class Comparators {
    public static void main(String[] args) {
        testComparator();

    }
    static void testComparator() {

        //todo: question: why do we need to have Person class in the same package as Comparators class???
        Comparator<Person> comparator = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());

        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");

        System.out.println(comparator.compare(p1, p2));             // > 0
        System.out.println(comparator.reversed().compare(p1, p2));  // < 0
    }
}
