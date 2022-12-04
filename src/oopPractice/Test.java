package oopPractice;

public class Test {
    public static void main(String[] args) {
        System.out.println("\nSword1 is created after this line\n");
        Sword sword1 = new Sword("Iron");// -> default constructor
        System.out.println("Printing out the sword 1 " + sword1);

        System.out.println("\nSword2 is created after this line\n");
        Sword sword2 = new Sword(3.5, 15.0,"long sword","metalic"); // Modified constructor
        System.out.println("Printing out the sword 2 " + sword2);

        System.out.println("\nSword3 is created after this line\n");
        Sword sword3 = new Sword(5.5, 20.0,"the best sword","titanium"); // Modified constructor
        System.out.println("Printing out the sword 3 " + sword3);

        System.out.println("Working with static value");

        System.out.println(Sword.hasHANDLE);
        System.out.println(Sword.isSharp);
        Sword.damage();

        //Sword.hasHANDLE= true; final value can not be changed
        Sword.isSharp = true;
        System.out.println(Sword.isSharp);
        Sword.damage();

        System.out.println("\nWorking with the method\n");
        sword1.harms();//0.0
        sword2.harms();//3.5 * 15 = 52.5
        sword3.harms();//5.5 * 20 = 110.0





    }

}
