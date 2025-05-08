package AlgoritmaStrukturData.Pertemuan11;

import java.util.Scanner;

public class LayananAkademikSiakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(5);
        int pilihan;

        do {
            System.out.println("\nMenu Antrian Layanan Akademik:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Daftar Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa Dalam Antrian");
            System.out.println("6. Cek Antrian Terakhir");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    Mahasiswa mhsDilayani = antrian.dequeue();
                    if (mhsDilayani != null) {
                        System.out.println("Mahasiswa berhasil dilayani");
                        mhsDilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.print();
                    break;
                case 5:
                    System.out.println("Jumlah Mahasiswa Dalam Antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    Mahasiswa mhsTerakhir = antrian.antrianTerakhir();
                    if (mhsTerakhir != null) {
                        System.out.println("Mahasiswa terakhir yang masuk antrian:");
                        mhsTerakhir.tampilkanData();
                    }
                    break;
                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }while (pilihan != 0);
        sc.close();
    }
}
