public class Car {

    public void fullThrottle() {
        System.out.println("The car is going full throttle!");
    }

    public void speed(int maxSpeed) {
        System.out.println("The car is going at " + maxSpeed + " km/h");
    }

    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.fullThrottle();
        myCar.speed(180);

    }
}
