package Pertemuan13;

public class PengunjungKafe28 {
    public static void main(String[] args) {
        daftarPengunjung("Ali","Budi","Citra");
    }

    public static void daftarPengunjung(String... namaPengunjung){
        System.out.println("Daftar Nama Pengunjung");
        for(String nama : namaPengunjung){
            System.out.println(nama);
        }
    }

    public static void daftarMenu(int[] harga, String... namaMenu){
        System.out.println("Daftar Menu");
        for(int i = 0; i < harga.length; i++){
            System.out.println(namaMenu[i]+" : "+harga[i]);
        }
    }
}
