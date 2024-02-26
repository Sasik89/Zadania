package Zadania.nowosciWJavie.java9;

public interface MetodyPrywatne {

    void add(int a, int b);

    default void diff(int a, int b){
        //wykonuje algorytm dla liczby a
        System.out.println(a);
        //wykonuje algorytm dla liczby b
        System.out.println(b);
    }

    //metody prywatne widoczne są tylko w interfejsie, słuza do tego by
    //np, nie powtarzać kodu

    private void algorytm(int x){
        //wykonuje algorytm na liczby x
        System.out.println(x);
    }


}
