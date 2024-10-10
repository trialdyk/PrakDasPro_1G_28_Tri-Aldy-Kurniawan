package Pertemuan6;
import java.util.Scanner;
public class Pemilihan2Percobaan228 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);

        Double diskon = 0.0;
        int pilihan_menu;
        String member = "";
        Double harga,total_bayar = 0.0;

        System.out.println("----------------------------");
        System.out.println("====== Menu Kafe JTI =======");
        System.out.println("----------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling ( Ricebox + Ice Tea )");
        System.out.println("----------------------------");
        System.out.print("Masukkan Angka Dari Menu Yang Dipilih = ");
        pilihan_menu = input28.nextInt();
        input28.nextLine();

        System.out.print("Apakah punya member (y/n) ? = ");
        member = input28.nextLine();
        System.out.println("----------------------------");

        if(member.equalsIgnoreCase("y")){
            diskon = 0.10;
            System.out.println("Besar Diskon = 10%");
            if(pilihan_menu == 1){
                harga = 14000.0;
                System.out.println("Harga Menu Ricebowl = "+harga);
            }else if(pilihan_menu == 2){
                harga = 3000.0;
                System.out.println("Harga Menu Ice Tea = "+harga);
            }else if(pilihan_menu == 3){
                harga = 15000.0;
                System.out.println("Harga Menu Paket Bundling = "+harga);
            }else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga + (harga * diskon);
            System.out.println("Total Harga Setelah Diskon = "+total_bayar);

        }else if(member.equalsIgnoreCase("n")){
            if(pilihan_menu == 1){
                harga = 14000.0;
                System.out.println("Harga Menu Ricebowl = "+harga);
            }else if(pilihan_menu == 2){
                harga = 3000.0;
                System.out.println("Harga Menu Ice Tea = "+harga);
            }else if(pilihan_menu == 3){
                harga = 15000.0;
                System.out.println("Harga Menu Paket Bundling = "+harga);
            }else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            System.out.println("Total Harga = "+harga);
        }else{
            System.out.println("Member tidak valid");
        }
    }
}
