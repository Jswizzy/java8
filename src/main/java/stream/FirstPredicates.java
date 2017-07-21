package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicates {

    private static String[] count = "one two three four five".split(" ");

    private static Consumer<String> print = System.out::println;

    public static void main(String[] args) {

        Stream<String> stream = Stream.of(count);

        Predicate<String> greaterThanThree = s -> s.length() > 3;

        Predicate<String> isTwo = Predicate.isEqual("two");
        Predicate<String> isThree = Predicate.isEqual("three");

        stream.filter(greaterThanThree).forEach(print);

        stream.filter(isTwo.or(isThree)).forEach(print);

    }
}
