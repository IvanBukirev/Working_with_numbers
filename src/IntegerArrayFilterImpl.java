import java.util.Arrays;
import java.util.function.Predicate;

public interface IntegerArrayFilterImpl extends IntegerArrayPrinterImpl {
    Predicate<Integer> isPositive = x -> x > 0;
    Predicate<Integer> isEven = x -> x % 2 == 0;

    default Integer[] filterForIntArray(Integer[] source, Predicate<Integer> filter, String operation) {
        Integer[] filteredArray = new Integer[source.length];
        int counter = 0;
        for (int value : source) {
            if (filter.test(value)) {
                filteredArray[counter++] = value;
            }
        }
        Integer[] finallyArray = (counter == 0) ? new Integer[0]: Arrays.copyOf(filteredArray, counter);
        printIntArray(operation + ": ", finallyArray);
        return finallyArray;
    }
}