package oop_principles.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {

        //Phone.call(); abstract methods cannot be static
        /*
        Abstract class cannot be instantiated - cannot have objects
        Phone phone = new Phone();
        phone.call();
         */

        Samsung s1 = new Samsung();
        s1.call();
        s1.text();


        iPhone i1 = new iPhone();
        i1.call();
        i1.text();

        Samsung s2 = new Samsung(64, "Galaxy S20", "Black", 700);
        iPhone i2 = new iPhone(128, "iPhone 14 Max Pro", "Silver", 750);

        System.out.println(s2);
        System.out.println(i2);

        s2.takesPhoto();
        s2.recordVideo();
        i1.takesPhoto();
        i1.recordVideo();

        Nokia n1 = new Nokia();
        n1.call();
    }
}