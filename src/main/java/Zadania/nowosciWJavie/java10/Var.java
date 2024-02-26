package Zadania.nowosciWJavie.java10;

public class Var {
    public static void main(String[] args) {

        var s = cos();
        System.out.println(s);

        //var nie zwraca uwagi na to jaki typ przychodzi  z metody;
        //zmienna var w momenie kiedy wykona się linijke staje sie int i już cały czas nim będzie
        //var posiada dynamiczne wnioskowanie typu
    }

    public static String cos(){
        return "ABC";
    }
}
