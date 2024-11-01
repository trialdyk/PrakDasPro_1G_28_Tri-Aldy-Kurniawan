package Pertemuan10;

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int[] nilaiMhs = new int[input.nextInt()];
        int tertinggi = 0;
        int terendah = 100;
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];

            if(nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if(nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        rata2 = total / nilaiMhs.length;

        System.out.println("================ Nilai Mahasiswa ================");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Mahasiswa ke-"+(i+1)+" Nilai : "+nilaiMhs[i]);
        }
        System.out.println("================ Nilai Mahasiswa ================");
        System.out.println("Rata-rata Nilai Mahasiswa : "+rata2);
        System.out.println("Tertinggi : "+tertinggi);
        System.out.println("Terendah : "+terendah);
    }
}
