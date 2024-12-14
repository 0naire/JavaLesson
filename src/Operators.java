import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Operators {


    public static void main(String[] args) {
        System.out.println("연산자 공부");

        // 산술 연산자 : +, -, *, /, %
        // 대입 연산자 : =, +=, -=, *=, /=. %=
        // 비교 연산자 : >, >=, <, <=, ==, !=
        // 논리 연산자 : &&, ||, !
        // 증감 연산자 : ++, --
        // 부호 연산자 : +, -
        // 비트 연산자 : &, |, ~, <<, >>, ^
        // 기타 연산자 : instanceof, 조건식 ? A : B

        // 산술 연산자 :
        int sum;
        int a = 10;
        int b = 3;
        sum = a + b;                            // 10 + 3 = 13
        System.out.println("sum = " + sum);

        sum = a - b;                            // 10 - 3 = 7
        System.out.println("sum = " + sum);

        sum = a * b;                            // 10 * 3 = 30
        System.out.println("sum = " + sum);

        sum = a / b;                            // 10 / 3 = 3
        System.out.println("sum = " + sum);

        sum = a % b;                            // 10 % 3 = 1
        System.out.println("sum = " + sum);

        float f1 = 10.0f;   // Float형 상수에서는 반드시 F(f)를 붙여준다.
        float f2= 3.0f;
        float result;

        result = f1 / f2;
        System.out.println("result = " + result);

        result = f1 % f2;
        System.out.println("result = " + result);

        result = f1 / b;            // *정수와 실수간의 연산 결과는 실수이다.
        System.out.println("result = " + result);

        result = f1 % b;
        System.out.println("result = " + result);

        sum = (int)(f1 / b);        // 실수와 정수의 연산 결과를 정수형으로 변환하여 대입해준다.
        System.out.println("sum = " + sum);

        result = (float) a / b;
        System.out.println("result = " + result);

        // 국어 : 88, 수학 : 79, 영어 : 97
        // 총점(정수형)과 평균(실수형)을 구하여 각각 출력하시오. <-- 숙제
        a = -b;
        System.out.println("a의 값 : " + a);

        a = -a;
        System.out.println("a의 값 : " + a);

        // 대입 연산자
        a = 10;
        sum = 0;
        sum += a;       // sum = sum + a;
        System.out.println("sum = " + sum);

        sum += a;       // sum = sum + a;
        System.out.println("sum = " + sum);

        sum -= a;   // sum = sum - a;
        System.out.println("sum = " + sum);

        sum *= a;   // sum = sum * a;
        System.out.println("sum = " + sum);

        sum /= a;   // sum = sum / a;
        System.out.println("sum = " + sum);

        sum %= a;   // sum = sum % a;
        System.out.println("sum = " + sum);

        // 관계(비교) 연산자
        a = 10;
        b = 3;

        boolean res;
        res = a > b;
        System.out.println("a > b의 결과 : " + res);

        res = a >= b;
        System.out.println("a > b의 결과 : " + res);

        res = a <= b;
        System.out.println("a > b의 결과 : " + res);

        res = a == b;
        System.out.println("a > b의 결과 : " + res);

        // 논리 연산자 : &&(AND), ||(OR), !(NOT)
        boolean flag1 = a > b;      // true
        boolean flag2 = a != b;     // true
        res = flag1 && flag2;   // true && true ===>
        System.out.println( flag1 + " && " + flag2 + " ==> " + res );

        res = flag1 || flag2;   // true || true ===>
        System.out.println( flag1 + " || " + flag2 + " ==> " + res);

        res = !flag1;
        System.out.println( "!" + flag1 + " ==> " + res);

        a = 10;
        a++;        // a += 1, a = a + 1
        a--;        // a -= 1, a = a - 1
        ++a;        // a +- 1, a = a + 1
        --a;        // a -= 1, a = a - 1
        System.out.println(a++);
        System.out.println(++a);

        // 콘솔로부터 값 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("a에 들어갈 값을 입력하세요 >>> ");
        a = sc.nextInt();       // int형 정수를 콘솔로부터 입력 받아서 변수 a에 대입하기

        b = a % 10; // 1의 자리를 구하는 연산
        System.out.println("a의 값 : " + a);
        System.out.println("a의 1의 자리의 값 : " + b);

        // 삼항 연산자
        String strOut = "";

        System.out.println("a에 들어갈 값을 입력하세요 >>> ");
        a = sc.nextInt();   // int형 정수를 콘솔로부터 입력받아서 변수 ㅁ에 대입하기

        strOut = a % 2 == 0 ? "짝수" : "홀수";
        System.out.println(a + "는 " + strOut + "입니다.");

        sc.close();


        // 기타 연산자 : instanceof
        flag1 = strOut instanceof String;

        // 비트 연산자 : &, |, ~, ^, <<, >>
        a = 3;      // 0011
        b = 5;      // 0101
        sum = a & b;
        System.out.println("a & b : " + sum);

        sum = a | b;
        System.out.println("a & b : " + sum);

        sum = ~a;   // 0011 --> 1100
    }
}
