package AlgoritmaStrukturData.Pertemuan3;

import java.util.Scanner;
public class DosenDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data Dosen : ");
        int jumlahData = Integer.parseInt(sc.nextLine());
        Dosen27[] arrayOfDosen = new Dosen27[jumlahData];

        for(int i = 0; i < jumlahData; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            arrayOfDosen[i] = new Dosen27();
            System.out.print("Kode        : ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama        : ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin (0 = Pria | 1 = Wanita ): ");
            arrayOfDosen[i].jenisKelamin = Boolean.parseBoolean(sc.nextLine());
            System.out.print("Usia        : ");
            arrayOfDosen[i].usia = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------------");
        }

        DataDosen27 dataDosen = new DataDosen27();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
