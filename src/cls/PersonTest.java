package cls;

public class PersonTest {
    public static void main(String[] args) {
        Person tom = new Person("tom", 175.8F, 30);
        Person john = new Person("John", 185.2F, 20);
        Person jane = new Person("Jane", 168.0F, 28);

        // Jane의 나이를 28살로 바꾸기
        jane.setAge(28);
        jane.introduce();

        // Student 클래스를 이용하여 객체 생성
        Student s1 = new Student("Elica", 170.0F, 15, "SBS Academy");
        s1.introduce();

        // s1의 학교를 :수원초등학교"라고 설정
        // s1의 학년을 2학년으로 설정
        s1.setSchool("수원초등학교");
        s1.setGrade(2);

        // 학교이름이 주어지는 생성자를 이용하여 s2 객체 생성
        Student s2 = new Student("Alice", 170.0F, 15, "SBS Academy");
        s2.introduce();

        // s2의 학년을 3학년으로 설정
        s2.setGrade(3);

        s1.introduce();
        s2.introduce();
    }
}
