package exercise4;

public class Exercise4_1 {
    public static void main(String[] args) {
        int x = 20;
        if (x > 10 && x < 20) {
            System.out.println(true);
        }
        char ch = 'a';
        if (ch != ' ' && ch != '\t') {
            System.out.println(true);
        }
        char ch2 = 'x';
        if (ch2 == 'x' || ch2 == 'X') {
            System.out.println(true);
        }
        char ch3 = '7';
        if ('0' <= ch3 && ch3 <= '9') {
            System.out.println(true);
        }
        char ch4 = 'g';
        if (('a' <= ch4 && ch4 <= 'z') || ('A' <= ch4 && ch4 <= 'Z')) {
            System.out.println(true);
        }

        int year = 397;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(true);
        }

        boolean powerOn=true;
        if(!powerOn) {
            System.out.println(true);
        }

        String str="no";
        if(str.equals("yes")) {
            System.out.println(true);
        }
    }
}
