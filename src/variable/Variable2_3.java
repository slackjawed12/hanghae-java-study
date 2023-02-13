package variable;

public class Variable2_3 {
    public static void main(String[] args) {
        boolean flag2 = false;

        char grade3 = 'A';
        char ch = '\n'; // 0 ~ 65,535

        String str = "C";
        String name3 = "choi";

        byte val2 = 127; // -128 ~ 127

        short sval=128;

        int ob = 0b0101;
        int i = 100;
        int bigint = 100_1000; // '_' 로 끊어서 표현 가능
        System.out.println("bigint = " + bigint);
        int oct = 0172;
        int hex =0x100;

        float tax2=3.14f;

        double score1 = 3.1415926538979;    // d 생략 가능
        double score2 = 3.1415926538979d;

        float f1 = 10f;
        double d1 =10.;
        System.out.println(".10 : " + .10); // 0.1 출력
        double d2 =.10;
        double d3 =1e3;
        double d4 =-1e3;

    }
}
