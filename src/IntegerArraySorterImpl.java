import java.util.Arrays;

public interface IntegerArraySorterImpl extends IntegerArrayPrinterImpl {

    default Integer[] bubbleSortingInAscendingOrder (Integer[] source,
                                                     String operation) {
        Integer[] arr = Arrays.copyOf(source, source.length);
        int tmp = 0, k = arr.length - 2;
        boolean is_swap;
        for (int i = 0; i <= k ; i++) {
            is_swap = false;
            for (int j = k; j >= i ; j--) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                    is_swap = true;
                }
            }
            if (!is_swap) break;
        }
        printIntArray(operation + ": ", arr);
        return arr;
    }

}