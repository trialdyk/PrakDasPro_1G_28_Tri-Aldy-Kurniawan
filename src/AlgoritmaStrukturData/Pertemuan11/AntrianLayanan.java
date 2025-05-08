package AlgoritmaStrukturData.Pertemuan11;
public class AntrianLayanan {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    public AntrianLayanan(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;     
    }
    public boolean isEmpty() { 
        if (size == 0) { 
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull() { 
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa Terdepan: ");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) { 
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Daftar Antrian Mahasiswa");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            } 
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void enqueue(Mahasiswa mhs) { 
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            System.exit(1);
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
        }
    }

    public Mahasiswa dequeue() {
        Mahasiswa mhs = null; 
        if (isEmpty()) { 
            System.out.println("Antrian masih kosong");
            System.exit(1);
        } else {
            mhs = data[front];
            size--;
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
        return mhs;
    }

    public int getJumlahAntrian() {
        return size;
    }

    public Mahasiswa antrianTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        } else {
            return data[rear];
        }
    }
}