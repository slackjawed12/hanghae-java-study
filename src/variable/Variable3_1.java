package variable;

/**
 * 정수형 오버플로우
 */
public class Variable3_1 {
    public static void main(String[] args) {
        short sMin = -32768;
        short sMax = 32767;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin -1 = " + (short) (sMin - 1)); // 32767

        System.out.println("sMax = " + sMax);
        System.out.println("sMax + 1 = " + (short) (sMax + 1)); // -32768

        char cMin = 0;
        char cMax = 65535;

        System.out.println("cMin = " + (int) cMin);
        System.out.println("cMin - 1 = " + (cMin - 1));       // -1
        System.out.println("(int)(--cMin) = " + (int) (--cMin)); // 65535

        System.out.println("cMax = " + (int) cMax);
        System.out.println("cMax + 1 = " + (cMax + 1)); // 65536
        System.out.println("(int)(++cMax) = " + (int) (++cMax));  // 0
    }
}
