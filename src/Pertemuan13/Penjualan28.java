package Pertemuan13;

import java.util.Scanner;
public class Penjualan28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Menu : ");
        String menu[] = new String[input.nextInt()];
        System.out.print("Masukkan Jumlah Hari : ");
        int jumlahHari = input.nextInt();

        System.out.println("Masukkan Nama Nama Menu : ");
        for(int i = 0; i < menu.length; i++) {
            System.out.print("Menu "+(i+1)+" : ");
            menu[i] = input.next();
        }

        int dataPenjualan[][] = new int[menu.length][jumlahHari];

        while(true){
            System.out.println("======= Menu ========");
            System.out.println("1. Edit Data Penjualan");
            System.out.println("2. Tampilkan Data Penjualan");
            System.out.println("3. Tampilkan Menu Dengan Penjualan Tertinggi");
            System.out.println("4. Tampilkan Rata Rata Penjualan");
            System.out.println("5. Keluar");
            System.out.println("=====================");
            System.out.print("Pilih Menu : ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    editPenjualan(menu,dataPenjualan);
                    break;
                case 2:
                    tampilPenjualan(jumlahHari,menu,dataPenjualan);
                    break;
                case 3:
                    tampilPenjualanTertinggi(jumlahHari,menu,dataPenjualan);
                    break;
                case 4:
                    tampilRataRataPenjualan(jumlahHari,menu,dataPenjualan);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
        
    }

    public static void editPenjualan(String[] menu,int[][] dataPenjualan){
        Scanner input = new Scanner(System.in);

        System.out.println("Menu : ");
        for(int i = 0; i < menu.length; i++) {
            System.out.println((i+1)+"."+menu[i]+"\t");
        }
        System.out.println("===================");
        System.out.print("Masukkan No Menu : ");
        int editMenu = input.nextInt();
        System.out.print("Masukkan Hari ke : ");
        int jumlahHari = input.nextInt();
        System.out.print("Masukkan Data Penjualan : ");
        dataPenjualan[editMenu-1][jumlahHari-1] = input.nextInt();

    }

    public static void tampilPenjualan(int jumlahHari,String[] menu,int[][] dataPenjualan){
        System.out.println("========Data Penjualan========");
        
        System.out.print("Menu\t\t");
        for (int i = 1; i <= jumlahHari; i++) {
            System.out.print("Hari Ke-"+(i)+"\t");
        }
        System.out.println();

        for(int i = 0; i < dataPenjualan.length; i++) {


            System.out.print(menu[i]+"\t\t");

            for(int j = 0; j < dataPenjualan[i].length; j++) {
                System.out.print(dataPenjualan[i][j]+"\t\t");
            }
            System.out.println();
        }
    }

    public static void tampilPenjualanTertinggi(int jumlahHari,String[] menu,int[][] dataPenjualan){
        int jumlahPenjualan[] = new int[menu.length];
        for(int i = 0; i < jumlahPenjualan.length; i++) {
            jumlahPenjualan[i] = 0;
        }

        for(int i = 0; i < dataPenjualan.length; i++) {
            for(int j = 0; j < dataPenjualan[i].length; j++) {
                jumlahPenjualan[i] += dataPenjualan[i][j];
            }
        }
        int jumlahPenjualanTertinggi = jumlahPenjualan[0];
        String menuTertinggi = "";
        for(int i = 0; i < jumlahPenjualan.length; i++) {
            if(jumlahPenjualan[i] > jumlahPenjualanTertinggi) {
                jumlahPenjualanTertinggi = jumlahPenjualan[i];
                menuTertinggi = menu[i];
            }
        }

        System.out.println("Menu Dengan Penjualan Tertinggi : "+menuTertinggi);
    }

    public static void tampilRataRataPenjualan(int jumlahHari, String[] menu, int[][] dataPenjualan) {
        double rataRata[] = new double[jumlahHari];
        
        System.out.println("Rata Rata Penjualan : ");
        for(int i = 0; i < dataPenjualan.length; i++) {
            for(int j = 0; j < dataPenjualan[i].length; j++) {
                rataRata[i] += dataPenjualan[i][j] / jumlahHari;
            }
            System.out.println("Menu : "+menu[i]+"\t : "+rataRata[i]);
        }
    }
}
