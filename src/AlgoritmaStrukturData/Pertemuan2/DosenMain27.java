package AlgoritmaStrukturData.Pertemuan2;

public class DosenMain27 {
    public static void main(String[] args) {
        Dosen27 ds1 = new Dosen27();
        ds1.nama = "Dosen 1";
        ds1.idDosen = "D1";
        ds1.tahunBergabung = 2020;
        ds1.bidangKeahlian = "Fisika";
        ds1.statusAktid = true;

        ds1.tampilInformasi();
        ds1.setStatusAktif(false);
        ds1.tampilInformasi();
        ds1.ubahKeahlian("ITS");
        ds1.tampilInformasi();
        System.out.println("Masa Kerja : " + ds1.hitungMasaKerja(2025));

        Dosen27 ds2 = new Dosen27("D2","Dosen 2",true,2021,"IT");
        ds2.setStatusAktif(false);
        ds2.tampilInformasi();
        ds2.ubahKeahlian("Hukum");        
        ds2.tampilInformasi();
        System.out.println("Masa Kerja : " + ds2.hitungMasaKerja(2025));
    }
}
