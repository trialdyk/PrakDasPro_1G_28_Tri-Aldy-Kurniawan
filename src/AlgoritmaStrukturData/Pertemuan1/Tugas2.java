package AlgoritmaStrukturData.Pertemuan1;
import java.util.Scanner;
public class Tugas2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int pilihan = menu();
            System.out.print("Masukkan Panjang Sisi Kubus : ");
            double sisi = input.nextDouble();
            switch (pilihan) {
                case 1:
                    System.out.println("Volume Kubus : " + hitungVolume(sisi));
                    break;
                case 2:
                    System.out.println("Luas Permukaan Kubus : " + hitungLuas(sisi));
                    break;
                case 3:
                    System.out.println("Keliling Kubus : " + hitungKeliling(sisi));
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
    public static int menu() {
        System.out.println("=========== Menu ==========");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar Program");
        System.out.println("===========================");
        System.out.print("Pilih Menu : ");
        int pilihan = input.nextInt();
        if (pilihan < 1 || pilihan > 4) {
            System.out.println("Pilihan tidak valid");
            return menu();
        }
        return pilihan;
    }
    public static double hitungVolume(double sisi) {
        double volume = sisi * sisi * sisi;
        return volume;
    }
    public static double hitungLuas(double sisi) {
        double luas = sisi * sisi * 6;
        return luas;
    }
    public static double hitungKeliling(double sisi) {
        double keliling = sisi * 12;
        return keliling;
    }
}
