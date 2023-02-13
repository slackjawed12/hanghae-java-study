package variable;

/**
 * 변수의 값 읽기
 */
public class Variable1_3 {
    public static void main(String[] args) {
        int year, age=23;

        year = age+2000;
        System.out.println("year = " + year);

        age = age+1;
        System.out.println("age = " + age);
        System.out.println("year = " + year);
    }
}
