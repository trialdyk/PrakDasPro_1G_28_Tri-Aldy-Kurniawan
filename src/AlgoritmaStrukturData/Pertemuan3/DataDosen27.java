package AlgoritmaStrukturData.Pertemuan3;
public class DataDosen27 {
    public void dataSemuaDosen(Dosen27[] arrayOfDosen){
        for(int i = 0; i < arrayOfDosen.length; i++){
            System.out.println("Data Dosen Ke-" + (i + 1));
            arrayOfDosen[i].cetakInfo();
            System.out.println("------------------------------");
        }
    }
    public void jumlahDosenPerJenisKelamin(Dosen27[] arrayOfDosen){
        int jumlahDosenPria = 0;
        int jumlahDosenWanita = 0;
        for(int i = 0; i < arrayOfDosen.length; i++){
            if(arrayOfDosen[i].jenisKelamin){
                jumlahDosenPria++;
            }else{
                jumlahDosenWanita++;
            }
        }
        System.out.println("Info Jumlah Dosen : ");
        System.out.println("Jumlah Dosen Pria : " + jumlahDosenPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahDosenWanita);
    }
    public void rerataUsiaDosenPerJenisKelamin(Dosen27[] arrayOfDosen){
        int usiaDosenPria = 0;
        int usiaDosenWanita = 0;
        for(int i = 0; i < arrayOfDosen.length; i++){
            if(arrayOfDosen[i].jenisKelamin){
                usiaDosenPria += arrayOfDosen[i].usia / arrayOfDosen.length;
            }else{
                usiaDosenWanita += arrayOfDosen[i].usia / arrayOfDosen.length;
            }
        }
        System.out.println("Info Rerata Usia Dosen : ");
        System.out.println("Rata-rata Usia Dosen Pria : " + usiaDosenPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + usiaDosenWanita);
    }
    public void infoDosenPalingTua(Dosen27[] arrayOfDosen){
        int usia = arrayOfDosen[0].usia;
        String nama = arrayOfDosen[0].nama;
        for(int i = 0; i < arrayOfDosen.length; i++){
            if(arrayOfDosen[i].usia > usia){
                usia = arrayOfDosen[i].usia;
            }
        }
        System.out.println("Info Dosen Paling Tua : ");
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
    }
    public void infoDosenPalingMuda(Dosen27[] arrayOfDosen){
        int usia = arrayOfDosen[0].usia;
        String nama = arrayOfDosen[0].nama;
        for(int i = 0; i < arrayOfDosen.length; i++){
            if(arrayOfDosen[i].usia < usia){
                usia = arrayOfDosen[i].usia;
            }
        }
        System.out.println("Info Dosen Paling Muda : ");
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
    }
}
