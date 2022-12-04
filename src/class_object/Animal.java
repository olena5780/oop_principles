package class_object;

public class Animal {
    public Animal(){

    }

    public Animal(String name, int age ){
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, boolean isCarnivore,boolean isHerbivore, boolean isOmnivore){
        System.out.println("This is 5 args constructor");
        this.name = name;
        this.age = age;
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }

    //Create constructor that takes 2 arguments(name, age)
    public String name;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;
    public static final boolean isExtinct = true;


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCarnivore=" + isCarnivore +
                ", isHerbivore=" + isHerbivore +
                ", isOmnivore=" + isOmnivore +
                '}';
    }
// Execute the code below whenever an Animal object is garbage collected
    //You will override finalize() method if you would like to execute a block right after you object is destroyed
    @Override
    protected void finalize() throws Throwable {
        System.out.println(getClass().getName() + " " + this.name + " object is destroyed");
    }

    public static void main(String[] args) {
        /*
        Animal a1 = new Animal();
        Animal a2 = new Animal("Dog", 3);
        Animal a3 = new Animal("Cow", 5);
        Animal a4 = new Animal("Cat", 1);
        */
        Animal a5 = new Animal("Tiger", 10, true, false, false);
        Animal a6 = new Animal("Cow", 5, false, true, false);
        Animal a7 = new Animal("Cat", 2, false, false, true);

        System.out.println("\n-------Printing the objects-------\n");
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);

        System.out.println("\n-------Static instance variable-------\n");
        System.out.println(Animal.isExtinct);// true

        boolean isExtinct = false;

        System.out.println(Animal.isExtinct); // false - if its static
        // but if it is public static final boolean Animal.isExtinct = true; // always true, it can not be change


    }
}
