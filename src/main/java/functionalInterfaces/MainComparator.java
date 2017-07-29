package functionalInterfaces;


import stream.model.Person;

import java.util.Comparator;

public class MainComparator {

    public static void main(String... args) {

        Comparator<Person> cmpAge = (p1 , p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> cmpFirstName = Comparator.comparing(Person::getName);

        Comparator<Person> personComparator = cmpAge.thenComparing(cmpFirstName);
    }
}
