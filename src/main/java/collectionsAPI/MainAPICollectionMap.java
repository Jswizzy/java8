package collectionsAPI;

import stream.model.Person;

import java.util.*;

public class MainAPICollectionMap {

    public static void main(String[] args) {

        Person alice = new Person("Alice", 26);
        Person brain = new Person("Brain", 56);
        Person chelsea = new Person("Chelsea", 46);
        Person david = new Person("David", 28);
        Person erica = new Person("Erica", 37);
        Person francisco = new Person("Francisco", 18);


        City newYork = new City("NewYork");
        City shanghai = new City("Shanghai");
        City paris = new City("Paris");

        Map<City, List<Person>> cityListMap = new HashMap<>();

        cityListMap.putIfAbsent(paris, new ArrayList<>());
        cityListMap.get(paris).add(alice);

        cityListMap.computeIfAbsent(newYork, city -> new ArrayList<>()).add(brain);
        cityListMap.computeIfAbsent(newYork, city -> new ArrayList<>()).add(chelsea);

        System.out.println("Paris: " + cityListMap.getOrDefault(paris, Collections.EMPTY_LIST));
        System.out.println("New York: " + cityListMap.getOrDefault(newYork, Collections.EMPTY_LIST));
    }
}

class City {
    private String city;

    City(String city) {
        this.city = city;
    }

    String name() {
        return city;
    }
}