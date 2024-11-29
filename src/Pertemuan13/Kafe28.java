package Pertemuan13;

import java.util.Scanner;
public class Kafe28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Menu("Andi", true);

        System.out.print("Masukkan nomor menu yang anda pilih : ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang anda inginkan : ");
        int banyakItem = sc.nextInt();

        System.out.println("Masukkan Kode Promo : ");
        String kodePromo = sc.next();

        int totalHarga = hitungTotalHarga(pilihanMenu,banyakItem,kodePromo);

        System.out.println("Total Harga untuk pesanan anda : " + totalHarga);
    }

    public static void Menu(String namaPelanggan,boolean isMember){
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if(isMember){
            System.out.println("Anda adalah member,dapatkan diskon 10% setiap pembelian");
        }

        System.out.println("===== Menu Resto Kafe =====");
        System.out.println("1. Kopi Hitam - Rp. 15,000");
        System.out.println("2. Cappucino - Rp. 20,000");
        System.out.println("3. Latte - Rp. 22,000");
        System.out.println("4. Teh Tarik - Rp. 12,000");
        System.out.println("5. Roti Bakar - Rp. 10,000");
        System.out.println("6. Mie Goreng - Rp. 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu,int banyakItem,String kodePromo){

        int[] hargaItems = {15000,20000,22000,12000,10000,18000};
        
        int hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;
        
        if(kodePromo.equalsIgnoreCase("DISKON50")){
            System.out.println("Anda mendapatkan diskon 50%");
            hargaTotal -= hargaTotal * 0.5;
        }else if(kodePromo.equalsIgnoreCase("DISKON30")){
            System.out.println("Anda mendapatkan diskon 30%");
            hargaTotal -= hargaTotal * 0.3;
        }
        return hargaTotal;
    }
}
