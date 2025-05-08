package AlgoritmaStrukturData.Pertemuan10;
import java.util.Scanner;
public class SuratDemo27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kapasitas maksimum stack surat: ");
        int kapasitas = scan.nextInt();
        scan.nextLine(); 
        StackSurat27 stackSurat = new StackSurat27(kapasitas);
        int pilihan;
        do {
            System.out.println("\nMenu Manajemen Surat Izin:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin (Verifikasi)"); 
            System.out.println("3. Lihat Surat Izin Terakhir"); 
            System.out.println("4. Cari Surat Izin Berdasarkan Nama Mahasiswa"); 
            System.out.println("5. Lihat Semua Surat Izin");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Terima Surat Izin ---");
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMhs = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelasMhs = scan.nextLine();
                    char jenisIzin;
                    do {
                        System.out.print("Jenis Izin (S untuk Sakit, I untuk Izin Lain): ");
                        jenisIzin = scan.nextLine().toUpperCase().charAt(0);
                    } while (jenisIzin != 'S' && jenisIzin != 'I');
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine(); 

                    Surat27 suratBaru = new Surat27(idSurat, namaMhs, kelasMhs, jenisIzin, durasi);
                    stackSurat.push(suratBaru);
                    break;
                case 2:
                    System.out.println("\n--- Proses Surat Izin ---");
                    Surat27 suratDiproses = stackSurat.pop();
                    if (suratDiproses != null) {
                        System.out.println("Surat berikut diproses/diverifikasi:");
                        System.out.println(suratDiproses.toString());
                    }
                    break;
                case 3:
                    System.out.println("\n--- Lihat Surat Izin Terakhir ---");
                    Surat27 suratTeratas = stackSurat.peek();
                    if (suratTeratas != null) {
                        System.out.println("Surat izin terakhir yang masuk:");
                        System.out.println(suratTeratas.toString());
                    }
                    break;
                case 4:
                    System.out.println("\n--- Cari Surat Izin ---");
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String namaCari = scan.nextLine();
                    Surat27 suratDitemukan = stackSurat.findSuratByNama(namaCari);
                    if (suratDitemukan != null) {
                        System.out.println("Surat ditemukan:");
                        System.out.println(suratDitemukan.toString());
                    }
                    break;
                case 5:
                    System.out.println("\n--- Semua Surat Izin ---");
                    stackSurat.printAllSurat();
                    break;
                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);

        scan.close();
    }
}
