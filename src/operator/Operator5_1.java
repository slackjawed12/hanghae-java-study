package operator;

/**
 * Math 클래스
 */
public class Operator5_1 {
    public static void main(String[] args) {
        // Math.round : 실수를 소수점 첫째자리에서 반올림한 정수를 반환
        long result = Math.round(3.645678);
        System.out.println("result = " + result);

        double pi = 3.141592;
        // 소수점 넷째자리에서 반올림한 값 : 1000곱하고 1000.0으로 나누면 됨
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);

        // 버림값 : int 형변환 이용
        double pi2 = 3.141592;
        System.out.println("(int)(pi2 * 1000) = " + (int) (pi2 * 1000));    // 3141
        System.out.println("(int)(pi2 * 1000) / 1000.0 = " + (int) (pi2 * 1000) / 1000.0); //3.141
    }
}
