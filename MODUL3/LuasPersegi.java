package MODUL3;

import java.util.Scanner;

public class LuasPersegi {
    public static void main(String[] args) {
        int sisi, luas;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        sisi = scan.nextInt();

        luas = sisi * sisi;

        System.out.println("Luas Persegi adalah " + luas);
    }
}
