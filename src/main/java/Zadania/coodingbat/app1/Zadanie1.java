package Zadania.coodingbat.app1;


/*Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.
        scoresIncreasing([1, 3, 4]) → true
        scoresIncreasing([1, 3, 2]) → false
        scoresIncreasing([1, 1, 4]) → true*/

public class Zadanie1 {
    public static void main(String[] args) {


        int[] tablica1 = {1, 3, 4};
        int[] tablica2 = {1, 3, 2};
        int[] tablica3 = {1, 1, 4};

        System.out.println(scoresIncreasing(tablica1));
        System.out.println(scoresIncreasing(tablica2));
        System.out.println(scoresIncreasing(tablica3));


    }
    public static boolean scoresIncreasing(int[] scores) {
        for(int i = 0; i<scores.length-1;i++){
            if(scores[i]>scores[i+1]){
                    return false;
            }
        }
        return true;
    }

}
