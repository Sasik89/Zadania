package Zadania.interfejs.funkcyjny;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App2 {
    public static void main(String[] args) {

        readAndProcess(App2::readDataFromFile, App2::processA1);



    }
    private static int readDataFromFile(){
        System.out.println("Wczytaj dane z pluku");
        return 5;
    }
    private static int readDataFromBase(){
        System.out.println("Wczytaj dane z pluku");
        return 10;
    }
    private static int readDataFromNetwork(){
        System.out.println("Wczytaj dane z internetu");
        return 15;
    }
    private static int processA1(int x){
        System.out.println("Algorytm1");
        return x*10;
    }
    private static int processA2(int x){
        System.out.println("Algorytm1");
        return x*100;
    }
    private static int processA3(int x){
        System.out.println("Algorytm1");
        return x*1000;
    }

    public static int readAndProcess(Supplier<Integer> dateReader, UnaryOperator<Integer> processor){
        int x = dateReader.get();
        return processor.apply(x);
    }

}
