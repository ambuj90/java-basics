public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Ambuj");

        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble;

        System.out.println(myInt2);
        System.out.println(myDouble2);

        int maxScore = 500;

        int userScore = 423;

        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
    }

}
