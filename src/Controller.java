import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        // 조건문

         /* if의 첫 번째 형식
         *  if ( 조건식 ) {
         *  // 지역(Local)
         *  조건식이 참인 경우 1
         *  조건식이 참인 경우 2
         *  조건식이 참인 경우 3
         *  ...
         * }
         */

        /*  if의 두 번째 형식
         *  if ( 조건식 ) {
         *  조건식이 참인 경우 실행될 명령문들..
         *  } else {
         *  조건식이 거짓일 경우 실행될 명령문들..
         */

        /* if의 세 번째 형식
        *   if ( 조건식1 ) {
        *   조건식1이 참인경우 실행될 명령문들...
        *   } else if {
        *   위 조건식들이 모두 거짓인 경우에 실행될 명령문들...
        *   } else if {
        *   위 조건식들이 모두 거짓인 경우에 실행될 명령문들...
        *   } else {
        *   위 조건식들이 모두 거짓인 경우에 실행될 명령문들...
        *   }
         */

        // 콘솔로부터 입력받을 수 있는 입력 객체를 생성한다.
        Scanner sc = new Scanner(System.in);

        // 콘솔에 프롬프트를 출력한다.
//        System.out.print("숫자를 입력하세요 >>> ");
//        int number = sc.nextInt();  // 콘솔로부터 점수를 입력받아 number라는 변수에 대입

//        // number를 판단하여 출력 여부를 결정한다.
//        if (number % 2 == 0) {
//            System.out.println("입력한 값 " + number + " 은/는 짝수입니다.");
//        }
//          if (number % 2 == 1) {
//              System.out.println("입력한 값 " + number + " 은/는 홀수 입니다.");
//          }

//        if (number % 2 == 0) {
//            System.out.println("입력한 값 " + number + " 은/는 짝수입니다.");
//        } else {
//            System.out.println("입력한 값 " + number + " 은/는 홀수 입니다.");
//        }

//        // 응용 문제 > 숫자를 입력 했을때 6의 배수가 맞는지 확인하기
//        if (number % 6 == 0) {
//            System.out.println("입력한 값 " + number + " 은/는 6의 배수 입니다.");
//        } else {
//            System.out.println("입력한 값 " + number + " 은/는 6의 배수가 아닙니다.");
//        }
//
        // 응용 문제2 > 국어, 역사 시험 두 과목의 시험 점수를 입력받아서, 두 과목의 평균 값이 60점 이상이면 합격, 미만이면 불합격을 출력하기.
        // 출력 형식)
        // 국어 점수를 입력하세요 >>> 80
        // 역사 점수를 입력하세요 >>> 80
        // 평균은 80.0 점 입니다, 합격 입니다.

//        int kor;        // 국어 점수
//        int history;    // 역사 점수
//        int total;      // 총점
//        float avg;      // 평균
//
//        System.out.print("국어 점수를 입력하세요. >>> ");
//        kor = sc.nextInt();
//
//        System.out.print("역사 점수를 입력하세요. >>> ");
//        history = sc.nextInt();
//
//        total = kor + history;  // 총점을 구한다.
//        avg = total / 2.0F;     // 평균 값을 구한다.
//        if ( avg >= 60.0F ) {
//            System.out.println("평균은 " + avg + " 점 입니다, 합격 입니다.");
//        } else {
//            System.out.println("평균은 " + avg + " 점 입니다, 불합격 입니다.");
//        }

        // 응용문제 3)
        // 키를 입력 받아서 120.0cm 이상이면 놀이기구 탑승 가능, 미만이면 탑승 불가를 출력하기
        // 키를 입력하세요 >>> 177.6
        // 놀이기구 탑승 가능

        // 키를 입력하세요 >>> 113.5
        // 놀이기구 탑승 불가능

        float height;
        System.out.print("키를 입력하세요 >>> ");
        height = sc.nextInt();

        if ( height >= 120.0F ) {
            System.out.println("놀이기구 탑승 가능");
        } else {
            System.out.println("놀이기구 탑승 불가능");
        }

        //
        // 세번째 if문 예제
        //

        // 지하철 요금 계산기
        // 일반(19세 이상 65세 미만) : 1500원
        // 청소년(14세 이상 19세 미만) : 1000원
        // 어린이(8세 이상 14세 미만) : 500원
        // 유아(0 ~ 7세) : 0원
        // 어르신(65세 이상) : 0원

//        int age;
//        age = sc.nextInt();
//
//        if ( age >= 65 ) {
//            System.out.println("지하철 요금은 0원 입니다.");
//        } else if ( age >= 19 && age < 65 ){
//            System.out.println("지하철 요금은 1500원 입니다.");
//        } else if ( age >= 14 && age < 19) {
//            System.out.println("지하철 요금은 500원 입니다.");
//        } else if ( age >= 8 && age < 14 ) {
//            System.out.println("지하철 요금은 500원 입니다.");
//        } else {
//            System.out.println("지하철 요금은 0원 입니다.");
//        }

        System.out.println("1. 돈까스");
        System.out.println("2. 냉면");
        System.out.println("3. 김밥");
        System.out.println("4. 순대");
        System.out.println("5. 어묵");
        System.out.println("6. 안시킴");

        System.out.println("메뉴 번호를 선택하세요 >>> ");
        int menu = sc.nextInt();

        switch ( menu ) {
            case 1: {
                System.out.println("돈까스를 주문 완료했습니다.");
                break;
            }

            case 2: {
                System.out.println("냉면을 주문 완료했습니다.");
                break;
            }

            case 3: {
                System.out.println("김밥을 주문 완료했습니다.");
                break;
            }

            case 4: {
                System.out.println("순대를 주문 완료했습니다.");
                break;
            }

            case 5: {
                System.out.println("어묵을 주문 완료했습니다.");
                break;
            }

            case 6: {
                System.out.println("주문을 하지 않았습니다.");
            }
        }


        System.out.println("프로그램을 종료합니다.");

        sc.close();
    }
}
