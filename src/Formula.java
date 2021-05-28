public interface Formula {
    double calculate(int a);

    /**
     * new
     * @param a
     * @return
     */
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
