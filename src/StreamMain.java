import java.util.Comparator;
import java.util.List;

public class StreamMain {
    protected static final List<Integer> LIST =
            List.<Integer>of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

    public static void main(String[] args) {
        System.out.println("StreamMain: " + LIST);
        System.out.println("Finally list: " + LIST.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .toList()
        );
    }
}