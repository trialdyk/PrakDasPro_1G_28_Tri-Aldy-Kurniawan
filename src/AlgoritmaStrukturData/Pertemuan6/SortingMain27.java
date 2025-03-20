package AlgoritmaStrukturData.Pertemuan6;

public class SortingMain27 {
    public static void main(String[] args) {
        int a[] = {20,10,2,7,12};
        Sorting27 dataUrut1 = new Sorting27(a,a.length);
        System.out.println("Data Awal 1:");
        dataUrut1.tampilData();
        dataUrut1.bubbleSort();
        System.out.println("Data yang sudah diurutkan dengan bubble sort (ASC) :");
        dataUrut1.tampilData();
        int b[] = {30,20,2,8,14};
        Sorting27 dataUrut2 = new Sorting27(b,b.length);
        System.out.println("Data Awal 2:");
        dataUrut2.tampilData();
        dataUrut2.selectionSort();
        System.out.println("Data yang sudah diurutkan dengan selection sort (ASC) :");
        dataUrut2.tampilData();
        int c[] = {40,10,4,9,3};
        Sorting27 dataUrut3 = new Sorting27(c,c.length);
        System.out.println("Data Awal 3:");
        dataUrut3.tampilData();
        dataUrut3.insertionSort();
        System.out.println("Data yang sudah diurutkan dengan insertion sort (ASC) :");
        dataUrut3.tampilData();
    }
}
