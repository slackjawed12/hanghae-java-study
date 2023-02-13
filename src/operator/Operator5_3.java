package operator;

/**
 * 나머지 연산자
 */
public class Operator5_3 {
    public static void main(String[] args) {
        int x = 10, y = 8;

        System.out.println("x를 y로 나눈 몫 = " + (x / y));

        System.out.println("x를 y로 나눈 나머지 = " + (x % y));

        int n = 3;
        int z = -3;
        System.out.println("x % n = " + x % n);
        System.out.println("x % z = " + x % z);
    }
}
