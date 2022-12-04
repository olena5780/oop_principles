package oopPractice;

import java.sql.SQLOutput;

public class Sword {
    //1. Constructor


    /*
    1.Default Constructor
    public Sword() {
    }
     */
    //Modified Constructor
    public Sword(String material) {
    }

    //Modified Constructor
    public Sword(double weight, double length, String name, String material){
        this(material);
        this.weight = weight; // assign the value of local variable in the instance variable
        this.length = length;
        this.name = name;


    }
    //2.Instance variables

    //static ones -> belong to the class, What does every sword do?
    public static final boolean hasHANDLE = true;
    public static boolean isSharp;

    //non-static -> belongs to the object What is changing sword by sword
    public double weight;
    public double length;
    public String name;
    public String material;

    //3. Methods ->What does a sword do?

    //static ones -> belong to the class, What does every sword do?
    public static void slash(){
        System.out.println("Sword is Slashing");
    }
    //non-static ones -> belong to the class, What does every sword do differently?
    //weight * length = 2 pounds + 10 inches = 20 points
    //weight * length = 10 pounds + 15 inches = 150 points

    public void harms(){
        System.out.println("Sword damages = "+ (weight * length));
    }

    public static void damage(){
        if(isSharp) System.out.println("Sword damages more");
        else System.out.println("Sword damages less");
    }

    //4. Blocks
    //running only ONCE before Everything
    static{
        System.out.println("Starting the sword making furnace");

    }

    //running everytime when you create object before everything after static code block
    {
        System.out.println("Heating up the furnace");
    }

    @Override
    public String toString() {
        return "Sword{" +
                "weight=" + weight +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
