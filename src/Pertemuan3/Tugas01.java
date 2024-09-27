package Pertemuan3;
import java.util.Scanner;
public class Tugas01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tarifPerKwh = 1500.0;
        double penggunaanListrik;
        double totalTagihan;
        boolean penggunaanMelebihi500Kwh;

        System.out.print("Masukkan penggunaan listrik dalam kWh: ");
        penggunaanListrik = input.nextDouble();

        totalTagihan = penggunaanListrik * tarifPerKwh;
        penggunaanMelebihi500Kwh = penggunaanListrik > 500;

        System.out.println("Penggunaan listrik: " + penggunaanListrik + " kWh");
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Penggunaan listrik melebihi 500 kWh: " + penggunaanMelebihi500Kwh);

        
    }
}