package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DataProcessing {

    public static void main(String[] args) {

        // consumer takes an argument and does not return anything

        Consumer<String> printer = System.out::println;

        // supplier provides an object, takes no parameter

        Supplier<List> listSupplier = ArrayList::new;

        // a function takes an object returns another object, maps

        Function<List, Integer> arraySize = List::size;

        // a predicate takes an object and returns a boolean

        Predicate<List> listPredicate = list -> list.size() > 20;


        // main

        MyPredicate<String> myPredicate = s -> s.length() < 20;
        MyPredicate<String> myPredicate2 = s -> s.length() > 5;

        boolean b = myPredicate.and(myPredicate2).test("Hello");
        printer.accept(String.valueOf(b));

        b = myPredicate.or(myPredicate2).test("Hello");
        printer.accept(String.valueOf(b));

        MyPredicate<String> p5 = MyPredicate.isEqualTo("Yes");
    }
}
