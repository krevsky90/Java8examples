package streams;

import java.util.ArrayList;
import java.util.List;

/**
 * sorted - intermediate operation
 * filter - intermediate operation
 * forEach - terminal operation
 */
public class SortedFilterForEachExample {
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

        stringCollection.stream()
                .sorted((a,b) -> a.compareTo(b))   //!!
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);
    }
}
