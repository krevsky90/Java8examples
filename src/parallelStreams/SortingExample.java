package parallelStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * this example should show that parallelSorting in ~ 2 times faster than sequential sorting
 * But on my laptop it is wrong. Moreover count() increases time consumption in 400+ times!
 */

public class SortingExample {
    public static void main(String[] args) {
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        sequentialSorting(values);
        //or
        parallelSorting(values);

    }

    private static void sequentialSorting(List<String> values) {
        long t0 = System.nanoTime();

        values.stream().sorted();   //takes ~ 0.9 ms
//        values.stream().sorted().count();   //takes ~ 1 ms

        long t1 = System.nanoTime();

        long delta = t1 - t0;
        System.out.println(String.format("sequential sort took: %d ns", delta));
    }

    private static void parallelSorting(List<String> values) {
        long t0 = System.nanoTime();

        values.parallelStream().sorted();   //takes ~ 0.9 ms
//        values.parallelStream().sorted().count();   //takes ~ 420 ms !!!

        long t1 = System.nanoTime();

        long delta = t1 - t0;
        System.out.println(String.format("parallel sort took: %d ns", delta));
    }
}
