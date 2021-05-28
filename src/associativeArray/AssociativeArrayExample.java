package associativeArray;

import java.util.HashMap;
import java.util.Map;

/**
 *extra russian comments from https://vertex-academy.com/tutorials/ru/java-8-novye-metody-map/
 */
public class AssociativeArrayExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        putIfAbsent(map);
        computeIf(map);
        remove(map);
        getOfDefault(map);
        merge(map);
    }

    /**
     * instead of
     * if (map.get("name") == null)
     *     map.put("name", "Gus");
     * @param map
     */
    private static void putIfAbsent(Map<Integer, String> map) {
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        System.out.println("putIfAbsent:");
        map.forEach((id, val) -> System.out.println("\t" + id + " " + val));
    }

    private static void computeIf(Map<Integer, String> map) {
        //Если нам необходимо произвести какое-то действие со значением в Map, если оно там есть
        map.computeIfPresent(3, (x, y) -> x + y);
        System.out.println("computeIf: map.get(3) = " + map.get(3));             // 3val3
        map.computeIfPresent(9, (num, val) -> null);
        System.out.println("computeIf: map.containsKey(9) = " + map.containsKey(9));    //false

        //действие произойдет в том случае, если значения нет
        map.computeIfAbsent(23, num -> "val" + num);
        System.out.println("computeIf: map.containsKey(23) = " + map.containsKey(23));    //true
        map.computeIfAbsent(3, num -> "bam");   //nothing happens
        System.out.println("computeIf: map.get(3) = " + map.get(3));    // 3val3
    }

    //хотим удалить из Map пару, если совпадает и ключ, и значение
    private static void remove(Map<Integer, String> map) {
        //remove object from map if it exists
        map.remove(3, "val3");  //we DON'T remove anything!
        System.out.println("remove: map.get(3) = " + map.get(3));             // 3val3

        map.remove(3, "3val3");

        System.out.println("remove: map.get(3) = " + map.get(3));   //null
    }

    //можно вернуть значение по умолчанию, если с таким ключем нет значения
    private static void getOfDefault(Map<Integer, String> map) {
        String res = map.getOrDefault(42, "not found");
        System.out.println("getOfDefault: res = " + res);   // not found
    }

    private static void merge(Map<Integer, String> map) {
        //Если друг понадобилось объединить значение в Map с другим, то это легко сделать с помощью merge()
        map.merge(1, "newV", (oldValue, newValue) -> "oldValue = " + oldValue + ", newValue = " + newValue);
        System.out.println("merge: map.get(1) = " + map.get(1));

        //При этом, если такой пары в Map нет, она будет создана
        map.merge(100, "newVal100", (oldValue, newValue) -> "oldValue = " + oldValue + ", newValue = " + newValue);
        System.out.println("merge: map.get(100) = " + map.get(100));
    }
}
