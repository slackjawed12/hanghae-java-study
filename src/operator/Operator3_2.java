package operator;

public class Operator3_2 {
    public static void main(String[] args) {
        int i = (int) 3.14f;
        System.out.println("(int)3.14f = " + i);

        byte b = 100;    // byte b = (byte)100 으로 컴파일러가 자동 형변환
        System.out.println("b = " + b);

        int num = 100;
        byte b2 = (byte) num;

        System.out.println("b2 = " + b2);

        byte b3 = (byte)1000;
        System.out.println("(byte)1000 = " + b3);

    }
}
