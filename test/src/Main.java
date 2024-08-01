import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.drive(); // BMW drive
        System.out.println(bmw.a);

        Car car = bmw;
        car.drive(); // BMW drive
        System.out.println(car.a);
    }
}
