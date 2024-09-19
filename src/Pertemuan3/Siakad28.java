package Pertemuan3;
import java.util.Scanner;

public class Siakad28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, NilaiUTS,nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan nim: ");
        nim = input.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = input.nextLine();
        System.out.print("Masukkan absen: ");
        absen = input.nextByte();
        

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = input.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.println("Masukkan nilai UTS: ");
        NilaiUTS = input.nextDouble();
        System.out.println("Masukkan nilai UAS: ");
        nilaiUAS = input.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (NilaiUTS * 0.3) + (nilaiUAS * 0.3);

        System.out.println("Nama: " + nama +"Nim :" +nim);
        System.out.println("Kelas: " + kelas +"Absen :" +absen);
        System.out.println("Nilai Akhir : " +nilaiAkhir);   
    }
}