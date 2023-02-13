package exercise4;

import java.util.stream.IntStream;

public class Exercise4_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0 && i % 3 != 0) sum += i;
        }

        int sum2 = IntStream.range(1, 21)
                .filter(x -> x % 2 != 0 && x % 3 != 0)
                .reduce(0, Integer::sum);

        System.out.println("sum = " + sum);
        System.out.println("sum2 = " + sum2);
    }
}
