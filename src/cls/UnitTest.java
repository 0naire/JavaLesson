package cls;

public class UnitTest {
    public static void main(String[] args) {
        Marine m1 = new Marine("마린1");
        Marine m2 = new Marine("마린2");

        m1.attack(m2);
        m2.attack(m1);
    }
}
