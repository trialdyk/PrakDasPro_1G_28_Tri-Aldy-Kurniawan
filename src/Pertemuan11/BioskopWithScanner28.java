package Pertemuan11;
import java.util.Scanner;
public class BioskopWithScanner28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris,kolom;
        String nama;

        String[][] penonton = new String[4][2];

        while(true){
            System.out.print("Masukkan nama : ");
            nama = input.nextLine();

            System.out.print("Masukkan baris : ");
            baris = input.nextInt();

            System.out.print("Masukkan kolom : ");
            kolom = input.nextInt();
            input.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.println("Nama "+nama+" telah disimpan pada baris "+baris+" kolom "+kolom);

            System.out.print("Ingin input nama penonton lainnya ? (Y/N) : ");
            String next = input.nextLine();

            if(next.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}
