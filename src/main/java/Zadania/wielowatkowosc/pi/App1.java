package Zadania.wielowatkowosc.pi;

import java.util.Random;

public class App1 {

    //algorytm na obliczenie pi

    public static void main(String[] args) {
        int allPoints = 100000000;
        long startTime = System.currentTimeMillis();
        int pointsInCirccle = 0;
        Random random = new Random();

        for(int i = 0; i < allPoints; i++){
            double x = random.nextDouble();
            double y = random.nextDouble();
            double discance = Math.sqrt(x*x + y*y);
            if(discance <=1){
                pointsInCirccle++;
            }
        }
        double pi = 4.0 * pointsInCirccle / allPoints;
        long endTime = System.currentTimeMillis();
        System.out.println(pi);
        System.out.println(endTime - startTime);
    }
}
