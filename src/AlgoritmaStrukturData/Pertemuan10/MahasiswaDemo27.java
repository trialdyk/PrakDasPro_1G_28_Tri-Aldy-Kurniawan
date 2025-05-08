package AlgoritmaStrukturData.Pertemuan10;

import java.util.Scanner;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
        StackTugasMahasiswa27 stack = new StackTugasMahasiswa27(5);
        Scanner scan = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah (Pertama Dikumpulkan)");
            System.out.println("6. Hitung Jumlah Tugas Terkumpul");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa27 mhs = new Mahasiswa27(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa27 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa27 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa27 terbawah = stack.peekBottom();
                    if (terbawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + terbawah.nama + " (NIM: " + terbawah.nim
                                + ", Kelas: " + terbawah.kelas + ")");
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang sudah dikumpulkan saat ini: " + stack.countTasks());
                    break;
                default:
                    if (pilih >= 1 && pilih <= 6) {
                        System.out.println("Pilihan tidak valid.");
                    }
            }
        } while (pilih >= 1 && pilih <= 4);
        System.out.println("Terima kasih!");
        scan.close();
    }
}
