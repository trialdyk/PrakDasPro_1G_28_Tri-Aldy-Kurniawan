package AlgoritmaStrukturData.Pertemuan10;
public class StackSurat27 {
    Surat27[] stack;
    int size;
    int top;
    public StackSurat27(int size) {
        this.size = size;
        stack = new Surat27[size];
        top = -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(Surat27 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
            System.out.println("Surat izin dari " + srt.namaMahasiswa + " berhasil diterima.");
        } else {
            System.out.println("Stack surat penuh! Tidak bisa menambahkan surat lagi.");
        }
    }
    public Surat27 pop() {
        if (!isEmpty()) {
            Surat27 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack surat kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat27 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack surat kosong! Tidak ada surat yang dapat dilihat.");
            return null;
        }
    }

    public Surat27 findSuratByNama(String namaMahasiswa) {
        if (isEmpty()) {
            System.out.println("Stack surat kosong.");
            return null;
        }
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return stack[i];
            }
        }
        System.out.println("Surat izin atas nama " + namaMahasiswa + " tidak ditemukan.");
        return null;
    }

    public void printAllSurat() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat izin dalam tumpukan.");
            return;
        }
        System.out.println("\nDaftar Semua Surat Izin (Terbaru ke Terlama):");
        for (int i = top; i >= 0; i--) {
            System.out.println("---------------------------");
            System.out.println(stack[i].toString());
            System.out.println("---------------------------");
        }
    }
}
