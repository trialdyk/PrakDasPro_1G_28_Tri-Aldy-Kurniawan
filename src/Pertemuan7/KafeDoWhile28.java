package Pertemuan7;
import java.util.Scanner;
public class KafeDoWhile28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi,teh,roti;
        String namaPelanggan;

        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do{
            System.out.print("Masukkan Nama Pelanggan ( ketik 'batal' untuk keluar) : ");
            namaPelanggan = sc.nextLine();

            if(namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi Dibatalkan");
                break;
            }

            System.out.print("Masukkan Jumlah Kopi : ");
            kopi = sc.nextInt();
            System.out.print("Masukkan Jumlah Teh : ");
            teh = sc.nextInt();
            System.out.print("Masukkan Jumlah Roti : ");
            roti = sc.nextInt();

            int totalHarga = (hargaKopi * kopi) + (hargaTeh * teh) + (hargaRoti * roti);
            System.out.println("Total Harga yang harus dibayar Rp.: "+totalHarga);
            sc.nextLine();
        }while(true);
    }
}
