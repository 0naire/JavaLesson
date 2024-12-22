package array;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        final int COUNT = 6;

        // 랜덤한값(난수)를 만들어주는 객체를 생성한다.
        Random rend = new Random();

        int[] lotto = new int[COUNT];
        for(int i=0; i<COUNT; i++) {
            lotto[i] = rend.nextInt(1, 46);
        }

        // for문을 이용하여 lotto배열 출력하기
        lotto = new int[COUNT];
        for(int i=0; i<COUNT; i++) {
            lotto[i] = rend.nextInt(1, 46);
            System.out.println("lotto = " + COUNT);
        }
     }
}
