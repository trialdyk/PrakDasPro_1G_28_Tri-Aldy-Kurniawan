package AlgoritmaStrukturData.Pertemuan3;

import java.util.Scanner;
public class MahasiswaDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa27[] arrayOfMahasiswa = new Mahasiswa27[3];
        String dummy;
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa27();
            System.out.println("Masukkan Data Mahasiswa Ke-"+(i+1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------");
        }
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i].cetakInfo();
            System.out.println("----------------------------------");
        }
    }
}
