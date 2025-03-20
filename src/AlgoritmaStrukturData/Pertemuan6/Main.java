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
            System.out.println("5. Keluar");
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
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
