package functionalInterfaces;

import java.util.function.Function;

/**
 * Функции принимают один аргумент и возвращают некоторый результат.
 * Методы по умолчанию могут использоваться для построения цепочек вызовов (compose, andThen).
 */
public class Functions {
    void test() {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        backToString.apply("123");     // "123"
    }
}
