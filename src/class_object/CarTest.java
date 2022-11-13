package class_object;

import java.util.ArrayList;
import java.util.Iterator;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("White", "BMW", "X6", 2020, 15000);
        Car car2 = new Car("Black", "Tesla", "S", 2023, 20000);
        Car car3 = new Car("Beige", "Toyota", "Camry", 2018, 10000);
        Car car4 = new Car("Blue", "Tesla", "X", 2021, 13000);
        Car car5 = new Car("Black", "Audi", "A7", 2022, 15000);

        System.out.println(car1);//Car{color='null', make='null', model='null', year=0, price=0.0}
        System.out.println(car2);//Car{color='black', make='Tesla', model='S', year=2023, price=20000.0}

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);


        System.out.println("\n-------Print each car--------\n");
        /*
        Find the most expensive car
        Remove all car that is more or equals 20K
         */
        Car mostExpensiveCar = cars.get(0);
        for (Car car : cars) {
            if(car.price > mostExpensiveCar.price ) mostExpensiveCar = car;

        }
        System.out.println(mostExpensiveCar);


        System.out.println("\n-------Count Black cars--------\n");
        //Count how many cars are Black -> 2
        int blackColor = 0;
        for (Car car : cars) {
            if(car.color.equals("Black")) blackColor ++;

        }
        System.out.println(blackColor); //2

        System.out.println("\n-------Count Black cars with stream--------\n");
        System.out.println(cars.stream().filter(car -> car.color.equals("Black")).count());//2
        /*
     Count all the cars that are Blue or Beige or 2023 -> 3
       */

        int count = 0;
        for (Car car : cars) {
            if(car.color.equals("Blue") || car.color.equals("Beige") || car.year == 2023) count ++;

        }
        System.out.println(count);


        /*
        Remove all the cars that are Tesla and print the size of the cars

        Expected:
        3
         */

        System.out.println("\n-------Remove with iterator--------\n");
            Iterator<Car> iterator = cars.iterator();

            while(iterator.hasNext()){
                if(iterator.next().make.equals("Tesla")) iterator.remove();
            }
            System.out.println(cars.size());

        System.out.println("\n-------Remove with removeIf--------\n");
          cars.removeIf(car -> car.make.equals("Tesla"));
          System.out.println(cars.size()); // 3








    }
}
