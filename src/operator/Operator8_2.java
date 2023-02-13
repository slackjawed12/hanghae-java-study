package operator;

/**
 * 대입 연산자
 */
public class Operator8_2 {
    public static void main(String[] args) {
        int num1 = 7, num2 = 7, num3 = 7;

        num1 = num1 - 3;
        num2 -= 3;
        num3 = -3;
        System.out.println("num1 = num1 -3 : " + num1);
        System.out.println("num2 -= 3 : " + num2);

        System.out.println("num3 = -3 : " + num3);
    }
}
