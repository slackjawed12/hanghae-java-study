package operator;

/**
 * 부호 연산자
 */
public class Operator2_2 {
    public static void main(String[] args) {
        int i = 10;
        i = +i;
        System.out.println("i = +i; = " + i);

        i = -10;
        i = -i;
        System.out.println("i = -i; = " + i);
    }
}
