package ctrl;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        // 형식 문자열 출력
        // %d : 정수
        // %f : 실수
        // %c : 문자
        // %x : 16진수
        // %s : 문자열

        // 제어문자
        // \n : 줄바꿈
        // \t : 탭(tab)문자

        int age = 10;
        String name = "홍길동";
        System.out.printf("홍길동님의 나이는 %d 입니다.\n", age );
        // println은 형식 문자열을 지원하지 않아 형식 문자열을 지원하는 printf를 쓰는 것

        // 구구단
        Scanner sc = new Scanner(System.in);

        System.out.print("출력할 단수를 입력하세요 >>> ");
        int dan = sc.nextInt();
        int i = 1;
        while ( i < 10 ) {
            System.out.printf("%d x %d = %d\n", dan, i, dan*i);
            i += 1;
        }

        i = 0;
        while( true ) {
            System.out.println(i++);
            if (i >= 10)
                break;
        }
        sc.close();
    }
}
