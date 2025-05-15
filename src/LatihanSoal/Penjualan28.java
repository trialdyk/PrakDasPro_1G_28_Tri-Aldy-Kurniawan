package LatihanSoal;

import java.util.Scanner;
public class Penjualan28 {
    public static void main(String[] args) {
        Scanner aldy = new Scanner(System.in);


        char header28 = 'A';
        String menu28[] = {"Mie Goreng","Nasi Goreng","Es Teler","Es Teh Manis","Kentang Goreng"};
        int data28[][] = {
            {29,30,29,28},
            {40,30,30,25},
            {30,29,28,27},
            {30,30,30,30},
            {29,29,28,27},
        };

        int harga28[] = {
            2500,
            3000,
            2000,
            1000,
            1500
        };
        int dataProfit28[] = new int[4];
        
        do{   
            System.out.println("Menu : ");
            System.out.println("1. Tampilkan Daftar Penjualan");
            System.out.println("2. Tampilkan Untung Tiap Cabang");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu : ");
            int pilihan = aldy.nextInt();

            if(pilihan == 1){
                System.out.print("\t\t");
                for(int i = 0;i < data28[0].length;i++){
                    System.out.print("Cabang "+header28+"\t");
                    header28++;
                }
                header28 = 'A';
                System.out.println();

                for(int i = 0; i < data28.length; i++){
                    System.out.print(menu28[i]+"\t");
                    for(int j = 0; j < data28[i].length;j++){
                        System.out.print(data28[i][j]+"\t\t");
                    }
                    System.out.println();
                }
            }else if(pilihan == 2){
                System.out.print("\t\t");
                for(int i = 0;i < data28[0].length;i++){
                    System.out.print("Cabang "+header28+"\t");
                    header28++;
                }
                header28 = 'A';
                System.out.println();

                for(int i = 0; i < data28.length; i++){
                    System.out.print(menu28[i]+"\t");
                    for(int j = 0; j < data28[i].length;j++){
                        int profit28 = data28[i][j] * harga28[i];
                        
                        dataProfit28[j] += profit28;
                        System.out.print(profit28+"\t\t");
                        
                    }
                    System.out.println();
                }

                for(int i = 0;i < data28[0].length;i++){
                    System.out.println("Cabang "+header28+"\t : "+dataProfit28[i]);
                    header28++;
                }

            }else if(pilihan == 3){
                System.out.println("Program Berakhir");
                break;
            }
            else{
                System.out.println("Pilihan Tidak Tersedia");
            }

        }while(true);
    }
}
