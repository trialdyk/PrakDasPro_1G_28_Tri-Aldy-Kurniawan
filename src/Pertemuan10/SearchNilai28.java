package Pertemuan10;

public class SearchNilai28 {
    public static void main(String[] args) {
        int[] arrNilai = {80,85,78,96,90,82,86};
        int key = 90;
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            if(arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println();
        System.out.println("Nilai "+key+" ditemukan di indeks ke-"+hasil);
        System.out.println();
    }
}
