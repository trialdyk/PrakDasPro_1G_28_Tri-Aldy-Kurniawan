package AlgoritmaStrukturData.Pertemuan6;
public class Sorting27 {
    int[] data;
    int jumlahData;
    public Sorting27(int[] data,int jumlahData) {
        this.data = data;
        this.jumlahData = jumlahData;
    }
    void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < jumlahData -1; i++) {
            for (int j = 1; j < jumlahData - i; j++) {
                if (data[j-1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }
    void tampilData() {
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
