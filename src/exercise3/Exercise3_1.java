package exercise3;

public class Exercise3_1 {
    public static void main(String[] args) {
        byte b =10;
        char ch='A';
        int i =100;
        long l =1000L;

        // 형 변환 생략 가능 : 4, 5
        b=(byte)i;
        ch =(char)b;
        short s= (short) ch;
        float f = (float) l;
        i  =(int)ch;
    }

}
