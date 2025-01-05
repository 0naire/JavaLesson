package cls.car;

public class Sedan implements Car {
    private int doors;

    public Sedan() {
        doors = 0;
    }

    public Sedan(int doors) {
        this.doors = doors;
    }

    @Override
    public void go() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void turn() {

    }
}

// Truck : implements Car
// Capacity : 정수
// 기본 생성자 : capacity값을 0으로 초기화 함
// 추가 생성자 : capacity값을 매개변수로 입력 받아서 초기화 합니다.

// method
// void setCap : capacity 설정, 매개변수 1개

// 추상 메소드
// 이름 : load
// 반환값 : int
// 매개변수 : int

// Truck ---> Poter
// Poter의 생성자에서 capacity값을 1000으로 설정
// load 구현