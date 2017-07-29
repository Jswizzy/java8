package mapFilterReduce;

import stream.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapFilterReduce {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Alice", 26),
                new Person("Brain", 56),
                new Person("Chelsea", 46),
                new Person("David", 28),
                new Person("Erica", 37),
                new Person("Francisco", 18)
        ));

        Optional<Integer> sumOfAges = people.stream()
                .map(Person::getAge)
                .filter(age -> age > 20)
                .reduce(Integer::sum);

        sumOfAges.ifPresent(System.out::println);
    }
}
