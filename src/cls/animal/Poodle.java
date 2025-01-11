package cls.animal;

public class Poodle extends Dog {
    public Poodle() {
        name = "푸들";
        sound = "월월";
    }

    @Override
    public void crying() {
        System.out.printf("%s은 %s 작게 짓습니다\n", name, sound);
    }
}
