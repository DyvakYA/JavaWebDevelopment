package CofeeMachine.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dyvak on 12.11.2016.
 */
public final class Filter {

        private Filter() {}

        public static <T> List<T> filter(List<T> values, Predicate<T> predicate) {
            List<T> result = new ArrayList<T>();

            for (T value : values) {
                if (predicate.apply(value)) {
                    result.add(value);
                }
            }
            return result;
        }
}
