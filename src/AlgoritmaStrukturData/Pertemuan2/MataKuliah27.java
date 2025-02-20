package AlgoritmaStrukturData.Pertemuan2;

public class MataKuliah27 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah27(){

    }

    public MataKuliah27(String kodeMk, String nama, int sks, int jumlahJam){
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi(){
        System.out.println("Kode : " + kodeMk);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS Berhasil dirubah ke " + sksBaru);
    }

    void tambahJam(int jam){
        jumlahJam += jam;
        System.out.println("Jumlah Jam Saat Ini : " + jumlahJam);
    }

    void kurangiJam(int jam){
        if(jumlahJam < jam){
            System.out.println("Tidak bisa mengurangi jam");
            return;
        }else{
            jumlahJam -= jam;
            System.out.println("Berhasil,Jumlah Jam Saat Ini : " + jumlahJam);
        }
    }
    
}
