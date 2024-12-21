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
    }
}
