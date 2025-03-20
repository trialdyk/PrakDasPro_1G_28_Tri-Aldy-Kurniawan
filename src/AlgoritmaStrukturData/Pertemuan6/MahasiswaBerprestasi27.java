package AlgoritmaStrukturData.Pertemuan6;

public class MahasiswaBerprestasi27 {
    Mahasiswa27[] listMhs = new Mahasiswa27[5];
    int idx;

    void tambah(Mahasiswa27 m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Mahasiswa tidak dapat ditambahkan karena penyimpanan penuh");
        }
    }

    void tampil(){
        for(Mahasiswa27 m : listMhs){
            m.tampilInformasi();
            System.out.println("---------------------");
        }
    }

    void bubbleSort(){
        for(int i = 0; i < listMhs.length - 1; i++){
            for(int j = 1; j < listMhs.length - i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa27 temp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = temp;
                }
            }
        }
    }
}
