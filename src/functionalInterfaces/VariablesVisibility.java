package functionalInterfaces;

public class VariablesVisibility {
    public void testChangeVariable() {
        //can be final or not, but it can't be changed anywhere!
        int num = 1;

        Converter<Integer, String> converter = from -> {
            return String.valueOf(from + num);
            //num++; ERROR!
        };

//        num++; ERROR!

        String res = converter.convert(77);
        System.out.println("res = " + res);
    }
}
