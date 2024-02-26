package Zadania.optional;

import java.util.Optional;

public class App4 {
    public static void main(String[] args) {

        Optional<Integer>  integerBox = Optional.of(5);

        if(integerBox.isEmpty()){
            throw new Wyjatek();
        }
        //rzuca swoim wyjatkiem jesli Optional jest pusty zamiast NoSuchElement...
        integerBox.orElseThrow(()->new Wyjatek());
    }


}
