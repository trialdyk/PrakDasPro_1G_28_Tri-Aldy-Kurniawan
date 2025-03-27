package AlgoritmaStrukturData.Pertemuan6;

import java.util.Scanner;

import AlgoritmaStrukturData.Pertemuan5.Mahasiswa;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        MahasiswaBerprestasi27 list = new MahasiswaBerprestasi27(input.nextInt());
        input.nextLine();

        System.out.println("Input Data Mahasiswa : ");
        for(int i = 0; i < list.listMhs.length; i++){
            System.out.println("Data Mahasiswa Ke-"+(i+1));
            System.out.print("NIM : ");
            int nim = input.nextInt();
            input.nextLine();
            System.out.print("Nama : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK : ");
            double ipk = input.nextDouble();
            list.tambah(new Mahasiswa27(Integer.toString(nim), nama, kelas, ipk));
        }

        System.out.println("---------------------------");
        System.out.println("Pencarian Data");
        System.out.println("---------------------------");
        System.out.print("Masukkan IPK Yang Dicari : ");
        double cari = input.nextDouble();

        System.out.println("Menggunakan Binary Search");
        int posisi = list.findBinarySearch(cari, 0, list.listMhs.length - 1);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}
