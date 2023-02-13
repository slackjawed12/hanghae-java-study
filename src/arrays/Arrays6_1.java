package arrays;

import java.util.Arrays;

/**
 * 문자열 -> String : toString, deepToString
 * 비교 : Arrays.equals, Arrays.deepEquals
 */
public class Arrays6_1 {
    public static void main(String[] args) {
        int[] num = {0, 1, 2};
        int[][] score = {
                {88, 35, 100},
                {84, 60, 55},
                {100, 99, 72},
                {33, 54, 77}
        };

        System.out.println("Arrays.toString(num) = " + Arrays.toString(num));
        // 다차원 배열을 String으로 : deepToString(arr)
        System.out.println("Arrays.deepToString(score) = " + Arrays.deepToString(score));
        System.out.println();

        String[][] strArr1 = {
                {"AAA", "BBB", "CCC"},
                {"aaa", "bbb", "ccc"},
        };
        String[][] strArr2 = {
                {"AAA", "BBB", "CCC"},
                {"aaa", "bbb", "ccc"},
        };

        // 1 차원 비교에는 equals
        System.out.println("Arrays.equals(strArr1[0], strArr2[0]) = " + Arrays.equals(strArr1[0], strArr2[0])); // true
        System.out.println("Arrays.equals(strArr1[1], strArr2[0]) = " + Arrays.equals(strArr1[1], strArr2[0])); // false

        System.out.println("Arrays.equals(strArr1, strArr2) = " + Arrays.equals(strArr1, strArr2)); // false

        System.out.println();
        // 다차원 비교에는 deepEquals
        System.out.println("Arrays.deepEquals(strArr1, strArr2) = " + Arrays.deepEquals(strArr1, strArr2)); // true
    }
}
