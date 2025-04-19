public class ModifierExample {

    public static int getVersion() {
        return version;
    }

    private final String name = "Java";
    public static final int version = 21;

    protected void show() {
        System.out.println(name + " " + version);
    }

    public static void main(String[] args) {
        ModifierExample obj = new ModifierExample();
        obj.show();
    }
}
