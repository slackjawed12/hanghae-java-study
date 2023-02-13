package variable;

/**
 * 변수의 종류
 */
public class Variable1_4 {
    static int classVal =100;   // 클래스 변수
    int instanceVal = 200;
    public static void main(String[] args) {
        int num;
        num =300;
        System.out.println("num = " + num);

        // 인스턴스 변수의 출력
        Variable1_4 instance = new Variable1_4();
        System.out.println("instance.instanceVal = " + instance.instanceVal);

        // 클래스 변수의 출력 - 클래스 이름에서 바로 접근 가능
        System.out.println("classVal = " + classVal);
        System.out.println("Variable1_4.classVal = " + Variable1_4.classVal);
    }
}
