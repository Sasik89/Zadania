package Zadania.nowosciWJavie.java14;

public class RekordMain {
    public static void main(String[] args) {

        ImmutableCar immutableCar = new ImmutableCar("Audi", "3", 300);
        System.out.println(immutableCar.brand());
        System.out.println(immutableCar.model());
        System.out.println(immutableCar.price());
    }
}
