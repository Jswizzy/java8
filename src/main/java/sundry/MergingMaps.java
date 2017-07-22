package sundry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergingMaps {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        try (
                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(
                                        MergingMaps.class.getResourceAsStream("/people.txt")
                                )
                        );
                Stream<String> stream = reader.lines();
        ) {

            stream
                    .map(line -> {
                        String[] s = line.split(" ");
                        Person p = new Person(
                                s[0].trim(),
                                Integer.parseInt(s[1]),
                                s[2].trim()
                        );
                        persons.add(p);
                        return p;
                    })
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Person> people = persons.subList(0, 2);
        List<Person> people1 = persons.subList(2, persons.size());

        Map<Integer, List<Person>> map1 = mapByAge(people);
        Map<Integer, List<Person>> map2 = mapByAge(people1);
        map1.forEach(
                (age, list) -> System.out.println(
                        new StringJoiner("->")
                                .add(String.valueOf(age))
                                .add(list.toString())
                                .toString()
                )
        );

        map2.forEach((key, value) ->
                map1.merge(
                        key,
                        value,
                        (l1, l2) -> {
                            l1.addAll(l2);
                            return l1;
                        }
                ));

        System.out.println("Map 1 Merged");
        map1.forEach((age, list) -> System.out.println(age + "->" + list));

        // bi maps
        Map<Integer, Map<String, List<Person>>> bimap =
                new HashMap<>();

        persons.forEach(
                person ->
                        bimap.computeIfAbsent(
                                person.getAge(),
                                HashMap::new
                        ).merge(
                                person.getGender(),
                                new ArrayList<>(Arrays.asList(person)),
                                (l1, l2) -> {
                                    l1.addAll(l2);
                                    return l1;
                                }
                        )
        );

        bimap.forEach(
                (age, map) -> System.out.println(age + "=>" + map)
        );

    }

    private static Map<Integer, List<Person>> mapByAge(List<Person> list) {
        return list.stream().collect(
                Collectors.groupingBy(Person::getAge));
    }
}

class Person {
    private final String name;
    private final int age;
    private final String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return new StringJoiner(",")
                .add(name)
                .add(String.valueOf(age))
                .add(gender)
                .toString();
    }
}