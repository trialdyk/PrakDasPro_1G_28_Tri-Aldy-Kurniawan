package AlgoritmaStrukturData.Pertemuan5;

public class Main {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswa = new Mahasiswa[8];

        mahasiswa[0] = new Mahasiswa("Ahmad", "220101001", 2022, 78, 82);
        mahasiswa[1] = new Mahasiswa("Budi", "220101002", 2022, 85, 88);
        mahasiswa[2] = new Mahasiswa("Cindy", "220101003", 2021, 90, 87);
        mahasiswa[3] = new Mahasiswa("Dian", "220101004", 2021, 76, 79);
        mahasiswa[4] = new Mahasiswa("Eko", "220101005", 2023, 92, 95);
        mahasiswa[5] = new Mahasiswa("Fajar", "220101006", 2020, 88, 85);
        mahasiswa[6] = new Mahasiswa("Gina", "220101007", 2023, 80, 83);
        mahasiswa[7] = new Mahasiswa("Hadi", "220101008", 2020, 82, 84);

        double nilaiTertinggiUTS = cariMaxUTS(mahasiswa, 0, mahasiswa.length - 1);
        System.out.println("Nilai UTS tertinggi: " + nilaiTertinggiUTS);

        double nilaiTerendahUTS = cariMinUTS(mahasiswa, 0, mahasiswa.length - 1);
        System.out.println("Nilai UTS terendah: " + nilaiTerendahUTS);

        double rataUAS = hitungRataUAS(mahasiswa);
        System.out.println("Rata-rata nilai UAS: " + rataUAS);
    }

    static double cariMaxUTS(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUts;
        }
        int mid = (l + r) / 2;
        double leftMax = cariMaxUTS(arr, l, mid);
        double rightMax = cariMaxUTS(arr, mid + 1, r);
        return Math.max(leftMax, rightMax);
    }

    static double cariMinUTS(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUts;
        }
        int mid = (l + r) / 2;
        double leftMin = cariMinUTS(arr, l, mid);
        double rightMin = cariMinUTS(arr, mid + 1, r);
        return Math.min(leftMin, rightMin);
    }

    static double hitungRataUAS(Mahasiswa[] arr) {
        double total = 0;
        for (Mahasiswa mhs : arr) {
            total += mhs.nilaiUas;
        }
        return total / arr.length;
    }
}
