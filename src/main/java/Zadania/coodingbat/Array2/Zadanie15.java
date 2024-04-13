package Zadania.coodingbat.Array2;

/*Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index).
Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
Biorąc pod uwagę tablice num1 i num2 o tej samej długości, dla każdego elementu w nums1 rozważ odpowiedni element w nums2 (o tym samym indeksie).
Zwraca liczbę przypadków, gdy te dwa elementy różnią się o 2 lub mniej, ale nie są równe.
        matchUp([1, 2, 3], [2, 3, 10]) → 2
        matchUp([1, 2, 3], [2, 3, 5]) → 3
        matchUp([1, 2, 3], [2, 3, 3]) → 2*/

public class Zadanie15 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3};
        int[] tablica1a = {2, 3, 10};
        int[] tablica2 = {1, 2, 3};
        int[] tablica2a = {2, 3, 5};
        int[] tablica3 = {1, 2, 3};
        int[] tablica3a = {2, 3, 3};

        System.out.println(matchUp(tablica1,tablica1a));
        System.out.println(matchUp(tablica2,tablica2a));
        System.out.println(matchUp(tablica3,tablica3a));

    }
    public static int matchUp(int[] nums1, int[] nums2) {
        int sum = 0;
        for(int i=0; i<nums2.length;i++){
            if(nums1[i] != nums2[i] && Math.abs(nums2[i]-nums1[i])<=2){
                sum++;
            }
        }
        return sum;
    }
}
