package Zadania.nowosciWJavie.java12;

public class Switch {
    public static void main(String[] args) {
        int i = 4;
        switch (i){
            case 1:
            case 2:
                System.out.println("1 albo 2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("coś innego");
        }

        switch (i) {
            case 1, 2 -> System.out.println("1 albo 2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            default -> {
                System.out.println("coś innego");
                System.out.println("coś innego2");

            }
        }
        int miesiec =1;

        String miesiecS = switch (miesiec){
            case 1->"styczeń";
            case 2->"luty";
            case 3->"marzec";
            case 4->"kwiecień";
            case 5->"maj";
            default -> "niepoprawna waritosc";
        };

    }
}
