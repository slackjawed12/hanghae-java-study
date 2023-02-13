package arrays;

import java.util.Arrays;

/**
 * 배열 복사 : copyOf(), copyOfRange()
 */
public class Arrays6_2 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println();
        // copyOf
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr, 3); // 3개
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));
        // 7개 복사 -> 범위넘은 부분은 초기화값
        int[] arr4 = Arrays.copyOf(arr, 7);
        System.out.println("Arrays.toString(arr4) = " + Arrays.toString(arr4));

        System.out.println();
        // copyOfRange
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println("Arrays.toString(arr5) = " + Arrays.toString(arr5));
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);// 범위가 넘어가는 복사는 초기화값이 들어간다.
        System.out.println("Arrays.toString(arr6) = " + Arrays.toString(arr6));
    }
}
