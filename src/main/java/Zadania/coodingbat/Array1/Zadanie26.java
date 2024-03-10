package Zadania.coodingbat.Array1;

/*Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b.
The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
Biorąc pod uwagę 2 tablice int, a i b, zwróć nową tablicę o długości 2 zawierającą tyle, ile się zmieści, elementy z a, po których następują elementy z b.
Tablice mogą mieć dowolną długość, łącznie z 0, ale pomiędzy dwiema tablicami będą dostępne 2 lub więcej elementów.
make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]*/

public class Zadanie26 {
    public static void main(String[] args) {

        int[] tablica1 = {4, 5};
        int[] tablica1a = {1, 2, 3};
        int[] tablica2 = {4};
        int[] tablica2a = {1, 2, 3};
        int[] tablica3 = {};
        int[] tablica3a = {1, 2};

        wypisywacz(make2(tablica1, tablica1a));
        wypisywacz(make2(tablica2, tablica2a));
        wypisywacz(make2(tablica3, tablica3a));

    }
    public static int[] make2(int[] a, int[] b) {
        if(a.length==0){
            return b;
        } else if (a.length==1) {
            return new int[]{a[0],b[0]};
        } else {
            return new int[]{a[0], a[1]};
        }
    }
    public static void wypisywacz(int[] tablica){
        for(int element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
