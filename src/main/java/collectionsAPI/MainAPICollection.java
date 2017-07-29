package collectionsAPI;

import stream.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainAPICollection {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Alice", 26),
                new Person("Brain", 56),
                new Person("Chelsea", 46),
                new Person("David", 28),
                new Person("Erica", 37),
                new Person("Francisco", 18)
        ));

        people.removeIf(person -> person.getAge() < 28);
        people.replaceAll(person -> new Person(person.getName().toUpperCase(), person.getAge()));
        people.sort(Comparator.comparingInt(Person::getAge).reversed());

        people.forEach(System.out::println);
    }
}
