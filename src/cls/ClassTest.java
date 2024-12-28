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
        System.out.println(str1);

        String str2 = new String("헬로우 자바");
        System.out.println(str2);

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
//
//        // Unit class test
//        Unit u1 = new Unit(100, 10);
//        Unit u2 = new Unit(150, 15);
//        Unit u3 = new Unit(200, 150);
//
//        // int u1_hp = u1.getHp();
//        // int u2_hp = u2.getHp();
//        System.out.printf("u1의 HP는 %d 입니다.\n", u1.getHp);
//        System.out.printf("u2의 HP는 %d 입니다.\n", u2.getHp);
//
//        System.out.printf("");
//
//        // 이름 반환하는 메소드
//        public String getName() {
//            return name;
//        }
//        // power 반환하는 메소드
//        public int getPower() {
//            return power;
//        }
//        public void setHp(int up) {
//            if ( hp < 0 )
//                return;     // 강제 종료
//
//            this.hp = hp;
//        }
//    }

        /*
         * BankAccount : 클래스 이름
         * accountNumber : 정수
         * balance : 정수(잔액), 접근 금지
         *
         * 생성자 : 매개변수로 accountNumber만 입력받고, balance는 무조건 0으로 설정함.
         *
         * 메소드(기능)
         * deposit*(입금) : 매개변수로 정수를 주면 balance를 매개변수 값만큼 증가 시킴
         * 반환값 없음
         *
         * withdraw(출금) : 매개변수로 출금액(정수)를 주면 balance를 매개변수 값만큼 감소 시킴
         * 반환값 없음
         *
         * print : 매개변수 없고 반환값 없는 출력 가능
         * 출력 형식)
         * 현재 잔액은 xxx원 입니다.
         */
    }
}
