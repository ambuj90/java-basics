public class MyString {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txt1 = "Hello World!";
        System.out.println(txt1.toUpperCase());
        System.err.println(txt1.toLowerCase());

        String txt2 = "Please locate where 'locate' occurs!";
        System.err.println(txt2.indexOf("locate"));
        String firstName = "Ambuj ";
        String lastName = "Sharma";
        System.out.println(firstName.concat(lastName));

        int randomNum = (int) (Math.random() * 101);
        System.err.println(randomNum);

        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}
