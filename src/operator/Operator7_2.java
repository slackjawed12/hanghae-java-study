package operator;

/**
 * 비트 연산자와 toBinaryString
 */
public class Operator7_2 {
    public static void main(String[] args) {
        int num1=8, num2=-8;
        System.out.println("8의 2진수 = "+Integer.toBinaryString(num1));
        System.out.println("-8의 2진수 = "+Integer.toBinaryString(num2));
        System.out.println("-9의 2진수 = "+Integer.toBinaryString(-9));

        System.out.println("num1 & num2 = " + Integer.toBinaryString(num1 & num2));
        System.out.println("num1 | num2 = " + Integer.toBinaryString(num1 | num2));
        System.out.println("num1 ^ num2 = " + Integer.toBinaryString(num1 ^ num2));
        System.out.println("~num1 = " + Integer.toBinaryString(~num1));

        System.out.println("num1 << 2 = " + Integer.toBinaryString(num1 << 2));
        // >> : 부호 유지하면서 지정 수만큼 비트를 오른쪽으로 이동
        System.out.println("num2 >> 2 = " + Integer.toBinaryString(num2 >> 2) + ", " + (num2 >> 2));
        // >>> : 모든 비트를 오른쪽으로 이동
        System.out.println("num2 >>> 2 = " + Integer.toBinaryString(num2>>>2) + ", "+(num2>>>2));
    }
}
