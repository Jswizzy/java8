package stream.model;

public class Person {

    private final String lastName;
    private String name;
    
    private int age;

    public Person(String name, int age, String lastName) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String toString() {
        return "Person [" + this.name + ", " + this.age + "]";
    }

    public String getLastName() {
        return lastName;
    }
}
