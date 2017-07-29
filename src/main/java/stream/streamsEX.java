package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamsEX {

    public static void main(String[] args) throws IOException {

        Consumer<String> print = System.out::println;

        IntStream stream = "hello".chars();

        Stream.empty();

        Stream.of("3", "2", "1")
                .skip(1)
                .mapToInt(Integer::valueOf)
                .forEach(System.out::println);

        Stream.generate(() -> "Hello")
                .limit(5)
                .forEach(print);

        Stream.iterate("+", s -> s + "+")
                .limit(5)
                .forEach(print);

        ThreadLocalRandom.current().ints()
                .limit(5)
                .forEach(System.out::println);

        String book = "Hello there you Person. . 123!";

        Stream<String> words =
                Pattern.compile("[^\\p{javaLetter}]")
                .splitAsStream(book);

        words
                .map(String::toUpperCase)
                .forEach(print);

        Path path = Paths.get(".");
        Stream<String> lines = Files.lines(path);

        Stream.Builder<String> builder = Stream.builder();
        builder
                .add("one")
                .add("two")
                .add("three")
                .build()
                .forEach(print);
    }
}
