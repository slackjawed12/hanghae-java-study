package operator;

/**
 * 전위, 후위 연산자
 */
public class Operator2_1 {
    public static void main(String[] args) {
        int k = 0, j = 3;

        // 후위형
        k=j++;
        System.out.println("k = j++;, k = " + k);   // 3
        System.out.println("k = j++;, j = " + j);   // 4

        k=0;
        j=3;

        // 전위형
        k = ++j;
        System.out.println("k = ++j;, k = " + k);
        System.out.println("k = ++j;, j = " + j);
    }
}
