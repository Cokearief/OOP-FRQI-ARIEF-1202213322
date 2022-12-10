package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args, String name) {
        // TODO Create Database
        Database db = new Database();

        // TODO Create Menu
        Menu menu1 = new Menu();
        menu1.setName("Kambing");
        menu1.setCategory("Makanan");
        menu1.setPrice(10000);

        Menu menu2 = new Menu();
        menu2.setName("Ice");
        menu2.setCategory("Minuman");
        menu2.setPrice(5000);

        Menu menu3 = new Menu();
        menu3.setName("Nasi Padang");
        menu3.setCategory("name");
        menu3.setPrice(15000);


        // TODO Insert Menu to Database
        db.InsertMenu(menu1);


        // TODO Display Main Menu


        // TODO Create User

        // Display Menu
    }
}
