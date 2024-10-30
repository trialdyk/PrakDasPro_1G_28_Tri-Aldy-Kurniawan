package Pertemuan9;
import java.util.Scanner;

public class RataNilai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j;
        float nilai,totalNilai,rataNilai;


        i = 1;
        while(i<=5){
            System.out.println("Input Nilai Mahasiswa Ke "+i);
            totalNilai = 0;
            for (j = 1 ; j <= 5 ; j++) {
                System.out.print("Masukkan nilai ke-"+j+": ");
                nilai = sc.nextFloat();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-Nilai Mahasiswa Ke "+i+" adalah "+rataNilai);
            i++;
        }
    }
}