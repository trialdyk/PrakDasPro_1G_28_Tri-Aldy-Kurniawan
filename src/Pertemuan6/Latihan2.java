package Pertemuan6;
import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hari;

        System.out.print("Masukkan hari : ");
        hari = input.nextLine();

        if(!hari.equalsIgnoreCase("rabu")){
            System.out.println("hari ini tidak ada diskon");
            return;
        }

        String buku;
        int jmlBuku;
        double diskon;

        System.out.print("Masukkan kategori buku : ");
        buku = input.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jmlBuku = input.nextInt();

        if(buku.equalsIgnoreCase("kamus") && jmlBuku > 2){
            diskon = 0.12;
        }else if(buku.equalsIgnoreCase("kamus")){
            diskon = 0.1;
        }else if(buku.equalsIgnoreCase("novel") && jmlBuku > 3){
            diskon = 0.09;
        }else if(buku.equalsIgnoreCase("novel")){
            diskon = 0.08;
        }else if(jmlBuku > 3){
            diskon = 0.05;
        }else{
            diskon = 0;
        }

        System.out.println("Jumlah Diskon Anda adalah "+( diskon * 100)+"%");
    }
}
