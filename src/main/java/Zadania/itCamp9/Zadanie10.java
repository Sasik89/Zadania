package Zadania.itCamp9;

//Napisz algorytm który zwraca true jeśli nawiasy są poprawnie ustawione:

//    sdasdasd(asdsad(sdasd)sdsd) -> true;
//    adfsdffd)adasdasd(   -> false;

public class Zadanie10 {
    public static void main(String[] args) {


        System.out.println(brackets("sdasdasd((asdsadsdasd)sdsd)"));
        System.out.println(brackets("adfsdffd)adasdasd("));

    }

    public static boolean brackets(String s){
        char[] tablica = s.toCharArray();
        int suma = 0;
        for(char element : tablica){
            if(element == '('){
                suma++;
            } if(element == ')'){
                suma--;
            } if(suma < 0){
                return false;
            }
        }
        return suma == 0;
    }
}
