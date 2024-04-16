package Zadania.coodingbat.Array2;


/*We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it.
Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.
Powiemy, że element w tablicy jest „sam”, jeśli przed nim i po nim znajdują się wartości i te wartości są od niego różne.
Zwraca wersję danej tablicy, w której każde wystąpienie danej wartości, które występuje samodzielnie, zostaje zastąpione dowolną wartością po jej lewej lub prawej stronie, która jest większa.
        notAlone([1, 2, 3], 2) → [1, 3, 3]
        notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
        notAlone([3, 4], 3) → [3, 4]*/

public class Zadanie28 {
    public static void main(String[] args) {

        // TODO: 16.04.2024 Jedna wartosc jest zle wyliczana 
        
        int[] tablica1 = {1, 2, 3};
        int[] tablica2 = {1, 2, 3, 2, 5, 2};
        int[] tablica3 = {3, 4};

        wyswietlacz(notAlone(tablica1,2));
        wyswietlacz(notAlone(tablica2,2));
        wyswietlacz(notAlone(tablica3,3));

    }
    public static int[] notAlone(int[] nums, int val) {
        int[] result = nums;
        for(int i = 1; i<nums.length-1;i++){
            if(nums[i-1]!=nums[i] && nums[i+1]!=nums[i]){
                if(nums[i-1]>nums[i+1]){
                    nums[i]=nums[i-1];
                } else {
                    nums[i]=nums[i+1];
                }
            }
        }
        return result;
    }

    public static void wyswietlacz(int[] tab) {
        for (int element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
