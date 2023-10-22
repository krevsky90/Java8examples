/**
 * Info: https://m.habr.com/ru/post/216431/
 */

public class TestMain {
    public static void main(String[] args) {
        Formula f = new FormulaImpl();
        System.out.println("f.sqrt(4) = " + f.sqrt(4));

        Formula f2 = new Formula() {
            @Override
            public double calculate(int a) {
                return 2 * a;
            }
        };

        double f2sqrt = f2.sqrt(16);
        System.out.println("f2sqrt = " + f2sqrt);

        //usage of static method of Interface
        double aCube = Formula.cube(4);
        System.out.println("aCube = " + aCube);
    }
}
