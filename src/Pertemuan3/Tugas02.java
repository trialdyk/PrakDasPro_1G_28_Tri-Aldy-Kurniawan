package Pertemuan3;
import java.util.Scanner;
public class Tugas02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah jam kerja: ");
        double jumlahJamKerja = input.nextDouble();
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = input.nextDouble();


        double gajiKotor = jumlahJamKerja * upahPerJam;
        double bonus = gajiKotor * 0.10;
        double gajiSebelumPajak = gajiKotor + bonus;
        double pajak = gajiSebelumPajak * 0.05;
        double gajiBersih = gajiSebelumPajak - pajak;


        System.out.println("Gaji Kotor: " + gajiKotor);
        System.out.println("Bonus: " + bonus);
        System.out.println("Gaji Sebelum Pajak: " + gajiSebelumPajak);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}
