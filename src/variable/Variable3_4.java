package variable;

/**
 * 문자열을 숫자, 문자로 변환
 */
public class Variable3_4 {
    public static void main(String[] args) {
        String str1= "100";
        String str2="3.14";
        String str3="8";

        // 문자열 -> int, double
        System.out.println("Integer.parseInt(str1) = "+Integer.parseInt(str1));
        System.out.println("Double.parseDouble(str2) = "+Double.parseDouble(str2));

        // 문자열 -> char
        System.out.println("str1.charAt(0) = "+ str1.charAt(0)+str1.charAt(1)+str1.charAt(2));
        System.out.println("str3.charAt(0) = "+str3.charAt(0));

    }
}
