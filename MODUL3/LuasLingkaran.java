package MODUL3;

import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = keyboard.nextDouble();

        double luas = 3.14 * jariJari * jariJari;

        System.out.println("Luas lingkaran adalah " + luas);
    }
}
