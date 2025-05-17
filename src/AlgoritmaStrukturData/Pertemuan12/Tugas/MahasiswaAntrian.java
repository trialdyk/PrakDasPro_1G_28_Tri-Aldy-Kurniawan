package AlgoritmaStrukturData.Pertemuan12.Tugas;

class MahasiswaAntrian {
    String nim;
    String nama;
    String keperluan;
    public MahasiswaAntrian(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Keperluan: " + keperluan;
    }
}
