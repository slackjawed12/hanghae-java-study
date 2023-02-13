package operator;

/**
 * 비교 연산자 - int, char
 */
public class Operator6_1 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 6;
        char c1 = 'A', c2 = 'B';

        System.out.println("n1 >= n2 = " + (n1 >= n2));
        System.out.println("n1 <= n2 = " + (n1 <= n2));

        System.out.println("n1 == n2 = " + (n1 == n2));
        System.out.println("n1 != n2 = " + (n1 != n2));

        System.out.println("c1 < c2 = " + (c1 < c2));
        System.out.println("c1 > c2 = " + (c1 > c2));
    }
}
