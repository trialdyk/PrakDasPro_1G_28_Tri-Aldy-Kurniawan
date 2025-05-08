package AlgoritmaStrukturData.Pertemuan10;
public class StackTugasMahasiswa27 {
    Mahasiswa27[] stack;
    int size;
    int top;

    public StackTugasMahasiswa27(int size) {
        this.size = size;
        stack = new Mahasiswa27[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa27 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa27 pop() {
        if (!isEmpty()) {
            Mahasiswa27 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa27 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa27 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public int countTasks() {
        return top + 1; 
    }

    public String konversiDesimalKeBiner(int nilai) { 
        StackKonversi27 stackKonversi = new StackKonversi27(); 
        while (nilai > 0) { 
            int sisa = nilai % 2;
            stackKonversi.push(sisa);
            nilai = nilai / 2;
        }
    
        String biner = ""; 
        while (!stackKonversi.isEmpty()) { 
            biner += stackKonversi.pop();
        }
        return biner.isEmpty() ? "0" : biner;
    }
}