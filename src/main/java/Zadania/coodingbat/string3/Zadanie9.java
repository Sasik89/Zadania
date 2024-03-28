package Zadania.coodingbat.string3;


/*Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
        maxBlock("hoopla") → 2
        maxBlock("abbCCCddBBBxx") → 3
        maxBlock("") → 0*/

public class Zadanie9 {
    public static void main(String[] args) {

        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock(""));

    }
    public static int maxBlock(String str) {
        int counter = 0;
        int sum = 1;
        for(int i = 0; i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                sum=sum+1;
                if(sum>=3){
                    counter++;
                }
            }
            if(str.charAt(i) != str.charAt(i+1)){
                sum=1;
            }
        }
        return counter;
    }
}
