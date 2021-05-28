package functionalInterfaces;

public class VariablesVisibility2 {
    static int outerStaticNum;
    int outerNum;

    public void testScopes() {
        Converter<Integer, String> converter1 = from -> {
            outerStaticNum = 10;    //it is ok!
            return String.valueOf(from);
        };

        Converter<Integer, String> converter2 = from -> {
            outerNum = 20;    //it is also ok
            return String.valueOf(from);
        };
    }
}
