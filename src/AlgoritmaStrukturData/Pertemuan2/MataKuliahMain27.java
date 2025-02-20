package AlgoritmaStrukturData.Pertemuan2;

public class MataKuliahMain27 {
    public static void main(String[] args) {
        MataKuliah27 mk1 = new MataKuliah27();
        mk1.nama = "Mata Kuliah 1";
        mk1.kodeMk = "MK1";
        mk1.sks = 100;
        mk1.jumlahJam = 10;

        mk1.tampilInformasi();
        mk1.ubahSKS(120);
        mk1.tampilInformasi();
        mk1.kurangiJam(5);
        mk1.tampilInformasi();

        MataKuliah27 mk2 = new MataKuliah27("MK2","Mata Kuliah 2",100,10);
        mk2.ubahSKS(120);
        mk2.tampilInformasi();
        mk2.kurangiJam(5);
        mk2.tampilInformasi();
    }
}
