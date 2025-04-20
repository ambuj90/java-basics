public class ClassMethod {

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public (instance) method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method — entry point of Java program
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method directly

        ClassMethod myObj = new ClassMethod(); // Create an object
        myObj.myPublicMethod(); // Call the public method using the object
    }
}
