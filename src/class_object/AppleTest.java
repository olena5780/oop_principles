package class_object;

public class AppleTest {
    public static void main(String[] args) {
        Apple apple1 = new Apple(); //class_object.Apple@1540e19d
        Apple apple2 = new Apple(); //class_object.Apple@677327b6
        System.out.println(apple1);
        System.out.println(apple2);

        System.out.println("\n-------Apple1---------\n");
        System.out.println(apple1.color); //null
        System.out.println(apple1.taste); //null
        System.out.println(apple1.price); //0.0

        System.out.println("\n-------Apple2---------\n");
        apple2.color = "Green";
        apple2.price = 0.75;
        apple2.taste = "sour";

        System.out.println(apple2.color); //Green
        System.out.println(apple2.taste); //null
        System.out.println(apple2.price); //0.0

        System.out.println(apple1);
        System.out.println(apple2);
    }

}
