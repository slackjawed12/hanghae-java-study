package exercise5;

public class Exercise5_4 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int total = 0;
        float average = 0;

        int len = 0;
        for (int[] a : arr) {
            for (int x : a) {
                total += x;
            }
            len+=a.length;
        }
        average=(float)total/len;

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    }
}
