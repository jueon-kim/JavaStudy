package static2.ex;

public class Car {
    private static int totalCars;
    private String name;


    public Car(String name) {
        System.out.println("차랑 구입 " + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("showTotalCars = " + totalCars);
    }

}