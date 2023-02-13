package control;

/**
 * while loop
 */
public class Control5_1 {
    public static void main(String[] args) {
        int i = 10; // while 반복 횟수 , 즉 for 문의 초기화

        // 후위연산자
        while (i-- != 0) {
            System.out.println(i);
        }

        // 위 코드와 같은 동작을 수행
        while (i != 0) {
            i--;
            System.out.println(i);
        }
    }
}
