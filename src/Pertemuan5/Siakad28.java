package Pertemuan5;
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
        System.out.print("Masukkan nilai UTS: ");
        NilaiUTS = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = input.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (NilaiUTS * 0.3) + (nilaiUAS * 0.3);
        
        
        String nilaiHuruf;
        String kualifikasi;

        if(nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        }else if(nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        }else if(nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        }else if(nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        }else if(nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        }else if(nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        }else if(nilaiAkhir > 0 && nilaiAkhir <= 39){
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }else{
            nilaiHuruf = "Invalid";
            kualifikasi = "Invalid";
        }

        System.out.println("Nama: " + nama +"Nim :" +nim);
        System.out.println("Kelas: " + kelas +"Absen :" +absen);
        System.out.println("Nilai Akhir : " +nilaiAkhir);
        System.out.println("Nilai Akhir Huruf : "+nilaiHuruf);
        System.out.println("Kualifikasi : "+kualifikasi);
    }
}