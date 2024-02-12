//Zgrupuj urzytkowników po imieniu i następnie wstaw do mapy <klucz - wartość

package Zadania.Strumenie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Zadanie7 {
    public static void main(String[] args) {
        List<Client> clients = Arrays.asList(
                new Client("Janusz", "Duda"),
                new Client("Ania", "Nowak"),
                new Client("Dżesika", "Bóbr"),
                new Client("Wiesiek", "Kowalski"),
                new Client("Janusz", "Krupa"),
                new Client("Wiesiek", "Kupiec"));

        Map<String, List<Client>> grupy = clients.stream().collect(Collectors.groupingBy(c -> c.getName()));

        System.out.println(grupy);
    }

}
