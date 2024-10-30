package Pertemuan9;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            System.out.println("Masukkan Nama Atlet Untuk Cabor ke-"+i);
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nama Atlet ke-"+j+": ");
                String nama = input.nextLine();
                System.out.println("Nama Atlet ke-"+j+" adalah "+nama);
            }
        }
    }
}
