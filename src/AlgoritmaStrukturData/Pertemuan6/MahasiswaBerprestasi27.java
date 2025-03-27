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

    void selectionSort(){
        int minimum = 0;
        for(int i = 0; i < listMhs.length; i++){
            minimum = i;
            for(int j = i + 1; j < listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[minimum].ipk){
                    minimum = j;
                }
            }
            Mahasiswa27 temp = listMhs[i];
            listMhs[i] = listMhs[minimum];
            listMhs[minimum] = temp;
        }
    }

    void insertionSort(){
        for(int i = 1; i < listMhs.length; i++){
            Mahasiswa27 temp = listMhs[i];
            int j = i - 1;
            while(j >= 0 && listMhs[j].ipk < temp.ipk){
                listMhs[j + 1] = listMhs[j];
                j--;
            }
            listMhs[j + 1] = temp;
        }
    }

    int sequentialSearch(double cari){
        int posisi = -1;
        for(int j = 0; j < listMhs.length; j++){
            if(listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x,int pos){
        if(pos != -1){
            System.out.println("Data Mahasiswa Dengan IPK : " + x + " Ditemukan Pada Index : " + pos);
        }else{
            System.out.println("Data Mahasiswa Dengan IPK : " + x + " Tidak Ditemukan");
        }
    }

    void tampilDataSearch(double x,int pos){
        if(pos != -1){
            listMhs[pos].tampilInformasi();
        }else{
            System.out.println("Data Mahasiswa Dengan IPK : " + x + " Tidak Ditemukan");
        }
    }
}
