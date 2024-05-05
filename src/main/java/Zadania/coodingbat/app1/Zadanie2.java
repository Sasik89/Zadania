package Zadania.coodingbat.app1;


/*Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.
        scores100([1, 100, 100]) → true
        scores100([1, 100, 99, 100]) → false
        scores100([100, 1, 100, 100]) → true*/

public class Zadanie2 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 100, 100};
        int[] tablica2 = {1, 100, 99, 100};
        int[] tablica3 = {100, 1, 100, 100};

        System.out.println(scores100(tablica1));
        System.out.println(scores100(tablica2));
        System.out.println(scores100(tablica3));
    }
    public static boolean scores100(int[] scores) {
        for(int i = 0; i<scores.length-1;i++){
            if(scores[i]==100 && scores[i+1]==100){
                return true;
            }
        }
        return false;
    }


}
