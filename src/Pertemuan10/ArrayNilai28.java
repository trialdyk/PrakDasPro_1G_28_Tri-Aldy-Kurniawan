package Pertemuan10;

import java.util.Scanner;
public class ArrayNilai28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai Akhir Ke-"+i+": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if(nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-"+i+" Lulus! ");
            }else{
                System.out.println("Mahasiswa ke-"+i+" Tidak Lulus! ");
            }
        }
    }
}
