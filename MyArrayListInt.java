import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListInt {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(30);
        myNumbers.add(50);
        System.out.println(myNumbers);

        Collections.sort(myNumbers);
        for (int i : myNumbers) {
            System.out.println(i);
        }

    }

}
