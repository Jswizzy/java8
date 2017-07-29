package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainBuildingStreams {

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4);

        ints
                .forEach(System.out::println);

        Stream.of(1, 2 , 3, 4, 5)
                .forEach(System.out::println);

        Stream.generate(() -> "one")
                .limit(5)
                .forEach(System.out::println);

        Stream.iterate(1, integer -> integer + integer)
                .limit(5)
                .forEach(System.out::println);


    }
}
