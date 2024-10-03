package Pertemuan5;
import java.util.Scanner;

public class PemilianBilangan28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Sebuah Angka: ");
        int angka = input.nextInt();

        if(angka % 2 == 0) {
            System.out.println("Angka "+angka+" adalah bilangan genap");
        } else {
            System.out.println("Angka "+angka+" adalah bilangan ganjil");
        }
    }
}
