package exercise4;

public class Exercise4_4 {
    public static void main(String[] args) {
        int sum = 0;
        int s = 1;
        int num = 0;
        while(sum!=100) {
            sum += ++num*s;
            s*=-1;
        }
        System.out.println("num = " + num);
        System.out.println("sum = " + sum);
    }
}
