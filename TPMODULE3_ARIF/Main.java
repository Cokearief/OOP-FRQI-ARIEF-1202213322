package TPMODULE3_ARIF;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        Restaurant restoran = new Restaurant();
        int customerID, orderQty;

        try {
            System.out.println("Enter Customer ID: ");
            customerID = inputan.nextInt();

            System.out.println("Enter how much Food to made: ");
            orderQty = inputan.nextInt();

            Thread t1 = new Thread(restoran);
            Waiters waiter = new Waiters(customerID, orderQty);
            Thread t2 = new Thread(waiter);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }
        inputan.close();
    }
}