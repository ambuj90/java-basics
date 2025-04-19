public class MyCondition {
    public static void main(String[] args) {
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        // int time = 22;
        // if (time < 10) {
        // System.out.println("Good morning.");
        // } else if (time < 18) {
        // System.out.println("Good day.");
        // } else {
        // System.out.println("Good evening.");
        // }

        int time = 20;
        String result = (time > 18) ? "Good Day" : "Good Evening";
        System.err.println(result);

        int myNum = 10;
        if (myNum > 0) {
            System.err.println("The value is a positive number");
        } else if (myNum < 0) {
            System.err.println("The value is negative number");
        } else {
            System.err.println("The value is 0.");
        }

        int myAge = 25;
        int VolingAge = 18;

        if (myAge < VolingAge) {
            System.err.println("Not old enough to vote.");
        } else {
            System.err.println("old enough to vote.");
        }
        int myNum1 = 5;

        if (myNum1 % 2 == 0) {
            System.out.println(myNum1 + " is even");
        } else {
            System.out.println(myNum1 + " is odd");
        }

    }
}
