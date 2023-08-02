package funcInterface;

@FunctionalInterface
public interface OddEven<T> {
    boolean test(T t); // The single abstract method
    // Other default or static methods can be present
}