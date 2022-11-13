package class_object;

public class Fruit {
    public static boolean hasColor;
    public boolean isSweet;
    public String name;
    public String shape;
// instance block is executed for each object being created
    {
        System.out.println("This is an instance block");
        isSweet = true;
    }
// static block is executed only once and before anything else in the same class
    static{
        // connect to file here and read data
        hasColor = true;
        System.out.println("This is a static block");
    }
}
