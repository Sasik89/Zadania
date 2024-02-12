package Zadania.wyjatki;

public class App {
    public static void main(String[] args) {

        metoda();
        System.out.println("Koniec programu");
        try {
            sprawdzanieLoginu("jaja");
        } catch (JakisMojWyjatek e){
            e.printStackTrace();
        }
    }

    public static void metoda() {
        int[] tab = new int[5];
        try {
            tab[10] = 15;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            e.printStackTrace();
            System.out.println("Zepsuło się");
        }
    }
    public static void sprawdzanieLoginu(String login) throws JakisMojWyjatek {
        if(login.startsWith("X")) {
            throw new JakisMojWyjatek();
        }
    }
}
