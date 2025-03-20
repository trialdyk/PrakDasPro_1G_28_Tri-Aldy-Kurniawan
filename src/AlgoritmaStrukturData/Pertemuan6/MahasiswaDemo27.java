package AlgoritmaStrukturData.Pertemuan6;

import java.util.Scanner;

import AlgoritmaStrukturData.Pertemuan5.Mahasiswa;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi27 list = new MahasiswaBerprestasi27();

        System.out.println("Input Data Mahasiswa : ");
        for(int i = 0; i < list.listMhs.length; i++){
            System.out.println("Data Mahasiswa 1");
            System.out.print("NIM :");
            int nim = input.nextInt();
            input.nextLine();
            System.out.print("Nama :");
            String nama = input.nextLine();
            System.out.print("Kelas :");
            String kelas = input.nextLine();
            System.out.print("IPK :");
            double ipk = input.nextDouble();
            list.tambah(new Mahasiswa27(Integer.toString(nim), nama, kelas, ipk));
        }
        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();
    }
}
