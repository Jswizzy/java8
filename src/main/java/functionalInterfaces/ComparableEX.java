package functionalInterfaces;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableEX {

    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.comparingInt(String::length);

        String[] strings = {"one", "two", "three", "four", "five", "six", "seven"};
        Arrays.sort(strings, comparator);

        Arrays.stream(strings).forEach(System.out::println);
    }
}
