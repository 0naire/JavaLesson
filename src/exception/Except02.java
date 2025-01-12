package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except02 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        boolean b0k = true;
        do {
            b0k = true;
            try {
                System.out.println("정수를 입력하세요 >>> ");
                number = Integer.parseInt(sc.nextLine());
                System.out.println("나누기 연산 : " + 10 % number);
            } catch ( NumberFormatException e) {
                System.out.println("정수를 입력하여야 합니다.");
                b0k = false;
            } catch ( ArithmeticException e) {
                System.out.println("연산 중 에러가 발생했습니다.");
                b0k = false;
            }
        } while( !b0k );


        sc.close();
    }
}
