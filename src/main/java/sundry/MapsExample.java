package sundry;

import stream.model.Person;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {

    public static void main(String[] args) {

        // forEach

        Map<String, Person> map = new HashMap<>();
        map.put("Josh", new Person("Josh", 30, lastName));
        map.put("Wendy", new Person("Wendy", 25, lastName));

        map.forEach((key, person) ->
                System.out.println(String.join("::", key, String.valueOf(person.getAge()))));

        // get, can return null

        Person defaultPerson = new Person("Bob", 50, lastName);

        Person p = map.getOrDefault("Dan", defaultPerson);

        System.out.println(p);

        // put will erase an existing person

        map.putIfAbsent("Sarah", new Person("Sarah", 32, lastName));

        // replace AND remove will only override an existing entry

        map.replace("Josh", defaultPerson);

        map.remove("Bob");

        map.replaceAll((key, oldPerson) -> new Person(key, oldPerson.getAge() + 5, lastName));

        map.entrySet()
                .forEach(System.out::println);

    }
}
