package AlgoritmaStrukturData.Pertemuan12.Tugas;
import java.util.Scanner;
public class SistemAntrianKemahasiswaanManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueMahasiswaManual layanan = new QueueMahasiswaManual();
        int pilihan;
        do {
            System.out.println("\n======================================================");
            System.out.println("   PROGRAM ANTRIAN LAYANAN UNIT KEMAHASISWAAN (MANUAL)");
            System.out.println("======================================================");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Mahasiswa dari Antrian");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Mahasiswa Terakhir");
            System.out.println("5. Cek Apakah Antrian Kosong");
            System.out.println("6. Cek Apakah Ada Mahasiswa Mengantri");
            System.out.println("7. Kosongkan Semua Antrian");
            System.out.println("8. Tampilkan Jumlah Mahasiswa Mengantri");
            System.out.println("9. Tampilkan Semua Mahasiswa dalam Antrian");
            System.out.println("0. Keluar Program");
            System.out.println("======================================================");
            System.out.print("Masukkan pilihan Anda: ");
            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.nextLine();
                pilihan = -1;
                continue;
            }
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Keperluan: ");
                    String keperluan = scanner.nextLine();
                    layanan.tambahAntrian(nim, nama, keperluan);
                    break;
                case 2:
                    layanan.panggilAntrian();
                    break;
                case 3:
                    layanan.lihatAntrianTerdepan();
                    break;
                case 4:
                    layanan.lihatAntrianTerakhir();
                    break;
                case 5:
                    if (layanan.isAntrianKosong()) {
                        System.out.println("Status: Antrian KOSONG.");
                    } else {
                        System.out.println("Status: Antrian TIDAK KOSONG.");
                    }
                    break;
                case 6:
                     if (layanan.isAntrianAdaIsi()) {
                        System.out.println("Status: ADA mahasiswa yang sedang mengantri.");
                    } else {
                        System.out.println("Status: TIDAK ADA mahasiswa yang mengantri.");
                    }
                    break;
                case 7:
                    layanan.kosongkanAntrian();
                    break;
                case 8:
                    layanan.getJumlahMahasiswaMengantre();
                    break;
                case 9:
                    layanan.tampilkanSemuaAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
