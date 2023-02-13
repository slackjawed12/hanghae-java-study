package operator;

/**
 * 산술 시 형변환 규칙
 */
public class Operator4_2 {
    public static void main(String[] args) {
        char ch = '2';

        System.out.println("ch - '0' = " + (ch - '0'));   // int형 2

        int a = 1_000_000;
        int b = 2_000_000;

        long l = (long) a * b;
        System.out.println("l = " + l);
    }
}
