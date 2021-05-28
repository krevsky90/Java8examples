package functionalInterfaces;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Предикаты — это функции, принимающие один аргумент, и возвращающие значение типа boolean.
 * Интерфейс содержит различные методы по умолчанию, позволяющие строить сложные условия (and, or, negate).
 */
public class Predicates {
    void test() {
        Predicate<String> predicate = s -> s.length() > 0;
        predicate.test("foo");              // true
        predicate.negate().test("foo");     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
    }
}
