//package cls;
//
//public class Person {
//    // 접근 제한자 : private, protected, public
//    // private : 외부에서 일체 접근 금지, 상속안됨, 클래스 내부에서만 접근가능
//    // protected : 같은 패키지의 객체들에서 접근 가능, 상속도 가능, 다른 패키지의 객체들에서 접근 불가
//    // public : 제한없음, 완전 공개
//
//    // 데이터
//    private int age;        // 나이 데이터(속성, Attribute, Property, Member Variable)
//    private String name;    // 이름 데이터 0개의 사용위치
//    private float height;
//
//
//
//    // 생성자 : 클래스명과 같음, 객체가 생성될때 한번 호출됨
//    public Person(String n, float h, int a) {
//        age = a;
//        name = n;
//        height = h;
////        System.out.println("Person 클래스로부터 객체가 생성됨");
//    }
//
//    public Person() {
//
//    }
//
//    // 행위(Method, Member function)
//    public void introduce() {
//        System.out.println("안녕하세요, 저는 " + name + "이고, ");
//        System.out.println("나이는 " + age + "살 입니다.");
//    }
//
//
//    public void setAge(int i) {
//        if (age < 0)
//            return;
//
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        if (name.isEmpty())
//            return;
//
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public float getHeight() {
//        return height;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return getName();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        boolean isPerson = obj instanceof Person;
//        if (!isPerson)
//            return false;
//    }
//
//    @Override
//    public int hashCode() {
//        int code = name.length() + (int) height + age;
//        return code;
//    }
//
//    // static 내부 클래스 Builder 정의
//    public static class Builder {
//        // 데이터
//        private int a;        // 나이 테이터 속성
//        private String n;    // 이름 데이터 0개의 사용위치
//        private float h;
//
//        public Builder name(String n) {
//            this.n = n;
//            return this;
//        }
//
//        public Builder age(int a) {
//            this.a = a;
//            return this;
//        }
//
//        public Builder height(float h) {
//            this.h = h;
//            return this;
//        }
//
//        public Person build() {
//            return new Person(n, h, a);
//        }
//    }
//}
//
//// getAge : 나이를 반환하는 메소드
//// setAge : 나이를 설정(저장)하는 메소드, 음수는 설정할 수 없도록 제한.
//
//// getName : 이름(문자열)을 반환하는 메소드
//// setName : 이름(문자열)을 설정하는 메소드, 입력값이 비어있으면 설정할 수 없도록 제한