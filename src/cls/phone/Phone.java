package cls.phone;

// interface : 메소드들이 모두 추상 메소드들로만 구성된 클래스
public interface Phone {


    public abstract boolean powerOn();
    public abstract void powerOff();
    public abstract int charge();
    public abstract boolean isOn();
    public abstract void playVideo();
}

// Car : interface

// method
// void go()
// void stop()
// void turn(boolean left)
//

// Sedan : Car 인터페이스를 구현
// doors : 정수형 변수
// 기본 생성자에서 doors를 0으로 초기화한다.
// 추가 생성자에서 doors를 매개변수로 받아서 doors값을 초기화한다.