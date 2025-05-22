package AlgoritmaStrukturData.Pertemuan13.Tugas1;
import java.util.Scanner;
public class MainVaksinasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianVaksinDLL antrian = new AntrianVaksinDLL();
        int pilihanMenu;
        do {
            System.out.println("\n++++++++++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.print("Masukkan pilihan: ");
            pilihanMenu = sc.nextInt();
            sc.nextLine(); 
            try {
                switch (pilihanMenu) {
                    case 1:
                        System.out.println("------------------------------");
                        System.out.println("Masukkan Data Penerima Vaksin");
                        System.out.println("------------------------------");
                        System.out.print("Nomor Antrian: ");
                        int noAntrian = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Nama Penerima: ");
                        String namaPenerima = sc.nextLine();
                        antrian.tambahAntrian(new Penerima(noAntrian, namaPenerima));
                        break;
                    case 2:
                        if (!antrian.isEmpty()) {
                            antrian.hapusData(); 
                            antrian.cetakAntrian(); 
                        } else {
                            System.out.println("Antrian masih kosong.");
                        }
                        break;
                    case 3:
                        antrian.cetakAntrian();
                        break;
                    case 4:
                        System.out.println("Terima kasih telah menggunakan program ini.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } catch (Exception e) {
                System.err.println("Terjadi kesalahan: " + e.getMessage());
            }
        } while (pilihanMenu != 4);
        sc.close();
    }
}