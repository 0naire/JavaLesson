package cls;

import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        // Primitive Data Type
        // byte, char, short, int, long, float, double, boolean
        int number = 10;
        int number2 = 20;
        int number3 = 30;

        // Referenced Data Type
        String str1 = "Hello Java"; // 문자열 변수
        System.out.println( str1 );

        String str2 = new String("헬로우 자바");
        System.out.println( str2 );

        String str3 = new String();
        str3 = "이것은 자바 문자열입니다";

        // Scanner sc = new Scanner(System.in);
        //Random rend = new Random();

        Person kim = new Person();
        Person james = new Person();
        Person tom = new Person();

        kim.introduce();     // 메소드에 접근
        james.introduce();
        tom.introduce();
    }
}
