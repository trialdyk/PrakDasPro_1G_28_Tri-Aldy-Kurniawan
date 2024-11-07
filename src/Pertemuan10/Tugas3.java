package Pertemuan10;

import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng","Mie Goreng","Roti Bakar","Kentang Goreng","Teh Tarik","Cappucino","Chocolate Ice"};
        int hasil = -1;

        System.out.println("======= MENU =======");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i+1+". "+menu[i]);
        }
        System.out.println("====================");
        System.out.print("Pilih Menu : ");
        String pilihan = input.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (pilihan.equalsIgnoreCase(menu[i])) {
                hasil = i;
                break;
            }
        }

        if(hasil != -1) {
            System.out.println("Anda memilih "+menu[hasil]);
        } else {
            System.out.println("Pilihan Anda tidak tersedia");
        }
    }
}
