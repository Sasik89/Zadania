package Zadania.optional;

import java.util.Optional;

public class App3 {
    public static void main(String[] args) {

        Optional<Integer> integerBox = Optional.of(5);

        integerBox.ifPresent(System.out::println);

        //to jest tożsame co?

        if (integerBox.isPresent()) {
            System.out.println(integerBox.get());
        }


        integerBox.ifPresentOrElse(i -> System.out.println(i), () -> System.out.println("Pudełko jest puste"));

        Optional<String> s = integerBox.map(i -> "Liczba: " + i); //zmienia optional<integer> na optional<String>

        //to jest tożsame co

        if (integerBox.isPresent()) {
            int i1 = integerBox.get();
            String tempString = "Liczba: " + i1;
            Optional<String> s1 = Optional.of(tempString);
        } else {
            Optional<String> s1 = Optional.empty();

        }
        integerBox.or(()->App3.defaultNumber());

    }
        public static Optional<Integer> defaultNumber(){
            return Optional.of(7);
        }

    }
