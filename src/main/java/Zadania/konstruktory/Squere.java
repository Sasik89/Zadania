package Zadania.konstruktory;

public class Squere {
    int side;
    int circle;
    int field;

    Squere(){
        System.out.println("Tworz sie nowy obiekt !!!");
    }

    Squere(int side, int circle, int field){
       this.side = side;
        this.circle = circle;
        this.field = field;
    }

    Squere(int side){
        this(side, side*4, side*side);
    }

/*    Squere(int side){
        this.side = side;
        this.circle = side*4;
        this.field = side* side;
        System.out.println(circle);
        System.out.println(field);
    }*/

    void WypiszNaEkranie(){  //metoda odwołuje sie do samej siebie, a konkretnie do pól na obiekcie którym została wywołana
        System.out.println(this.side);
        System.out.println(this.field);
        System.out.println(this.circle);
    }


}
