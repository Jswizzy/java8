package sundry;

import java.util.StringJoiner;
import java.util.stream.IntStream;

public class Strings {

    public static void main(String[] args) {

        String s = "Hello World!";

        IntStream stream = s.chars();

        stream.mapToObj(letter -> (char)letter)
                .map(Character::toUpperCase)
                .forEach(System.out::print);

        StringJoiner stringJoiner = new StringJoiner(", ", "{", "}");

        stringJoiner.add("one").add("two").add("three");

        System.out.println(stringJoiner.toString());

        String s1 = String.join(",", "one", "two", "three");

        System.out.println(s1);


    }
}
