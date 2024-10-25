package Pertemuan8;
import java.util.Scanner;

public class Gaji28 {
    public static void main(String[] args) {
        Scanner aldy = new Scanner(System.in);

        String nama28 = "",alamat28 = "",noHp28 = "";
        int golongan28 = 0,jumlahKehadiran28 = 0;
        double gaji28 = 0.0,menu28 = 0.0,gajiPokok28 = 0.0,masaKerja28 = 0.0,totalTunjangan28,tunjangan28,uangMakan28;


        System.out.println("=== UTS PRAKTIKUM DASAR PEMROGRAMAN TI - 1G ===");
        System.out.println("Dibuat oleh : Tri Aldy Kurniawan");
        System.out.println("NIM         : 244107020098");
        System.out.println("===============================================");

        do{
            System.out.println("===============================================");
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Data Karyawan");
            System.out.println("2. Gaji Karyawan");
            System.out.println("===============================================");
            System.out.print("menu : ");
            menu28 = aldy.nextInt();
            aldy.nextLine();

            if(menu28 == 1){

                System.out.println("===============================================");
                System.out.println("Data Karyawan");
                System.out.println("===============================================");
                System.out.print("Nama Karyawan     : ");
                nama28 = aldy.nextLine();
                System.out.print("Alamat Karyawan   : ");
                alamat28 = aldy.nextLine();
                System.out.print("No. Hp Karyawan   : ");
                noHp28 = aldy.nextLine();
                System.out.print("Golongan (1/2/3)  : ");
                golongan28 = aldy.nextInt();
                System.out.print("Masa Kerja (tahun): ");
                masaKerja28 = aldy.nextDouble();
                System.out.print("Jumlah Kehadiran  : ");
                jumlahKehadiran28 = aldy.nextInt();
                aldy.nextLine();
                System.out.print("Apakah Anda Ingin Mencetak Data Karyawan (y/t) ? : ");
                char cetak28 = aldy.nextLine().charAt(0);

                if(cetak28 == 'y'){
                    System.out.println("===============================================");
                    System.out.println("Data Karyawan");
                    System.out.println("===============================================");
                    System.out.println("Nama             : "+nama28);
                    System.out.println("Alamat           : "+alamat28);
                    System.out.println("No. Hp           : "+noHp28);
                    System.out.println("Golongan         : "+golongan28);
                    System.out.println("Masa Kerja       : "+masaKerja28);
                    System.out.println("Jumlah Kehadiran : "+jumlahKehadiran28);
                    System.out.println("===============================================");
                }

            }else if(menu28 == 2){
                if(nama28.equalsIgnoreCase("") || alamat28.equalsIgnoreCase("") 
                || noHp28.equalsIgnoreCase("") || (golongan28 <= 0 || golongan28 > 3) || (jumlahKehadiran28 <= 0)){
                    System.out.println("Data Karyawan Belum Diisi / Tidak Valid");
                }else{
                    switch (golongan28) {
                        case 1:
                            gajiPokok28 = 2000000.0;
                            break;
                        case 2:
                            gajiPokok28 = 2500000.0;
                            break;
                        case 3:
                            gajiPokok28 = 3000000.0;
                            break;
                    }
    
                    if(masaKerja28 > 8){
                        tunjangan28 = 0.25;
                    }else if(masaKerja28 > 5){
                        tunjangan28 = 0.2;
                    }else if(masaKerja28 > 3){
                        tunjangan28 = 0.1;
                    }else{
                        tunjangan28 = 0;
                    }
    
                    totalTunjangan28 = gajiPokok28 * tunjangan28;
                    uangMakan28 = jumlahKehadiran28 * 35000;
    
                    gaji28 = gajiPokok28 + uangMakan28 + totalTunjangan28;
    
                    System.out.println("===============================================");
                    System.out.println("Data Gaji Karyawan");
                    System.out.println("===============================================");
                    System.out.println("Nama                 : "+nama28);
                    System.out.println("Gaji Pokok           : "+gajiPokok28);
                    System.out.println("Total Tunjangan      : "+totalTunjangan28);
                    System.out.println("Uang Makan           : "+uangMakan28);
                    System.out.println("Gaji Yang Diterima   : "+gaji28);
                    System.out.println("===============================================");
                }
  
            }

            System.out.print("Apakah Anda Ingin Kembali Ke Menu (y/t) ? : ");
            char back28 = aldy.nextLine().charAt(0);
            if(back28 != 'y') break;

        }while(true);
    }
}
