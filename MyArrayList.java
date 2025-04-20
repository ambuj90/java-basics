import java.util.ArrayList;

public class MyArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Maruti");

        cars.add(0, "Mazda");
        System.out.println(cars);

        System.out.println(cars.get(0));
        cars.set(0, "Ford");
        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);
        System.out.println(cars.size());

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

        }

        for (String i : cars) {
            System.out.println(i);
        }

        int number = 12;
        String(number)

    }

}
