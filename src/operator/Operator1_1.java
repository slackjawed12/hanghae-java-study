package operator;

public class Operator1_1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("-x + 3 = " + (-x + 3)); // -10

        System.out.println("x + 3 * y = " + (x + 3 * y)); // 70

        System.out.println("x + 3 > y - 2 = " + (x + 3 > y - 2));

        System.out.println("x + 3 < y - 2 = " + (x + 3 < y - 2));

        System.out.println("x > 3 && y < 2 =" + (x > 3 && y < 2));

        int result = x + y * 3;
        System.out.println("result = " + result);
    }
}
