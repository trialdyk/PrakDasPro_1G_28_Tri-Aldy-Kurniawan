package AlgoritmaStrukturData.Pertemuan10;

public class Surat27 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; 
    int durasi; 

    public Surat27() {
    }

    public Surat27(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) { 
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public String toString() {
        return "ID Surat: " + idSurat +
               "\nNama Mahasiswa: " + namaMahasiswa +
               "\nKelas: " + kelas +
               "\nJenis Izin: " + (jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain") +
               "\nDurasi: " + durasi + " hari";
    }
}
