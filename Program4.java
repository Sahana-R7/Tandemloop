import java.util.HashMap;
import java.util.Map;

public class Program4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] multiples = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Map<Integer, Integer> counts = countMultiples(numbers, multiples);
        System.out.println(counts);
    }

    public static Map<Integer, Integer> countMultiples(int[] numbers, int[] multiples) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int multiple : multiples) {
            counts.put(multiple, 0);
        }

        for (int number : numbers) {
            for (int multiple : multiples) {
                if (number % multiple == 0) {
                    counts.put(multiple, counts.get(multiple) + 1);
                }
            }
        }

        return counts;
    }
}
