package functionalInterfaces;

import java.util.function.Supplier;

/**
 * Поставщики (suppliers) предоставляют результат заданного типа.
 * В отличии от функций, поставщики не принимают аргументов.
 */
public class Suppliers {
    void test() {
        Supplier<String> personSupplier = String::new;
        personSupplier.get();   // new String
    }
}
