package variable;

/**
 * 문자 - 숫자 간 변환 예제
 */
public class Variable3_2 {
    public static void main(String[] args) {
        int num = 5;
        char ch = '5';

        System.out.println("num = " + num);
        System.out.println("(char)(num + '0') = " + (char) (num + '0'));

        System.out.println("ch = " + ch); // 5 -> char
        System.out.println("ch - '0' = " + (ch - '0')); // 5 -> int

        System.out.println("ch - '0' + 1 = " + (ch - '0' + 1)); // 6 -> int


    }
}
