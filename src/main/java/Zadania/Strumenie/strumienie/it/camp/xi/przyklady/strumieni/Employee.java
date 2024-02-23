package Zadania.Strumenie.strumienie.it.camp.xi.przyklady.strumieni;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private int id;
    private String name;
    private String surname;
    private int salary;
    private Position position;

    public enum Position{
        LOW,
        MID,
        HIGH
    }

}
