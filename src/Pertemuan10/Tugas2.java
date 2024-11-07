package Pertemuan10;

import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Pesanan : ");
        int jmlPesanan = input.nextInt();
        input.nextLine();
        String[] pesanan = new String[jmlPesanan];
        int[] harga = new int[jmlPesanan];
        int totalHarga = 0;

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan Nama Pesanan Ke-"+(i+1)+": ");
            pesanan[i] = input.nextLine();
            System.out.print("Masukkan Harga Pesanan Ke-"+(i+1)+": ");
            harga[i] = input.nextInt();
            input.nextLine();
            totalHarga += harga[i];
        }

        System.out.println("======= DAFTAR PESANAN =======");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println("Nama Pesanan : "+pesanan[i]+" | RP."+harga[i]);
        }
        System.out.println("==============================");
        System.out.println("Total Harga : "+totalHarga);
    }
}
