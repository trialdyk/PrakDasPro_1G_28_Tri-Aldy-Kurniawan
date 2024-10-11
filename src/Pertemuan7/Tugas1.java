package Pertemuan7;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlTiket = 0;
        int hargaTiket = 50000;
        int harga;
        int totalTiketTerjual = 0;
        int totalHargaTiket = 0;
        double diskon = 0;

        do{
            System.out.print("Masukkan Jumlah Tiket ( Ketik 0 untuk Keluar Dari Program ) : ");
            jmlTiket = input.nextInt();

            if(jmlTiket == 0) break;

            if(jmlTiket < 0){
                System.out.println("Jumlah Tiket tidak boleh negatif");
                continue;
            }

            if(jmlTiket > 10){
                diskon = 0.15;
            }else if(jmlTiket > 4){
                diskon = 0.1;
            }

            harga = hargaTiket * jmlTiket;
            harga = (int) (harga - (harga * diskon));
            totalTiketTerjual += jmlTiket;
            totalHargaTiket += harga;

            System.out.println("Jumlah Tiket : "+jmlTiket);
            System.out.println("Harga Yang Harus Dibayar : "+harga);
            input.nextLine();
        }while(true);

        System.out.println("====Statistik Hari Ini====");
        System.out.println("Total Tiket Terjual : "+totalTiketTerjual);
        System.out.println("Total Harga Tiket : "+totalHargaTiket);
    }
}
