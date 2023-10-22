package streams;

import java.util.ArrayList;
import java.util.List;

/**
 * map - intermediate operation
 * forEach - terminal operation
 * toList - terminal operation
 */
public class MapForEachExample {
    static class MyClass {
        private String s;

        public MyClass(String s) {
            this.s = s;
        }

        public String toString() {
            return "myClass: " + s;
        }
    }

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
                .map(s -> new MyClass(s))
                .forEach(System.out::println);

        //to get collection of objects - use stream#collect method
        //todo: разобраться в передаваемых функциях. например, почему addAll, а не add?
        List<String> newColl = stringCollection.stream()
                .map(String::toUpperCase)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        //print
        newColl.stream().forEach(s -> System.out.print(" " + s + " "));
    }
}
