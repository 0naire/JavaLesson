package cls.generic;

import array.Array;

public class DataList<T> {
    private Object[] array;
    private int position;
    private int size;

    public DataList(int count) {
        array = new Object[count];
        position = 0;
        size = count;
    }

    public void add(Object obj) {
//        // array의 position 위치에 number를 대입한 뒤, position을 1 증가 시킴
//        try {
//            array[position++] = number;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println( e.getMessage() );
//        }
        if ( position >= size )
            System.out.println("더 이상 값을 추가할 수 없습니다.");
            return;
    }

    // 배열의 크기 반환한다.
    public int size() {
        return size;
    }

    public T get(int index) {
        try {
            return (T)array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        throw new ArrayIndexOutOfBoundsException("인덱싱 범위를 초과하였습니다.");
    }

    // toString()이라는 Object class의 메소드를 재정의

    @Override
    public String toString() {
        String ret = "";
        for(int i=0; i<size; i++) {
            String tmp = String.format("%d, ", array[i]);
            ret += tmp;
        }

        return ret;
    }
}
