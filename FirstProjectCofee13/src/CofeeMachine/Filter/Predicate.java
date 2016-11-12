package CofeeMachine.Filter;

/**
 * Created by Dyvak on 12.11.2016.
 */
public interface Predicate<T> {
    boolean apply(T value);
}