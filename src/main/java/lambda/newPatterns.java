package lambda;

import java.util.Objects;
import java.util.function.Predicate;

public class newPatterns {

    public static void main(String[] args) {

        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 10;

        Predicate<String> p3 = p1.and(p2);

        Boolean result = p3.test("short");

        System.out.println(result);

        Objects.requireNonNull(p2);
    }
}
