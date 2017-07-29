package functionalInterfaces;

import stream.model.Person;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodEX {
    public static void main(String[] args) {

        Function<Person, Integer> f = Person::getAge;

        BinaryOperator<Integer> sum = Integer::sum;

        Consumer<String> printer = System.out::println;

        printer.accept(sum.apply(1,2).toString());
    }
}
