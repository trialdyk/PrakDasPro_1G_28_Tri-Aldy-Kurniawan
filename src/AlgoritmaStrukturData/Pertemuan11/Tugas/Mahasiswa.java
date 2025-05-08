package AlgoritmaStrukturData.Pertemuan11.Tugas;
public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    String kelas;
    public Mahasiswa(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }
    public String toString() {
        return nim + "\t" + nama + "\t" + prodi + "\t" + kelas;
    }
}