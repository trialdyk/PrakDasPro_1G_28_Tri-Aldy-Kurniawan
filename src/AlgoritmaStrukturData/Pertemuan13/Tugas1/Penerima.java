package AlgoritmaStrukturData.Pertemuan13.Tugas1;

public class Penerima {
    int nomorAntrian;
    String nama;

    public Penerima(int nomorAntrian, String nama) {
        this.nomorAntrian = nomorAntrian;
        this.nama = nama;
    }

    public String toString() {
        return String.format("%-5d %s", nomorAntrian, nama);
    }
}