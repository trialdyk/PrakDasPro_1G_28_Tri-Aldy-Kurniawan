package AlgoritmaStrukturData.Pertemuan3;

public class Dosen27 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin;
    public int usia;

    public Dosen27() {}
    public Dosen27(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    public void cetakInfo(){
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        if(jenisKelamin){
            System.out.println("Jenis Kelamin: Cewek");
        }else{
            System.out.println("Jenis Kelamin: Cowok");
        }

        System.out.println("Usia           : " + usia);
    }
}
