package cls.generic;

import cls.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListCollection {
    public static void printList(List list) {
        for (Object o : list) {
            System.out.print(o);
            System.out.println("\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // List Collection
        // 데이터 배열
        // 데이터 추가, 삭제, 수정 기능을 제공한다.
        // 데이터의 중복이 가능하다.
        // 데이터의 순서가 존재한다. (인덱싱이 가능하다)
        // 사이즈(크기)가 유동적이다.
        // List ==> ArrayList, LinkedList

        // 정수를 저장할 수 있는 리스트
        List<Integer> listInt = new ArrayList<>();
        for(int i=0; i<5; i++) {
            listInt.add((i+1)*10);
        }

        // 데이터 가져오기
        for(Integer num : listInt) {
            System.out.printf("%d\t", num );
        }
        System.out.println();   // 줄바꿈

        // 정렬
        Collections.sort(listInt);

        // listInt의 2번 인덱스에 해당하는 값을 100으로 "수정"
        listInt.set(2, 100);

        // 데이터를 중간에 끼워놓기(Insert)
        listInt.add(1, 200);

        // 데이터 가져오기
        printList(listInt);

        // 정렬
//        Collections

        // listInt의 2번 인덱스에 해당하는 값을 가져와서 출력
        System.out.println( "2번 인덱스의 값 : " + listInt.get(2) );

        // listInt에 포함되어 있는 아이템(요소)들의 개수를 가져와서 출력
        System.out.println( "전체 아이템들의 개수 : " + listInt.size() );

        // 아이템 삭제
        listInt.remove(1);

//        printList();

        // 데이터 가져와서 출력하기
        for(Integer num : listInt) {
            System.out.printf("%d\t", num );
        }

        // 전부 삭제, 클리어
        listInt.clear();

        System.out.println();
        // listInt에 포함되어 있는 아이템(요소)들의 개수를 가져와서 출력
        System.out.println("전체 아이템들의 개수 : " + listInt.size() );


        //
        // 1. 문자열(String)을 저장할 수 있는 ArrayList strList를 생성하세요.
        // 2. strList에 "강호동", "유재석", "이순신", "세종대왕"을 각각 순서대로 추가하세요.
        // 3. 추가한 뒤에 strList의 모든 내용을 출력하세요
        // 4. strList의 개수가 몇개인지 출력하세요
        // 5. "강호동"을 "안중근"으로 수정하세요
        // 6. "유재석"을 삭제하세요
        // 7. strList의 개수가 몇개인지 출력하세요
        // 8. 추가한 뒤에 strList의 모든 내용을 출력하세요
        // 9. strList의 내용을 정렬(sort)하세요
        // 10. 정렬한 뒤에 strList의 모든 내용을 출력하세요

        List<String> strList = new ArrayList<>();
        strList.add("강호동");
        strList.add("유재석");
        strList.add("이순신");
        strList.add("세종대왕");

        for(String num2 : strList) {
            System.out.printf("%s\t", num2);
        }
        System.out.println();

        // strList의 개수가 몇개인지 출력하세요
        System.out.println("strList의 아이템들의 개수 : " + strList.size());

        // 강호동 -> 안중근으로 수정
        strList.set(0, "안중근");

        // 유재석 삭제
        strList.remove(1);

        // strList의 개수가 몇개인지 출력하세요
        System.out.println("strList의 아이템들의 갯수 : " + strList.size());

        // strList의 내용 출력
        printList(strList);
    }
}
