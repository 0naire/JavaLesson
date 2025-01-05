package cls.car;

public class CarTest {
    public static void main(String[] args) {
        // car1 : sendan 인스턴스 생성
        Sedan car1 = new Sedan(4);

        // truck1 : Truck 인스턴스 생성
        Poter truck1 = new Poter();

        CarLoader loader = new CarLoader();
        loader.load(car1);
        loader.load((Car) truck1);
    }
}
