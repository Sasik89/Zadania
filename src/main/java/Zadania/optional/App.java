package Zadania.optional;

import java.util.Optional;

public class App {
    public static void main(String[] args) {

        Optional<String> stringBox = getById(7);
        if(stringBox.isEmpty()){
            System.out.println(0);
        } else {
            String s = stringBox.get();
            System.out.println(s.length());
        }
    }

    private static Optional<String> getById(int id){
        if(id==5){
            return Optional.of("coś");
        }
        return Optional.empty();
    }
}
