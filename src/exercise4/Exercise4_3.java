package exercise4;

public class Exercise4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;
        int i = 0;
        while (++i <= 10) {
            totalSum += sum += i;
        }

        System.out.println("totalSum = " + totalSum);
    }
}
