package sundry;

import java.util.Comparator;

public class ComparatorsExamples {

    public static void main(String[] args) {

        Comparator<String> stringComparator =
                Comparator.comparing(String::length)
                .thenComparing(String.CASE_INSENSITIVE_ORDER);

        Comparator<String> reverseComparator = stringComparator.reversed();

        Comparator<String> c = Comparator.naturalOrder();

        Comparator<String> d = Comparator.nullsFirst(Comparator.naturalOrder());
    }
}
