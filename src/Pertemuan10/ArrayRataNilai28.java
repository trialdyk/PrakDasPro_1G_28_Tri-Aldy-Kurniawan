package Pertemuan10;
import java.util.Scanner;
public class ArrayRataNilai28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int[] nilaiMhs = new int[input.nextInt()];
        double total = 0;
        double rata2;
        int mhsLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+i+": ");
            nilaiMhs[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if(nilaiMhs[i] > 70) {
                mhsLulus++;
            }
            total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata Nilai Mahasiswa : "+rata2);
        System.out.println("Mahasiswa yang Lulus : "+mhsLulus);
    }
}
