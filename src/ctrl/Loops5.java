package ctrl;

public class Loops5 {
    public static void main(String[] args) {
        // for()문
        // for(초기식; 조건식; 증감식) {
        //      반복 실행할 명령문들...
        //      ...
        // }
        for(int i=0; i<5; i++) {                // 참일때까지 계속 실행함
            System.out.println("i = " + i);
        }

        int i = 0;                              // 위에 방법을 while 문으로 나타내면 다음과 같음
        while( i < 5 ) {
            System.out.println("i = " + i);
            i++;
        }

        int total = 0;                          // 1부터 10까지만 더하고 멈추기
        for(int z=0; z<=10; z++) {
            total += z;
        }
        System.out.println("total = " + total);

        // total = 1 + 3 + 5 + 7 + 9
        total = 0;                              // int = total2보단 int를 생략하면 다른 값을 넣겠다는 뜻
        for(int x=1; x<10; x+=2) {              // x+=2 <-- 1, 3, 5, 7, 9를 하기 위해 2씩 더하는 것
            total += x;
        }
        System.out.println("total = " + total);
    }
}
