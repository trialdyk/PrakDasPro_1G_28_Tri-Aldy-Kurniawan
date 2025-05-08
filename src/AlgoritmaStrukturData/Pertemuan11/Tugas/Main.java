package AlgoritmaStrukturData.Pertemuan11.Tugas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antrian antrian = new Antrian(10); 
        int totalMahasiswaDPA = 30;
        int pilihan;
        do {
            System.out.println("\n===== Sistem Antrian Persetujuan KRS =====");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Antrian untuk Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Dua Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Cetak Jumlah Antrian Saat Ini");
            System.out.println("10. Cetak Jumlah Mahasiswa Sudah Proses KRS");
            System.out.println("11. Cetak Jumlah Mahasiswa Belum Proses KRS (dari total DPA)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 
            switch (pilihan) {
                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian sudah maksimal (10 mahasiswa). Tidak bisa menambah lagi.");
                        break;
                    }
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    antrian.tambahAntrian(new Mahasiswa(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.panggilAntrianProsesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemuaAntrian();
                    break;
                case 4:
                    antrian.tampilkanDuaAntrianTerdepan();
                    break;
                case 5:
                    antrian.tampilkanAntrianPalingAkhir();
                    break;
                case 6:
                    System.out.println("Apakah antrian kosong? " + (antrian.isEmpty() ? "Ya" : "Tidak"));
                    break;
                case 7:
                    System.out.println("Apakah antrian penuh? " + (antrian.isFull() ? "Ya" : "Tidak"));
                    break;
                case 8:
                    antrian.mengosongkanAntrian();
                    break;
                case 9:
                    System.out.println("Jumlah mahasiswa dalam antrian saat ini: " + antrian.getJumlahAntrian());
                    break;
                case 10:
                    System.out.println("Jumlah mahasiswa yang sudah melakukan proses KRS: " + antrian.getJumlahSudahProsesKRS());
                    break;
                case 11:
                    int belumProses = totalMahasiswaDPA - antrian.getJumlahSudahProsesKRS();
                    System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS (dari target DPA " + totalMahasiswaDPA + "): " + (belumProses >= 0 ? belumProses : 0) );
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem antrian KRS.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
