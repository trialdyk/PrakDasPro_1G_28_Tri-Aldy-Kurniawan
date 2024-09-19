package Pertemuan3;
import java.util.Scanner;

public class Siakad28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

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
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = input.nextDouble();

        
        
    }
}