package Zadania.wielowatkowosc.pi;

import java.util.Random;

public class PointsGenerator implements Runnable {

    private final int  pointsToGenerate;

    public PointsGenerator(int pointsToGenerate) {
        this.pointsToGenerate = pointsToGenerate;
    }


    @Override
    public void run() {
        int pointsInCircle = 0;
        Random random = new Random();

        for(int i = 0; i < this.pointsToGenerate; i++){
            double x = random.nextDouble();
            double y = random.nextDouble();
            double discance = Math.sqrt(x*x + y*y);
            if(discance <=1){
                pointsInCircle++;
            }
        }
    synchronized (App2.partialResult) {
            App2.partialResult.add(pointsInCircle);

    }
    }
}
