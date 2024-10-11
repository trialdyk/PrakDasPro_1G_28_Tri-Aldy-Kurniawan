package Pertemuan6;
import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merek,kategori;
        int ukuran;
        int harga = 0;

        System.out.print("Inputkan Merek Sepatu : ");
        merek = input.nextLine();
        System.out.print("Inputkan Kategori : ");
        kategori = input.nextLine();
        System.out.print("Mausukkan Ukuran : ");
        ukuran = input.nextInt();

        if(ukuran < 36){
            System.out.println("Ukuran tidak valid");
            return;
        }

        if(merek.equalsIgnoreCase("converse")){
            if(kategori.equalsIgnoreCase("slip on")){
                if(ukuran <= 40){
                    harga = 800000;
                }else{
                    System.out.println("Ukuran tidak valid");
                    return;
                }
            }else if(kategori.equalsIgnoreCase("high top")){
                if(ukuran <= 44){
                    harga = 1200000;
                }else{
                    System.out.println("Ukuran tidak valid");
                    return;
                }
            }else{
                System.out.println("Kategori tidak valid");
                return;
            }
        }else if(merek.equalsIgnoreCase("Sketcher")){
            if(kategori.equalsIgnoreCase("woman")){
                if(ukuran <= 41){
                    harga = 1000000;
                }else{
                    System.out.println("Ukuran tidak valid");
                    return;
                }
            }else if(kategori.equalsIgnoreCase("man")){
                if(ukuran <= 44){
                    harga = 1800000;
                }else{
                    System.out.println("Ukuran tidak valid");
                    return;
                }
            }else{
                System.out.println("Kategori tidak valid");
                return;
            }
        }else if(merek.equalsIgnoreCase("Nike")){
            if(kategori.equalsIgnoreCase("Kids")){
                if(ukuran <= 40){
                    harga = 750000;
                }else{
                    System.out.println("Ukuran tidak valid");
                    return;
                }
            }else if(kategori.equalsIgnoreCase("Adult")){
                if(ukuran <= 44){
                    harga = 1500000;
                }else{
                    System.out.println("Ukuran tidak valid");
                    return;
                }
            }else{
                System.out.println("Kategori tidak valid");
                return;
            }
        }else {
            System.out.println("Merek Tidak Valid");
            return;
        }

        System.out.println("Harga Sepatu Yang Anda Beli : "+harga);
    }
}
