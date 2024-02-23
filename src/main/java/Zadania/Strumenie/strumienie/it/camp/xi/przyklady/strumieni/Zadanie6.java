package Zadania.Strumenie.strumienie.it.camp.xi.przyklady.strumieni;

/*
Stwórz klasę Emploee.Każdy pracownik ma posiadać id, imie, nazwisko,
płacę i stanowisko (LOW, MID, HIGH). Stwórz listę pacowników - 10 szt.
Napisz strumień który wypisuje ID każdego pracownika średniego szczebla
zarabiającego między 4000-5000 zmieniając przy okazji jego płacę na 4800 zł.
Program ma na końu iterować pętlą po wszystkich użytkownikach i wypisać ich na ekranie
 */

import java.util.List;

public class Zadanie6 {
    public static void main(String[] args) {

        List<Employee> pracownicy = List.of(
                new Employee(1, "Janusz", "Kowalski", 3000, Employee.Position.HIGH),
                new Employee(2, "Wiesiek", "Malinowski", 4000, Employee.Position.MID),
                new Employee(3, "Czesiek", "Kupiec", 5000, Employee.Position.LOW),
                new Employee(4, "Andrzej", "Dragan", 4400, Employee.Position.LOW),
                new Employee(5, "Albert", "Einstein", 5200, Employee.Position.MID),
                new Employee(6, "Filip", "Flisiak", 3500, Employee.Position.MID),
                new Employee(7, "Roman", "Sas", 3700, Employee.Position.MID),
                new Employee(8, "Aleksander", "Zębala", 4700, Employee.Position.MID),
                new Employee(9, "Jurek", "Strycharz", 4200, Employee.Position.MID));


        Metoda(pracownicy);

    }

    public static void Metoda(List<Employee> employees){
        employees.stream()
                .filter(e->e.getPosition() == Employee.Position.MID) //szuka pracowników którzy maja pozycje MID
                .filter(e->e.getSalary()>4000)
                .peek(System.out::println) //podglądamy co się w tymi miejscu dzieje
                .filter(e->e.getSalary()<5000)
                .peek(e->e.setSalary(4800)) //wywołuje consumera
                .map(Employee::getId).forEach(System.out::println);
    }
}
