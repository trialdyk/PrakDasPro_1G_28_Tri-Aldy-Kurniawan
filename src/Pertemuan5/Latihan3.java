package Pertemuan5;
import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu;
        double harga,jumlah,total,diskon = 0;

        System.out.println("====Selamat Datang di Cafe====");
        System.out.println("Menu Yang Tersedia :");
        System.out.println("-Nasi Goreng");
        System.out.println("-Mie Rebus");
        System.out.println("-Fuyunghai");
        System.out.println("==============================");
        System.out.print("Silakan Masukkan Nama Menu Yang Anda Pesan : ");
        menu = input.nextLine();

        if(!menu.equalsIgnoreCase("nasi goreng") && !menu.equalsIgnoreCase("mie rebus") && !menu.equalsIgnoreCase("fuyunghai")){
            System.out.println("Menu tidak valid");
            System.exit(0);
        }

        System.out.print("Masukkan Harga : ");
        harga = input.nextDouble();

        System.out.print("Masukkan Jumlah Pesanan : ");
        jumlah = input.nextDouble();

        total = harga * jumlah;
        if(total > 500000){
            diskon = 0.1;
        }else if(total > 200000){
            diskon = 0.05;
        }else if(total > 100000){
            diskon = 0.02;
        }

        System.out.println("==== Nota Pembayaran ====");
        System.out.println("Menu Yang Dipesan : "+ menu);
        System.out.println("Jumlah Pesanan : " + jumlah);
        System.out.println("Harga : " + harga);
        System.out.println("Diskon : " + diskon * 100 + "%");
        System.out.println("Total : " + total);
        System.out.println("Total Yang Harus Dibayar : " + (total - (diskon * total)));
    }
}
