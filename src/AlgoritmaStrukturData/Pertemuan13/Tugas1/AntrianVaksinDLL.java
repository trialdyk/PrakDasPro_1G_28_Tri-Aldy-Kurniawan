package AlgoritmaStrukturData.Pertemuan13.Tugas1;
public class AntrianVaksinDLL {
    NodeAntrian head;
    NodeAntrian tail;
    int size;
    public AntrianVaksinDLL() {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void tambahAntrian(Penerima penerima) {
        NodeAntrian newNode = new NodeAntrian(null, penerima, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        System.out.println(penerima.nama + " berhasil ditambahkan ke antrian.");
    }
    public Penerima hapusData() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong, tidak dapat menghapus data.");
        }
        Penerima penerimaDihapus = head.data;
        
        System.out.println(penerimaDihapus.nama + " telah selesai divaksinasi.");
        
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return penerimaDihapus;
    }
    public void cetakAntrian() {
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("    Daftar Pengantri Vaksin   ");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("No.  Nama");
        if (!isEmpty()) {
            NodeAntrian tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data.toString());
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Kosong");
        }
        System.out.println("Sisa Antrian: " + size);
        System.out.println("------------------------------");
    }
    public int getSize() {
        return size;
    }
}