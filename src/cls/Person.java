package cls;

public class Person {
    // 접근 제한자 : private, protected, public
    // private : 외부에서 일체 접근 금지, 상속안됨, 클래스 내부에서만 접근가능
    // protected : 같은 패키지의 객체들에서 접근 가능, 상속도 가능, 다른 패키지의 객체들에서 접근 불가
    // public : 제한없음, 완전 공개

    // 데이터
    int age;        // 나이 데이터(속성, Attribute, Property, Member Variable)
    String name;    // 이름 데이터 0개의 사용위치
    float height;

    // 생성자 : 클래스명과 같음, 객체가 생성될때 한번 호출됨
    public Person(String n, float h, int a) {
        age = a;
        name = n;
        height = h;

        System.out.println("Person 클래스로부터 객체가 생성됨");
    }

    public Person() {

    }

    // 행위(Method, Member function)
    void introduce() {

    }
}