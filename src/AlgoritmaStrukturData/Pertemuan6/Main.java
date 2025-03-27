package AlgoritmaStrukturData.Pertemuan6;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Dosen");
            System.out.println("2. Tampilkan Dosen");
            System.out.println("3. Sorting ASC (Usia termuda ke tertua)");
            System.out.println("4. Sorting DSC (Usia tertua ke termuda)");
            System.out.println("5. Cari Dosen Dari Nama");
            System.out.println("6. Cari Dosen Dari Usia");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (1: Laki-laki, 0: Perempuan): ");
                    boolean jk = sc.nextInt() == 1;
                    sc.nextLine();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    data.tambah(new Dosen(kode, nama, jk, usia));
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Data diurutkan ASC!");
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data diurutkan DSC!");
                    break;
                case 5:
                    System.out.print("Inputkan Nama Yang Ingin Dicari : ");
                    String cari = sc.nextLine();
                    int posisi = data.sequentialSearch(cari);
                    if (posisi != -1) {
                        System.out.println("Data bernama " + cari + " ditemukan pada posisi " + (posisi + 1));
                        System.out.println("-------Data------");
                        data.dataDosen[posisi].tampil();
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;
                case 6:
                    System.out.print("Inputkan Usia Yang Ingin Dicari : ");
                    int cariUsia = sc.nextInt();
                    sc.nextLine();
                    int posisiUsia = data.binarySearch(cariUsia, 0, data.idx - 1);
                    if (posisiUsia != -1) {
                        System.out.println("Data berusia " + cariUsia + " ditemukan pada posisi " + (posisiUsia + 1));
                        System.out.println("-------Data------");
                        data.dataDosen[posisiUsia].tampil();
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
