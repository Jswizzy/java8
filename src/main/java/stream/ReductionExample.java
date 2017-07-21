package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, -10, 10);

        Optional<Integer> red =
        list.stream()
               .reduce(Integer::max);

        red.ifPresent(System.out::println);
    }
}
