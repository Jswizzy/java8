package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumers {

    private static Consumer<String> println = System.out::println;

    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("one", "two", "three", "four", "five");

        List<String> result = new ArrayList<>();

        Consumer<String> c2 = result::add;

        strings.forEach(println.andThen(c2));

        result.forEach(System.out::println);
    }

}
