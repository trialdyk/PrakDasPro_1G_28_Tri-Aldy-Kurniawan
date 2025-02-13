package AlgoritmaStrukturData.Pertemuan1;

import java.util.Scanner;

public class Fungsi {
    public static void main(String[] args) {
        String[] bunga = {"Algonema","Keladi","Alocasia","Mawar"};

        int[][] jumlahBunga = {
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {4,5,12,4}
        };

        int harga[] = {75000,50000,60000,100000};

        tampilkanStock(jumlahBunga,bunga);
        System.out.println("===================");
        System.out.println("Total Pendapatan : "+jumlahPendapatan(jumlahBunga,harga));
    }

    public static int jumlahPendapatan(int[][] jumlahBunga, int[] harga){
        int total = 0;
        for(int i = 0; i < jumlahBunga.length; i++) {
            for(int j = 0; j < jumlahBunga[i].length; j++) {
                total += jumlahBunga[i][j] * harga[i];
            }
        }

        return total;
    }

    public static void tampilkanStock(int[][] jumlahBunga,String[] bunga){
        System.out.print("Cabang\t\t\t");
        for(int i = 0; i < bunga.length; i++) {
            System.out.print(bunga[i]+"\t");
        }
        System.out.println();
        for(int i = 0; i < jumlahBunga.length; i++) {
            System.out.print("Royal Garden "+(i+1)+"\t\t");
            for(int j = 0; j < jumlahBunga[i].length; j++) {
                System.out.print(jumlahBunga[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
}
