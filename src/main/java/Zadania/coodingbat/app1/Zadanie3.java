package Zadania.coodingbat.app1;


/*Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ
        from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
        scoresClump([3, 4, 5]) → true
        scoresClump([3, 4, 6]) → false
        scoresClump([1, 3, 5, 5]) → true*/

public class Zadanie3 {
    public static void main(String[] args) {

        int[] tablica1 = {3,4,5};
        int[] tablica2 = {3,4,6};
        int[] tablica3 = {1, 3, 5, 5};

        System.out.println(scoresClump(tablica1));
        System.out.println(scoresClump(tablica2));
        System.out.println(scoresClump(tablica3));

    }
    public static boolean scoresClump(int[] scores) {
        for(int i = 0; i<scores.length-2;i++){
            if((scores[i+1]-scores[i])<=2 && (scores[i+2]-scores[i+1])<=2 && (scores[i+2]-scores[i])<=2){
                return true;
            }
        }
        return false;
    }


}
