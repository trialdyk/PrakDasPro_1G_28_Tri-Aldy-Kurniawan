package Pertemuan13;

import java.util.Scanner;
public class Kubus28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang Sisi: ");
        int sisi = input.nextInt();

        System.out.println("Volume Kubus : "+hitungLuas(sisi) );
        System.out.println("Luas Permukaan Kubus : "+hitungLuasPermukaan(sisi));
    }

    public static int hitungLuas(int sisi){
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi){
        return sisi * sisi * 6;
    }
}
