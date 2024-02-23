package Zadania.interfejs.funkcyjny;

import Zadania.klasy.anonimowe.Car;

import java.util.function.*;

public class App {
    public static void main(String[] args) {

        Function<Integer, String> function = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "Liczba: " + integer;
            }
        };

        //przy pomocy lambda

        Function<Integer, String> function2 = i-> "Liczba: " + i;



        String s = function.apply(5);
        System.out.println(s);
        System.out.println(function.apply(10));
        System.out.println(function.apply(15));

        BiFunction<String, String, Integer> biFunction = new BiFunction<String, String, Integer>() {
            @Override
            public Integer apply(String s, String s2) {
                return s.length() + s2.length();
            }
        };

        //przy pomocy lambda

        BiFunction<String, String, Integer> biFunction2 = (s1, s2) -> s1.length() + s2.length();

        System.out.println(biFunction.apply("Mateusz", "Bereda"));
        System.out.println(biFunction.apply("Wiesiek", "Malinowski"));

        UnaryOperator<Integer> unaryOperator = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*100;
            }
        };

        //przy pomocy lambda

        UnaryOperator<Integer> unaryOperator2 = i -> i*100;

        System.out.println(unaryOperator.apply(7));
        System.out.println(unaryOperator.apply(10));

        Predicate<Car> predicate = new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getPrice() > 350;
            }
        };

        //przy pomocy lambda

        Predicate<Car> predicate2 = car-> car.getPrice()>350;

        System.out.println(predicate.test(new Car("BMW", "5", 100)));
        System.out.println(predicate.test(new Car("Mercedes", "SL", 100)));
        System.out.println(predicate.test(new Car("Honda", "Civic", 500)));

        Supplier<Car> defaultCarSupplier = new Supplier<Car>() {
            @Override
            public Car get() {
                return new Car("BMW", "3", 500);
            }
        };

        //przy pomocy lambda

        Supplier<Car> defaultCarSupplier2 = () -> new Car("BMW", "3", 500);

        System.out.println(defaultCarSupplier.get());

        Consumer<Car> consumer = new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                System.out.println(car);
            }
        };

        //przy pomocy lambda

        Consumer<Car> consumer2 = System.out::println;

        consumer.accept(new Car("Kia", "Sorento", 100));
        consumer.accept(defaultCarSupplier.get());

        //Jeżli wyrażenie lambda jest bardziej zawiłe, wówczas możemy je napisać tak:

        Predicate<Car> predicate1 = car -> {
            if(car.getBrand().equals("BMW")){
                return car.getPrice() > 450;
            }
            return car.getPrice()>350;
        };

    }





    public static void metoda(){
        System.out.println("Coś");
    }
}
