package variable;

/**
 * 변수 값 교환하기
 */

public class Variable4_3 {
    public static void main(String[] args) {
        int x = 10, y = 20; // 한 줄로 초기화 가능
        x = y;
        y = x;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int a = 10, b=20;
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("temp = " + temp);
    }
}
