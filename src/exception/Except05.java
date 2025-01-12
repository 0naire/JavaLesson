package exception;

public class Except05 {
    public static void main(String[] args) {
        inputAge ageInput = new inputAge();
        try {
            int age = ageInput.input();
        } catch (CustomAgeException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println( e.getMessage());
        }
    }
}
