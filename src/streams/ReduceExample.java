package streams;

import java.util.*;

/**
 * reduce - terminal operation
 */
public class ReduceExample {
    public static void main(String[] args) {
        //example 1:
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        Optional o = stringCollection.stream().reduce((s1, s2) -> s1 + "#" + s2);
        System.out.println(o);  //returns Optional[ddd2#aaa2#bbb1#aaa1#bbb3#ccc#bbb2#ddd1]

        //example 2:
        Collection emptyCollection = Collections.emptyList();
        Optional oEmpty = emptyCollection.stream().reduce((s1, s2) -> s1 + "#" + s2);
        System.out.println(oEmpty); //returns Optional.empty

        //example 3: math experiment
        List<Integer> digitList = Arrays.asList(3, 2, 1);
        Optional<Integer> oDigit = digitList.stream().reduce((d1, d2) -> d1*d1 + d2*d2);
        //it works by the following:
        //1) (3, 2) -> 3*3 + 2*2 = 13
        //2) ((3, 2), 1) -> 13*13 + 1*1 = 170
        //SUMMARY: reduce does not fit to math operations!

        System.out.println(oDigit.get());
    }
}
