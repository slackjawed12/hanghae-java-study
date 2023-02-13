package control;

public class Control3_3 {
    public static void main(String[] args) {
        // 초기화 시 변수 2개 사용 가능. 단, 타입이 같아야 한다.
        for (int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.println("i는 현재 " + (i) + "입니다.");
            System.out.println("j는 현재 " + (j) + "입니다.");
        }
        System.out.println();
        // 변수 2개를 사용하여 조건식 구성
        for (int k = 1, t = 10; k <= 10 && t > 2; k++, t--) {
            System.out.println("k는 현재 " + (k) + "입니다.");
            System.out.println("t는 현재 " + (t) + "입니다.");
        }
    }
}
