package Zadania.coodingbat.Array2;

/*Return true if the group of N numbers at the start and end of the array are the same.
For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
You may assume that n is in the range 0..nums.length inclusive.
Zwraca wartość true, jeśli grupa N liczb na początku i na końcu tablicy jest taka sama.
Na przykład w przypadku {5, 6, 45, 99, 13, 5, 6} końce są takie same dla n=0 i n=2, a fałszywe dla n=1 i n=3.
Można założyć, że n należy do zakresu 0..nums.length włącznie.
        sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
        sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
        sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false*/

public class Zadanie21 {
    public static void main(String[] args) {

        int[] tablica1 = {5, 6, 45, 99, 13, 5, 6};
        int[] tablica2 = {5, 6, 45, 99, 13, 5, 6};
        int[] tablica3 = {5, 6, 45, 99, 13, 5, 6};

        System.out.println(sameEnds(tablica1,1));
        System.out.println(sameEnds(tablica2,2));
        System.out.println(sameEnds(tablica3,3));

    }
    public static boolean sameEnds(int[] nums, int len) {
        int length = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[length - len + i]) {
                return false;
            }
        }
        return true;
    }

}
