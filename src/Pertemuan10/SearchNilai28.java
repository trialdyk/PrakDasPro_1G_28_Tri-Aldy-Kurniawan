package Pertemuan10;

import java.util.Scanner;
public class SearchNilai28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int[] arrNilai = new int[input.nextInt()];
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+": ");
            arrNilai[i] = input.nextInt();
        }

        System.out.print("Masukkan Nilai Yang Dicari : ");
        int key = input.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if(arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }

        if(hasil == -1) {
            System.out.println("Nilai "+key+" Tidak Ketemu!");
            return;
        }else{
            System.out.println("Nilai "+key+" Ketemu!, adalah Mahasiswa Ke-"+(hasil+1));
        }

       
    }
}
