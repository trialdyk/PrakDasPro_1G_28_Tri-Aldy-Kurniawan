package Pertemuan14;

public class BinaryTreeArray27 {
    Mahasiswa27[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray27() {
        this.dataMahasiswa = new Mahasiswa27[10]; 
        this.idxLast = -1; 
    }

    public void populateData(Mahasiswa27 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs; 
        this.idxLast = idxLast;
        if (dataMhs.length > this.dataMahasiswa.length) {
            this.dataMahasiswa = new Mahasiswa27[dataMhs.length];
        }
        for (int i = 0; i <= idxLast; i++) {
            if (i < dataMhs.length) {
                 this.dataMahasiswa[i] = dataMhs[i];
            } else {
                break; 
            }
        }
        for (int i = idxLast + 1; i < this.dataMahasiswa.length; i++) {
            this.dataMahasiswa[i] = null;
        }
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); 
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2); 
            }
        }
    }

    public void add(Mahasiswa27 data) {
        if (idxLast + 1 < dataMahasiswa.length) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Tree array penuh, tidak dapat menambah data.");
        }
    }
    
    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1); 
                traversePreOrder(2 * idxStart + 2); 
            }
        }
    }

    public void traversePostOrder(int idxStart) { 
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traversePostOrder(2 * idxStart + 1); 
                traversePostOrder(2 * idxStart + 2); 
                dataMahasiswa[idxStart].tampilInformasi();
            }
        }
    }
}