package AlgoritmaStrukturData.Pertemuan11.Tugas;
public class Antrian {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahDiprosesKRS;
    public Antrian(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
        jumlahDiprosesKRS = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == max;
    }
    public void mengosongkanAntrian() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian sudah kosong.");
        }
    }
    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian KRS sudah penuh.");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil ditambahkan ke antrian KRS.");
        }
    }
    public void panggilAntrianProsesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong, tidak ada mahasiswa untuk diproses.");
            return;
        }
        System.out.println("Memanggil mahasiswa untuk proses KRS:");
        int diprosesKaliIni = 0;
        if (!isEmpty()) {
            Mahasiswa mhs1 = data[front];
            System.out.println("1. " + mhs1.toString());
            size--;
            jumlahDiprosesKRS++;
            diprosesKaliIni++;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        if (!isEmpty() && diprosesKaliIni < 2) {
            Mahasiswa mhs2 = data[front];
            System.out.println("2. " + mhs2.toString());
            size--;
            jumlahDiprosesKRS++;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        System.out.println("Proses KRS selesai untuk panggilan ini.");
    }
    public void tampilkanSemuaAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian KRS:");
            System.out.println("No.\tNIM\tNama\tProdi\tKelas");
            int i = front;
            int count = 0;
            while(count < size) {
                System.out.println((count + 1) + ".\t" + data[i].toString());
                i = (i + 1) % max;
                count++;
            }
            System.out.println("------------------------------------");
        }
    }
    public void tampilkanDuaAntrianTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong.");
        } else {
            System.out.println("Dua Antrian Terdepan KRS:");
            System.out.println("NIM\tNama\tProdi\tKelas");
            System.out.println("1. " + data[front].toString());
            if (size > 1) {
                int nextFront = (front + 1) % max;
                System.out.println("2. " + data[nextFront].toString());
            }
            System.out.println("------------------------------------");
        }
    }
    public void tampilkanAntrianPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian KRS kosong.");
        } else {
            System.out.println("Antrian Paling Akhir KRS:");
            System.out.println("NIM\tNama\tProdi\tKelas");
            System.out.println(data[rear].toString());
            System.out.println("------------------------------------");
        }
    }
    public int getJumlahAntrian() {
        return size;
    }
    public int getJumlahSudahProsesKRS() {
        return jumlahDiprosesKRS;
    }
}
