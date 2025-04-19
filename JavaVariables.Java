public class JavaVariables {
    public static void main(String[] args) {
        // Printing your name
        String name = "Ambuj Sharma";
        System.out.println(name);

        // Working with integer and string variables
        int myNum = 15;
        System.out.println(myNum);

        String firstName = "Ambuj ";
        String lastName = "Sharma";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        // Integer math example
        int x = 5;
        int y = 5;
        int z = 60;
        System.out.println("Sum: " + (x + y + z)); // Output: 70

        // Student info variables
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print student details
        System.out.println("Student name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Fee: " + studentFee);
        System.out.println("Student Grade: " + studentGrade);

        // Byte type example
        byte smallNumber = 100;
        System.out.println("Byte value: " + smallNumber);

        // Boolean examples
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Is Java fun? " + isJavaFun);         // true
        System.out.println("Is fish tasty? " + isFishTasty);     // false

        // Char example using ASCII
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println("Characters from ASCII:");
        System.out.println(myVar1);  // A
        System.out.println(myVar2);  // B
        System.out.println(myVar3);  // C

        // Mixed data types for cost calculation
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print shopping summary
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + currency + costPerItem);
        System.out.println("Total cost = " + currency + totalCost);
    }
}
