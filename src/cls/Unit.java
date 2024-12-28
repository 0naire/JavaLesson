package cls;

public class Unit {
    private int hp;
    private int power;
    private int name;

    public Unit(int hp, int power, int name) {
        this.hp = hp;
        this.name = name;
        this.power = power;
        System.out.printf("hp:%d, power%d\n", this.hp, this.power);
    }

    public void move(int x, int y) {
        System.out.printf("(%d, %d)위치로 이동합니다.\n", x, y);
    }

    // 메소드의 정의 방법
    // 접근 제한자 변환형 메소드이름(매개변수들...)

    // 이름을 반환하는매소드



    // power 반환하는 메소드
    public int getPower() {
        return power;
    }

    public void setHp(int hp) {
        if (hp < 0)
            return;

        this.hp = hp;
    }

    public void setName(String name) {
        if ( !name.isEmpty()) { // name 문자열이 반문자열이 아니면

        }
    }

}

