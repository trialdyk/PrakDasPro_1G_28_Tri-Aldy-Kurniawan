package AlgoritmaStrukturData.Pertemuan4;
public class Biskop {
    public String nama;
    public String alamat;
    public int luas;
    public int jumlahKursi;
    public Biskop(String nama, String alamat, int luas, int jumlahKursi){
        this.nama = nama;
        this.alamat = alamat;
        this.luas = luas;
        this.jumlahKursi = jumlahKursi;
    }
    public void tampilInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Luas : " + luas + " m2");
        System.out.println("Jumlah Kursi : " + jumlahKursi);
    }
    public void kurangiKursi(int jumlahKursi){
        if(jumlahKursi > this.jumlahKursi){
            System.out.println("Gagal Mengurangi Kursi");
            return;
        }
        this.jumlahKursi -= jumlahKursi;
        System.out.println("Jumlah Kursi Saat Ini : " + this.jumlahKursi);
    }
    public void tambahKursi(int jumlahKursi){
        this.jumlahKursi += jumlahKursi;
        System.out.println("Jumlah Kursi Saat Ini : " + this.jumlahKursi);
    }
}
