package sundry;

import java.util.function.BinaryOperator;

public class NumberExamples {

    public static void main(String[] args) {

        // sum, max, min wrapper types
        long max = Long.max(1L, 2L);

        BinaryOperator<Long> sum = Long::sum;

        // hashcode

        // java 7, cost of boxing and unboxing
        long l = 3141L;
        int hash = new Long(l).hashCode();

        // java 8
        int hash1 = Long.hashCode(l);

    }
}
