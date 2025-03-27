package AlgoritmaStrukturData.Pertemuan6;

public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void sortingASC() { 
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() { 
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    int sequentialSearch(String nama){
        int posisi = -1;
        int dataDitemukan = 0;
        for(int j = 0; j < idx; j++){
            if(dataDosen[j].nama.equalsIgnoreCase(nama)){
                posisi = j;
                dataDitemukan++;
            }
        }
        if(dataDitemukan > 1) System.out.println("Lebih dari 1 data ditemukan, hanya mengambil data pertama!");
        return posisi;
    }

    int binarySearch(int usia, int left, int right) {
        int mid = (left + right) / 2;
        if (left > right) return -1;
        
        if (dataDosen[mid].usia == usia) {
            int l = mid, r = mid;
            while (l > left && dataDosen[l - 1].usia == usia) l--;
            while (r < right && dataDosen[r + 1].usia == usia) r++;
            if (l != r) System.out.println("Peringatan: Data ditemukan lebih dari satu!,hanya mengambil data yang pertama!");
            return mid;
        } 
        return dataDosen[mid].usia > usia ? binarySearch(usia, left, mid - 1) : binarySearch(usia, mid + 1, right);
    }
    
}
