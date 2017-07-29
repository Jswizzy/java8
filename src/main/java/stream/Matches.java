package stream;

import stream.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Matches {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Alice", 26),
                new Person("Brain", 56),
                new Person("Chelsea", 46),
                new Person("David", 28),
                new Person("Erica", 37),
                new Person("Francisco", 18)
        ));

        Supplier<Stream<Person>> streamSupplier = people::stream;

        boolean b =
                people.stream()
                        .anyMatch(person -> person.getAge() > 20);

        // short circuit

        Optional<Person> optional =
                people.stream()
                        .filter(person -> person.getAge() > 26)
                        .findAny();

        optional.ifPresent(System.out::println);

    }
}
