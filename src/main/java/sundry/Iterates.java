package sundry;

import java.util.*;
import java.util.stream.Collectors;

public class Iterates {

    public static void main(String[] args) {

        List<String> strings =
                Arrays.asList("one", "two", "three", "four");

        strings.forEach(System.out::println);

        // removeIF

        Collection<String> list = new ArrayList<>(strings);

        boolean b = list.removeIf(s -> s.length() > 4);

        System.out.println(
                list.stream().collect(Collectors.joining(", ", "{", "}")));

        // replaceAll
        List<String> stringList = new ArrayList<>(strings);

        stringList.replaceAll(String::toUpperCase);

        System.out.println(
                stringList.stream().collect(Collectors.joining(", "))
        );

        // sort

        List<String> sortList = new ArrayList<>(strings);

        sortList.sort(Comparator.naturalOrder());

        System.out.println(
                sortList.stream().collect(Collectors.joining(", "))
        );

    }
}
