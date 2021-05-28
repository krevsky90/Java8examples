package streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Match - terminal operation
 */
public class MatchExample {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        boolean anyStartsWithA = stringCollection.stream().anyMatch(s -> s.startsWith("a"));
        System.out.println("anyStartsWithA " + anyStartsWithA);

        boolean allStartsWithA = stringCollection.stream().allMatch(s -> s.startsWith("a"));
        System.out.println("allStartsWithA " + allStartsWithA);

        boolean noneStartsWithA = stringCollection.stream().noneMatch(s -> s.startsWith("a"));
        System.out.println("noneStartsWithA " + noneStartsWithA);
    }
}
