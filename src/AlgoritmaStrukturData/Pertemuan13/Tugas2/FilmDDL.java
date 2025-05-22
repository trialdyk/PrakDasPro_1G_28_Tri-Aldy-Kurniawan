package AlgoritmaStrukturData.Pertemuan13.Tugas2;
public class FilmDDL {
    NodeFilm head;
    int size;
    public FilmDDL() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public int getListSize() {
        return size;
    }
    public void addFirst(Film item) {
        NodeFilm newNode = new NodeFilm(null, item, head);
        if (isEmpty()) {
            head = newNode;
        } else {
            head.prev = newNode;
            head = newNode;
        }
        size++;
        System.out.println("Film \"" + item.judul + "\" berhasil ditambahkan di awal.");
    }
    public void addLast(Film item) {
        NodeFilm newNode = new NodeFilm(null, item, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            NodeFilm current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
        System.out.println("Film \"" + item.judul + "\" berhasil ditambahkan di akhir.");
    }
    public void add(Film item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        }
         else {
            NodeFilm current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            NodeFilm newNode = new NodeFilm(current.prev, item, current);
            if (current.prev != null) {
                 current.prev.next = newNode;
            } else {
                head = newNode;
            }
            current.prev = newNode;
            size++;
            System.out.println("Film \"" + item.judul + "\" berhasil ditambahkan pada indeks ke-" + index + ".");
        }
    }
    public Film removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("List film masih kosong, tidak dapat menghapus.");
        }
        Film data = head.data;
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Film \"" + data.judul + "\" berhasil dihapus dari awal.");
        return data;
    }
    public Film removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("List film masih kosong, tidak dapat menghapus.");
        }
        Film data;
        if (head.next == null) {
            data = head.data;
            head = null;
        } else {
            NodeFilm current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            data = current.next.data;
            current.next = null;
        }
        size--;
        System.out.println("Film \"" + data.judul + "\" berhasil dihapus dari akhir.");
        return data;
    }
    public Film remove(int index) throws Exception {
        if (isEmpty() || index < 0 || index >= size) {
            throw new Exception("Nilai indeks di luar batas atau list kosong.");
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            NodeFilm current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Film data = current.data;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            System.out.println("Film \"" + data.judul + "\" pada indeks ke-" + index + " berhasil dihapus.");
            return data;
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
            return;
        }
        System.out.println("\nCetak Data Film:");
        NodeFilm current = head;
        while (current != null) {
            System.out.println("--------------------");
            System.out.println(current.data.toString());
            current = current.next;
        }
        System.out.println("--------------------");
        System.out.println("Jumlah film: " + size);
    }
    public void searchByID(int idCari) {
        if (isEmpty()) {
            System.out.println("Daftar film kosong. Tidak dapat mencari.");
            return;
        }
        NodeFilm current = head;
        int index = 0;
        boolean ditemukan = false;
        while (current != null) {
            if (current.data.id == idCari) {
                System.out.println("Data ID Film: " + idCari + " berada di node ke-" + (index + 1));
                System.out.println("IDENTITAS:");
                System.out.println(current.data.toString());
                ditemukan = true;
                break;
            }
            current = current.next;
            index++;
        }
        if (!ditemukan) {
            System.out.println("Film dengan ID " + idCari + " tidak ditemukan.");
        }
    }
    public void sortByRatingDesc() {
        if (isEmpty() || size < 2) {
            System.out.println("Tidak ada cukup data untuk diurutkan atau list kosong.");
            return;
        }
        boolean ditukar;
        NodeFilm ptr1;
        NodeFilm lptr = null;

        do {
            ditukar = false;
            ptr1 = head;

            while (ptr1.next != lptr) {
                if (ptr1.data.rating < ptr1.next.data.rating) {
                    Film temp = ptr1.data;
                    ptr1.data = ptr1.next.data;
                    ptr1.next.data = temp;
                    ditukar = true;
                }
                ptr1 = ptr1.next;
            }
            lptr = ptr1;
        } while (ditukar);
        System.out.println("Data film berhasil diurutkan berdasarkan Rating Film (DESC).");
    }
}
