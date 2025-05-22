package AlgoritmaStrukturData.Pertemuan13.Tugas2;
import java.util.Scanner;
public class MainFilm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilmDDL daftarFilm = new FilmDDL();
        try {
            daftarFilm.addLast(new Film(1222, "Spider-Man: No Way Home", 8.7));
            daftarFilm.addLast(new Film(1765, "Skyfall", 7.8));
            daftarFilm.addLast(new Film(1567, "The Dark Knight Rises", 8.4));
            daftarFilm.addLast(new Film(1234, "Death on The Nile", 6.6));
            daftarFilm.addLast(new Film(1346, "Uncharted", 6.7));
        } catch (Exception e){
            System.err.println("Gagal menambah data awal: " + e.getMessage());
        }
        int pilihanMenu;
        do {
            System.out.println("\nDATA FILM LAYAR LEBAR");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihanMenu = sc.nextInt();
            sc.nextLine(); 
            try {
                switch (pilihanMenu) {
                    case 1:
                        System.out.println("Masukkan Data Film Posisi Awal");
                        System.out.print("ID Film: ");
                        int idAwal = sc.nextInt(); sc.nextLine();
                        System.out.print("Judul Film: ");
                        String judulAwal = sc.nextLine();
                        System.out.print("Rating Film (misal 8.7): ");
                        double ratingAwal = sc.nextDouble(); sc.nextLine();
                        daftarFilm.addFirst(new Film(idAwal, judulAwal, ratingAwal));
                        break;
                    case 2:
                        System.out.println("Masukkan Data Film Posisi Akhir");
                        System.out.print("ID Film: ");
                        int idAkhir = sc.nextInt(); sc.nextLine();
                        System.out.print("Judul Film: ");
                        String judulAkhir = sc.nextLine();
                        System.out.print("Rating Film (misal 6.7): ");
                        double ratingAkhir = sc.nextDouble(); sc.nextLine();
                        daftarFilm.addLast(new Film(idAkhir, judulAkhir, ratingAkhir));
                        break;
                    case 3:
                        System.out.println("Masukkan Data Film");
                        System.out.print("ID Film: ");
                        int idIndex = sc.nextInt(); sc.nextLine();
                        System.out.print("Judul Film: ");
                        String judulIndex = sc.nextLine();
                        System.out.print("Rating Film: ");
                        double ratingIndex = sc.nextDouble(); sc.nextLine();
                        System.out.print("Masukkan Index Posisi Penyisipan: ");
                        int indexSisp = sc.nextInt(); sc.nextLine();
                        daftarFilm.add(new Film(idIndex, judulIndex, ratingIndex), indexSisp);
                        break;
                    case 4:
                        daftarFilm.removeFirst();
                        break;
                    case 5:
                        daftarFilm.removeLast();
                        break;
                    case 6:
                        System.out.print("Masukkan Index Film yang akan dihapus: ");
                        int idxHapus = sc.nextInt(); sc.nextLine();
                        daftarFilm.remove(idxHapus);
                        break;
                    case 7:
                        daftarFilm.printAll();
                        break;
                    case 8:
                        System.out.println("Cari Data");
                        System.out.print("Masukkan ID Film yang dicari: ");
                        int idCari = sc.nextInt(); sc.nextLine();
                        daftarFilm.searchByID(idCari);
                        break;
                    case 9:
                        daftarFilm.sortByRatingDesc();
                        System.out.println("Data setelah diurutkan:");
                        daftarFilm.printAll();
                        break;
                    case 10:
                        System.out.println("Terima kasih telah menggunakan program daftar film!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } catch (Exception e) {
                System.err.println("Terjadi kesalahan: " + e.getMessage());
            }
        } while (pilihanMenu != 10);
        sc.close();
    }
}
