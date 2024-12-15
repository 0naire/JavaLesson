public class gugudan {
    public static void main(String[] args) {
        // 2단
        /*
        * 2 x 1 = 2
        * 2 x 2 = 4
        * ...
        * 2 x 9 = 18
        */

        int i = 1;
        while( i<5 ) {
            System.out.printf("2 x %d = %d\n", i, 2*i);
            i += 1;
        }

        int i2 = 1;
        while ( i2 < 5 ) {
            System.out.printf("3 x %d = %d\n", i, 3*i2);
            i2 += 1;
        }
    }
}
