package Zadania.obiektowosc;

public class App {
    public static void main(String[] args) {

        Client c1 = new Client();
        c1.address = new Address(); //chcąc dostać się do pola w klasie które sam stanowi klasę trzeba stworzyć nowy obiekt.
        c1.address.city = "Kraków";
        c1.address.street = "Pawia";
        c1.name = "Staszek";
        c1.surname = "Kupiec";
        c1.age = 40;

        Client c2 = new Client();
        c2.address = new Address();
        c2.address.city = "Tarnów";
        c2.address.street = "Pawia";
        c2.name = "Janek";
        c2.surname = "Kupiec";
        c2.age = 40;


        Client c3 = new Client();
        c3.address = new Address();
        c3.address.city = "Jastrzębie Zdrój";
        c3.address.street = "Pawia";
        c3.name = "Wiesiek";
        c3.surname = "Kupiec";
        c3.age = 55;


        Client[] tablica = new Client[3];
        tablica[0] = c1;
        tablica[1] = c2;
        tablica[2] = c3;


        for(Client client : tablica){
            System.out.println(client.toString());
        }


    }





}
