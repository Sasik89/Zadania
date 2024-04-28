package Zadania.coodingbat.Array3;

/*We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
Return the size of the largest mirror section found in the given array.
Powiemy, że sekcja „lustrzana” w tablicy to grupa sąsiadujących elementów, tak że gdzieś w tablicy:
ta sama grupa pojawia się w odwrotnej kolejności. Na przykład największa sekcja lustra w {1, 2, 3, 8, 9, 3, 2, 1} ma długość 3 (część {1, 2, 3}).
Zwraca rozmiar największej sekcji lustra znalezionej w podanej tablicy.
        maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
        maxMirror([1, 2, 1, 4]) → 3
        maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2*/

public class Zadanie8 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3, 8, 9, 3, 2, 1};
        int[] tablica2 = {1, 2, 1, 4};
        int[] tablica3 = {7, 1, 2, 9, 7, 2, 1};

        System.out.println(maxMirror(tablica1));
        System.out.println(maxMirror(tablica2));
        System.out.println(maxMirror(tablica3));

    }

    public static int maxMirror(int[] nums) {
        int max_size = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int size = 0;
                int m = i;
                int n = j;

                while (m < nums.length && n >= 0 && nums[m] == nums[n]) {
                    size++;
                    m++;
                    n--;
                }

                max_size = Math.max(max_size, size);
            }
        }
        return max_size;
    }

}
