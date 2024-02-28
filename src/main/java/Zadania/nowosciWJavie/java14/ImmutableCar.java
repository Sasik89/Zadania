package Zadania.nowosciWJavie.java14;

public record ImmutableCar(String brand, String model, int price) {

public void cos(){
    ///
}

    @Override
    public String toString() {
        return "ImmutableCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
