package Zadania.rekurencja;

public class SIlnia {
    public static void main(String[] args) {

        System.out.println(silnia(2));
    }

    public static int silnia(int x){
        if(x<=0){
            return 1;
        }
        return x * silnia(x-1);
    }
}
