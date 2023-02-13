package exercise4;

public class Exercise4_6 {
    public static void main(String[] args) {
        // 서로 다른 주사위
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }

        // 같은 주사위
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= i; j--) {
                if (i + j == 6) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }
}
