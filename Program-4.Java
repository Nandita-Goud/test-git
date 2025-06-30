import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Store results in a map
        Map<Integer, Integer> result = new LinkedHashMap<>();

        // Initialize map with keys from 1 to 9
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        // Count multiples
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : input) {
                if (num % i == 0) {
                    count++;
                }
            }
            result.put(i, count);
        }

        // Output the result
        System.out.println("Output:");
        System.out.println(result);
    }
}
