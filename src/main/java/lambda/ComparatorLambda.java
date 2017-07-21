package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.comparingInt(String::length);

        List<String> list = Arrays.asList("***", "**", "****", "*");
        list.sort(comparator);

        list.forEach(System.out::println);

        Comparator<String> c = (s1, s2) -> Integer.compare(s2.length(), s1.length());

        list.sort(c);
        list.forEach((s) -> System.out.println(s));
    }
}
