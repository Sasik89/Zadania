package Zadania.kolekcje.kolejki;

public class App {
    public static void main(String[] args) {

        FIFO fifo = new FIFO();

        System.out.println(fifo.size());

        fifo.push(5);
        fifo.push(10);
        fifo.push(15);

        System.out.println(fifo.size());

        System.out.println(fifo.pop());

        System.out.println(fifo.peek());

        System.out.println(fifo.pop());
        fifo.push(20);

        System.out.println(fifo.pop());

        System.out.println(fifo.peek());

    }
}
