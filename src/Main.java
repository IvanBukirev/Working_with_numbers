import java.util.function.Supplier;

public class Main implements IntegerArrayFilterImpl, IntegerArraySorterImpl {
    static Supplier<Main> instance = Main::new;
    protected static final Integer[] ARR =
            {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

    public static void main(String[] args) {
        Main main = Main.instance.get();
        main.printIntArray("Main: ", ARR);

        main.bubbleSortingInAscendingOrder(
                main.filterForIntArray(
                        main.filterForIntArray(ARR, isPositive, "Filtered as Positive"),
                        isEven, "Filtered as Even"),
                "Sorted in ascending order");
    }
}