package Pertemuan13;

public class PengunjungKafe28 {
    public static void main(String[] args) {
        daftarPengunjung("Ali","Budi","Citra");
    }

    public static void daftarPengunjung(String... namaPengunjung){
        System.out.println("Daftar Nama Pengunjung");

        for(int i = 1; i < namaPengunjung.length; i++){
            System.out.println(i+1 + ". " + namaPengunjung[i]);
        }

    }
}
