package Zadania.rekurencja;

public class CiagArytmetyczny {
    public static void main(String[] args) {

        System.out.println(aritmeticNElements(5,1,6));

    }

    public static int aritmeticNElements(int n, int first, int step){
        if(n==0){
            return first;
        }
        return step + aritmeticNElements(n-1, first, step);
    }
}
