package Zadania.coodingbat.Array2;

/*
Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array.
If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
You may assume that the array is length 3 or more.
Zwraca „wyśrodkowaną” średnią tablicy liczb całkowitych, która, jak powiemy, jest średnią średnią wartości, z wyjątkiem ignorowania największych i najmniejszych wartości w tablicy.
Jeśli istnieje wiele kopii najmniejszej wartości, zignoruj tylko jedną kopię i analogicznie w przypadku największej wartości. Użyj podziału całkowitego, aby uzyskać ostateczną średnią.
Można założyć, że tablica ma długość 3 lub większą.
        centeredAverage([1, 2, 3, 4, 100]) → 3
        centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
        centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
*/


import java.util.Arrays;

public class Zadanie3 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3, 4, 100};
        int[] tablica2 = {1, 1, 5, 5, 10, 8, 7};
        int[] tablica3 = {-10, -4, -2, -4, -2, 0};
        int[] tablica4 = {1, 1, 100};


        System.out.println(centeredAverage(tablica1));
        System.out.println(centeredAverage(tablica2));
        System.out.println(centeredAverage(tablica3));
        System.out.println(centeredAverage(tablica4));

    }

    public static int centeredAverage(int[] nums) {
        if (nums.length >= 3) {
            return (int) Arrays.stream(nums).sorted().skip(1).limit(nums.length-2).average().getAsDouble();
        } else {
            return 0;
        }
    }
}
