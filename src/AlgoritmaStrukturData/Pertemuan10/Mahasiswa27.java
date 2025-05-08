package AlgoritmaStrukturData.Pertemuan10;

public class Mahasiswa27 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa27(String nim, String nama, String kelas) {
        this.nim = nim; 
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1; 
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai; 
    }
}