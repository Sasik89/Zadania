package Zadania.klasy.anonimowe;

import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car implements Comparable<Car> {
    private String brand;
    private String model;
    private int price;

    @Override
    public int compareTo(@NotNull Car o) {
        return this.price-o.price;
    }
}
