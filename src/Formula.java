public interface Formula {
    double calculate(int a);

    /**
     * default is MANDATORY!
     * @param a
     * @return
     */
    default double sqrt(int a) {
        return Math.sqrt(a);
    }

    static double cube(int a) {
        return a*a*a;
    }
}
