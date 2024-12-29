package cls;

public class Unit {
    protected boolean steampack;
    private int hp;
    private int power;
    private String name;

    public Unit() {
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
    public int getHp() {
        return hp;
    }

    // 이름을 반환하는매소드

    public String getName() {
        return name;
    }

    // power 반환하는 메소드
    public int getPower() {
        return power;
    }

    public void setHp(int hp) {
        if (hp < 0)
            return; // 메소드 강제 종료

        this.hp = hp;
    }

    public void setName(String name) {
        if ( !name.isEmpty()) { // name 문자열이 반문자열이 아니면...
        // if ( name.length() > 0 ) {   // String.length() : 문자열의 길이를 반환하는 메소드
            // 이름의 길이가 8보다 크면 이름값을 설정함
            this.name = name;
        }
    }

    public void setPower(int power) {
        if ( power < 0 )
            return;

        this.power = power;
    }

    public void damage(int power) {
        hp -= power;
        System.out.printf("%s의 hp : %d\n", name, hp);
    }

    public void attack(Unit target) {
        target.damage(power);
        System.out.printf("%s가 %s를 공격함\n", this.name, target.getName());
    }
}

// Marine
