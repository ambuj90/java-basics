public class CarCons {

    String modal;
    int year;
    String color;

    public CarCons(String carModel, int carYear, String carColor) {
        modal = carModel;
        year = carYear;
        color = carColor;
    }

    public void DisplayInfo() {
        System.out.println("Modal: " + modal);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {

        CarCons myCar = new CarCons("Mustang", 2025, "red");

        myCar.DisplayInfo();
        System.out.println(myCar.year + " " + myCar.color);
    }
}
