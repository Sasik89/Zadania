package Zadania.coodingbat.warmup2;

/*Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
Załóżmy, że ciąg „jak” jest pechowy. Biorąc pod uwagę ciąg, zwróć wersję, w której wszystkie „yak” zostały usunięte, ale „a” może być dowolnym znakiem. Sznurki „jaków” nie będą się nakładać.
        stringYak("yakpak") → "pak"
        stringYak("pakyak") → "pak"
        stringYak("yak123ya") → "123ya"*/

public class Zadanie14 {
    public static void main(String[] args) {

        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));

    }
    public static String stringYak(String str) {
        String result = str.replace("yak", "");
        return result;
    }

}
