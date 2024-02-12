package Zadania.rekurencja;

public class CiagFibonacciego {
    public static void main(String[] args) {

        System.out.println(fibonnacciNElement(10));
    }

    public static int fibonnacciNElement(int n){
        if(n == 0){
            return 0;
        }if(n ==1){
            return 1;
        }
        return fibonnacciNElement(n-1)+fibonnacciNElement(n-2);
    }
}
