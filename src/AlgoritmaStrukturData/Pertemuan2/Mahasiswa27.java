package AlgoritmaStrukturData.Pertemuan2;
public class Mahasiswa27 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa27(){

    }

    public Mahasiswa27(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("Kelas : " + kelas);
    }
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }
    void ubahIPK(double ipkBaru) {
        if(ipkBaru >= 0 && ipkBaru <= 4.0){
            ipk = ipkBaru;
        }else{
            System.out.println("IPK Tidak Valid, harus antara 0.0 sampai 4.0");
        }
    }
    String nilaiKinerja(){
        if(ipk >= 3.5){
            return "Kinerja sangat baik";
        }else if(ipk >= 3.0){
            return "Kinerja baik";
        }else if(ipk >= 2){
            return "Kinerja cukup";
        }else{
            return "Kinerja kurang";
        }
    }
}
