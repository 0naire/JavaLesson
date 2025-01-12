//package cls.animal;
//
//import java.sql.SQLOutput;
//
//public class AnimalTest {
//    public static void main(String[] args) {
//        // 추상 클래스를 객체화 시킬수 없다
////        Animal ani = new Animal();
////        System.out.println( ani );
////        ani.crying();
//
//        Pig pig = new Pig();
//        System.out.println( pig );  // Animal class의 toString 호출
//        pig.crying();
//
//        Dog dog = new Dog();
//        System.out.println( dog );
//        dog.crying();
//
//        // 클래스명 인스턴스명 = new 해당 클래스의 생성자 호출
//
//        Dog dog1 = new Jindo();
//        dog1.crying();
//
//        Dog dog2 = new Bulldog();
//        dog2.crying();
//
//        Dog dog3 = new Poodle();
//        dog3.crying();
//
//        Dog[] dogs = new Dog[3];
//        dogs[0] = dog1;
//        dogs[1] = dog2;
//        dogs[2] = dog3;
//        for(Dog dog : dogs ) {
//            dog.crying();
//        }
//
//        Animal[] anis = new Animal[4];
//        anis[0] = pig;
//        anis[1] = dog1;
//        anis[2] = dog2;
//        anis[3] = dog3;
//        for(Animal ani : anis) {
//            ani.crying();
//        }
//
//        for(Animal ani : anis) {
//            if (ani instanceof Pig)
//                System.out.printf("%s는 Pig입니다", ani.name);
//            else if (ani instanceof Jindo)
//                System.out.printf("%s는 Jindo입니다");
//            else if (ani instanceof Bulldog)
//                System.out.printf("%s는 Bulldog입니다");
//            else if (ani instanceof Poodle)
//                System.out.printf("%s는 Poodle입니다");
//
//            }
//        }
//    }
