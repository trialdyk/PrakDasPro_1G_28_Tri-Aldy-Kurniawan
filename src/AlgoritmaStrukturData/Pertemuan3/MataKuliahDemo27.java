package AlgoritmaStrukturData.Pertemuan3;
import java.util.Scanner;

public class MataKuliahDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data Matakuliah : ");
        int jumlahData = Integer.parseInt(sc.nextLine());
        MataKuliah27[] arrayOfMatakuliah = new MataKuliah27[jumlahData];

        for(int i = 0; i < jumlahData; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new MataKuliah27();
            arrayOfMatakuliah[i].tambahData();
            System.out.println("------------------------------");
        }

        for(int i = 0; i < jumlahData; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("------------------------------");
        }
    }
}
