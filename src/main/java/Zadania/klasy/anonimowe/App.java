package Zadania.klasy.anonimowe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Wiesiek");
        names.add("Janusz");
        names.add("Zbyszek");
        names.add("Adam");
        names.add("Karol");

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);

        /*---------------------------*/

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Corolla", 300));
        cars.add(new Car("Honda", "Civic", 400));
        cars.add(new Car("Citroen", "C4", 500));
        cars.add(new Car("BMW", "3", 350));
        cars.add(new Car("Mazda", "2", 400));

        System.out.println(cars);

        Collections.sort(cars,new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

        Comparator<Car> porownywacz = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        };

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return -(o1.getPrice() - o2.getPrice());
            }
        });

        System.out.println(cars);
    }
}

