package Zadania.nowosciWJavie.Java11;

public class MetodyDlaKasyString {
    public static void main(String[] args) {

        String s = "";

        System.out.println(s.isBlank());

        String s2 = " ABC ";
        System.out.println(s2.stripLeading());
        System.out.println(s2.stripTrailing());
        System.out.println(s2.strip());

        //przykład jak można Stringa powtórzyć wiele razy

        String s3 = "cos";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<5; i++){
            sb.append(s3);
        }

        System.out.println(s.repeat(5));

        String multilineString = "Linia1\nLinia2\nLinia3\nLinia4";
        System.out.println(multilineString);
        multilineString.lines().map(l->l + "cos").forEach(System.out::println);

    }
}
