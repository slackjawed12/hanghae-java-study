package exercise3;

public class Exercise3_6 {
    public static void main(String[] args) {
        int fahrenheit = 99;
        float celcius = (int) (5.0f / 9 * (fahrenheit - 32) * 1000) % 10 >= 5
                ? (int) (5.0f / 9 * (fahrenheit - 32) * 100 + 1) / 100.0f
                : (int) (5.0f / 9 * (fahrenheit - 32) * 1000) % 10 <= -5
                ? (int) (5.0f / 9 * (fahrenheit - 32) * 100 - 1) / 100.0f
                : (int) (5.0f / 9 * (fahrenheit - 32) * 100) / 100.0f;

        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("celcius = " + celcius);
    }
}
