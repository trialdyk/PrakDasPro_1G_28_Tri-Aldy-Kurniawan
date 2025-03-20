package AlgoritmaStrukturData.Pertemuan6;

public class Mahasiswa27 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa27(){
    }

    Mahasiswa27(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}
