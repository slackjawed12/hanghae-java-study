package exercise3;

public class Exercise3_6 {
    public static void main(String[] args) {
        int fahrenheit = 29;
        System.out.println((5.0f / 9 * (fahrenheit - 32)));
        float celcius = (int) (5.0f / 9 * (fahrenheit - 32) * 1000) % 10 >= 5
                ? (int) (5.0f / 9 * (fahrenheit - 32) * 100 + 1) / 100.0f
                : (int) (5.0f / 9 * (fahrenheit - 32) * 1000) % 10 <= -5
                ? (int) (5.0f / 9 * (fahrenheit - 32) * 100 - 1) / 100.0f
                : (int) (5.0f / 9 * (fahrenheit - 32) * 100) / 100.0f;

        float celcius2 = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("celcius = " + celcius);
        System.out.println("celcius2 = " + celcius2);
    }
}
