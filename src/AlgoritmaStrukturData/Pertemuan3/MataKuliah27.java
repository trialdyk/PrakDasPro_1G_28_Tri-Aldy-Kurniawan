package AlgoritmaStrukturData.Pertemuan3;
import java.util.Scanner;
public class MataKuliah27 {
    static Scanner sc = new Scanner(System.in);
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah27() {
    }

    public MataKuliah27(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(){
        System.out.print("Kode        : ");
        this.kode = sc.nextLine();
        System.out.print("Nama        : ");
        this.nama = sc.nextLine();
        System.out.print("Sks         : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam  : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
    }

    public void cetakInfo(){
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Sks         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
    }
}
