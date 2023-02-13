package variable;

public class Variable3_3 {
    public static void main(String[] args) {
        int num = 5;
        char ch = '5';

        // 숫자 -> 문자열
        System.out.println("num + \"\" = " + num + "");
        System.out.println("num + \"\" + \"5\" = " + num + "" + "5");

        // 문자 -> 문자열
        System.out.println("ch +\"\" = " + ch + "");
        System.out.println("ch +\"\" + \"8\" = " + ch + "" + "8");

        char ch2 = '9';
        System.out.println("ch + ch2 = " + ch + ch2); // 결과 : 59 - 앞에 문자열이 먼저 나타나므로 concat
        System.out.println("(ch + ch2) = " + (ch + ch2)); // 결과 : 110 - 괄호로 int 계산을 먼저함
    }
}
