import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExamples {
    public static void main(String[] args) {

    }

    public static void usualSort() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    /**
     * use lambda-expressions to avoid of creation of anonymous objects of Comparator
     */
    public static void lambdaSort() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (String o1, String o2) -> {
                return o1.compareTo(o2);
            });
    }

    /**
     * since compare-method contains the only row -> we can remove {}
     */
    public static void lambdaSortForOneRowMethod() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (String o1, String o2) -> o1.compareTo(o2));
    }

    /**
     * since compiler knows the type of names-objects -> remove type for o1 and o2
     */
    public static void lambdaSortForOneRowMethodWithoutTypes() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (o1,  o2) -> o1.compareTo(o2));
    }

    /**
     * use link to static method of Class or to method of entity of this Class
     * Current example - method 'compareTo' of String-object
     */
    public static void lambdaSortUseStaticLinkToMethod() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, String::compareTo);
    }
}
