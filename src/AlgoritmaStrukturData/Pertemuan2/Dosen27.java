package AlgoritmaStrukturData.Pertemuan2;

public class Dosen27 {
    String idDosen;
    String nama;
    boolean statusAktid;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen27(){

    }

    public Dosen27(String idDosen, String nama, boolean statusAktid, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktid = statusAktid;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi(){
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Status Aktif : " + statusAktid);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean statusAktif){
        statusAktid = statusAktif;
        System.out.println("Status Aktif Berhasil Diubah");
    }

    int hitungMasaKerja(int tahunSekarang){
        return tahunSekarang - tahunBergabung;  
    }

    void ubahKeahlian(String bidangKeahlianBaru){
        bidangKeahlian = bidangKeahlianBaru;
        System.out.println("Bidang Keahlian Berhasil Diubah");
    }
}
