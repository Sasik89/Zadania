package Zadania.coodingbat.app1;


/*We have data for two users, A and B, each with a String name and an int id. The goal is to order the users such as for sorting.
Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same.
Order first by the string names, and then by the id numbers if the names are the same.
Note: with Strings str1.compareTo(str2) returns an int value which is negative/0/positive to indicate how str1 is ordered to str2 (the value is not limited to -1/0/1).
(On the AP, there would be two User objects, but here the code simply takes the two strings and two ints directly. The code logic is the same.)
Mamy dane dla dwóch użytkowników, A i B, każdy z nazwą typu String i identyfikatorem int. Celem jest uporządkowanie użytkowników np. w celu sortowania.
Zwróć -1, jeśli A występuje przed B, 1, jeśli A następuje po B i 0, jeśli są takie same.
Uporządkuj najpierw według nazw ciągów, a następnie według numerów identyfikacyjnych, jeśli nazwy są takie same.
Uwaga: w przypadku Strings str1.compareTo(str2) zwraca wartość int, która jest ujemna/0/dodatnia, aby wskazać, w jaki sposób str1 jest uporządkowany w str2 (wartość nie jest ograniczona do -1/0/1).
(W punkcie dostępowym byłyby dwa obiekty User, ale tutaj kod po prostu pobiera bezpośrednio dwa ciągi znaków i dwie inty. Logika kodu jest taka sama.)
        userCompare("bb", 1, "zz", 2) → -1
        userCompare("bb", 1, "aa", 2) → 1
        userCompare("bb", 1, "bb", 1) → 0*/

public class Zadanie19 {
    public static void main(String[] args) {

        System.out.println(userCompare("bb", 1, "zz", 2));
        System.out.println(userCompare("bb", 1, "aa", 2));
        System.out.println(userCompare("bb", 1, "bb", 1));

    }

    public static int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.equals(bName) && aId < bId) {
            return -1;
        } else if (aName.equals(bName) && aId > bId) {
            return 1;
        } else if (aName.equals(bName) && aId == bId) {
            return 0;
        } else if (aName.compareTo(bName) < 0) {
            return -1;
        } else if (aName.compareTo(bName) > 0) {
            return 1;
        }
        return 0;
    }
}
