package Zadania.coodingbat.Array2;


/*Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7
(every 6 will be followed by at least one 7). Return 0 for no numbers.
Zwraca sumę liczb w tablicy, z wyjątkiem ignorowania sekcji liczb zaczynających się od 6 i kończących się na następnych 7
(po każdej 6 nastąpi co najmniej jedna 7). Zwróć 0 w przypadku braku liczb.
        sum67([1, 2, 2]) → 5
        sum67([1, 2, 2, 6, 99, 99, 7]) → 5
        sum67([1, 1, 6, 7, 2]) → 4*/

public class Zadanie5 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 2};
        int[] tablica2 = {1, 2, 2, 6, 99, 99, 7};
        int[] tablica3 = {1, 1, 6, 7, 2};

        System.out.println(sum67(tablica1));
        System.out.println(sum67(tablica2));
        System.out.println(sum67(tablica3));

    }

    public static int sum67(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                while (nums[i] != 7) {
                    i++;
                }
                if (i == nums.length - 1) {
                    break;
                }
                i++;
            }
            sum = sum + nums[i];
        }
        return sum;
    }
}
