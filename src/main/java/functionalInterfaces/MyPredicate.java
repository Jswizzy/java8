package functionalInterfaces;

@FunctionalInterface
public interface MyPredicate<T> {

    public boolean test(T t);


    default MyPredicate<T> and(MyPredicate<T> other) {
        return t -> test(t) && other.test(t);
    }

    default MyPredicate<T> or(MyPredicate<T> other) {
        return t -> test(t) || other.test(t);
    }

    static <U> MyPredicate<U> isEqualTo(U other) {
        return s -> s.equals(other);
    }
}
