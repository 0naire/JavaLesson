package ctrl;

public class Loops1 {
    public static void main(String[] args) {
        /*
        * 반복문
        * while ( 조건식 )
        * {
        *       위 조건식이 참(true)일때 실행되는 명령문들...
        * }
        */

        // i = 0
        // i = 2
        // i = 4
        // i = 6
        // i = 8

//        int i = 0;
//        while ( i < 9 ) {
//            System.out.println("i의 값 : " + i);
//            // i = i + 1;
//            i += 2;
//            // i++;
//        }

//        int i = 0;
//        i = 1;
//        int total = 0; // 1 + 2 + 3 + 4 + ... + 10
//        while ( i <= 10 ) {
//            total += i;
//            i++;
//            System.out.println("total : " + total);
//        }
//    }

        int d = 0;
        d = 2;
        int tot = 1; // 1 + 3 + 5 + 7 + 9
        while ( d <= 26) {
            tot += d;
            d += 2;
            System.out.println("total : " + tot);
        }
    }
}
