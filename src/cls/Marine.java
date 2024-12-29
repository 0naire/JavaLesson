package cls;

public class Marine extends Unit {
    public Marine(String name) {
        super();
        // steampack : 논리형(boolean), 접근금지
        boolean steackpack;
        setName(name);
        setHp(200);
        steampack = false;
    }

    // setSteamPack
    public void setSteampack(boolean steampack){
        this.steampack = steampack;
    }

    public void attack(Unit target) {
        if ( steampack )
            setPower( getPower()*2 );

        super.attack(target);
    }
}

// 클래스 이름 : Tank from Unit
// 생성자 : 이름만 받아서 생성함, hp : 500, power : 50
// seize : boolean형 필드(멤버 변수) 선언하기
// setSize : seize 변수를 설정하는 setter 메소드
// attack 메소드 재정의 seize가 참이면 공격력 3배 아니면 원래대로 50
















