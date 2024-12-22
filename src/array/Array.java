package array;

public class Array {
    public static void main(String[] args) {
        // 정수형(short) 변수
        short arr[] = new short[3];

        arr[0] = 100;   // arr배열의 첫번째 아이템에 값 100을 대입
        arr[1] = 90;   // arr배열의 두번째 아이템에 값 90을 대입
        arr[2] = 80;   // arr배열의 세번째 아이템에 값 80을 대입

        char[] str = new char[5];
        str[0] = 'A';
        str[1] = 'B';
        str[2] = 'C';
        str[3] = 'D';
        str[4] = 'E';

        char[] str2 = new char[10];
        str[0] = 'I';
        str[1] = 'A';
        str[2] = 'K';
        str[3] = 'K';
        str[4] = 'K';
        str[5] = 'K';
        str[6] = 'K';
        str[7] = 'K';
        str[8] = 'K';
        str[9] = 'K';

        // double형 배열 (10칸 선언)
        double[] farr = new double[10];

        // 배열의 순변 ==> 인덱스(index)
        // index는 0부터 배열의 개수-1까지 지정 가능하다.

        for(int k=0; k<10; k++) {
            farr[k] = (double)(k + 1); // 명시적 형변환
        }

        for(int k=0; k<10; k++) {
            System.out.println( farr[k] );
        }

        // arr배열에 for문들을 이용하여 10, 20, 30을 대입하세요

        for(int i=0; i<3; i++) {
            arr[i] = (short) ((i + 1) * 10);
        }

        char ch = 'a';
        for(int i=0; i<5; i++ ) {
            str[i] = (char)(ch + i);
            System.out.println(str[i] );
        }
    }
}
