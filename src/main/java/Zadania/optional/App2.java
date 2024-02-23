package Zadania.optional;

import java.util.Optional;

public class App2 {
    public static void main(String[] args) {

        Optional<String> stringBox = getById(7);
        String s = stringBox.orElse("nic"); /*jeśli stringBox zawiera Stringa to linika kolejna zostanie zrealizowana
        jeśli nie to wyświetli komunikat "nic"*/
        System.out.println(s);
    }

    private static Optional<String> getById(int id){
        if(id == 5){
            return Optional.of("cos");
        }
        return Optional.empty();
    }

}
