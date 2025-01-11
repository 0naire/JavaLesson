package cls;

public class Student extends Person{

    // 외부에 노출 금지
    // 학교 : 문자열
    // 학년 : 정수


    private String school;  // 학교
    private int grade;      // 학년

    // Student 클래스의 생성자
    public Student() {
        // 부모 클래스의 생성자를 호출
        //super(n, h, a); // Person(n, h, a);
        school = "";
        grade = 1;
    }

    // Student 클래스만의 새로운 생성자
    public Student(String n, float h, int a, String s) {
        super(n, h, a);
        school = s;
        grade = 1;
    }

    // setSchool
    // setGrade
    // getSchool
    // getGrade

    public String getSchool() {
        return school;
    }

    public int getGrade() {
        return grade;
    }

    // 부모클래스로부터 override(재정의) ==> 기능의 확장(기능 업그레이드)
    public void introduce() {
        super.introduce();  // 부모 클래스의 introduce() 호출
        System.out.printf("%s학교, %d학년 입니다\n", school, grade);
    }

    public void setGrade(int i) {
    }

    public void setSchool(String 수원초등학교) {
    }
}