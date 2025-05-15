package LatihanSoal;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner aldy = new Scanner(System.in);

        int key = new Random().nextInt(100);

        while(true){
            System.out.print("Masukkan Angka : ");
            int angka = aldy.nextInt();
            if(angka > key){
                System.out.println("Angka terlalu besar");
            }else if(angka < key){
                System.out.println("Angka terlalu kecil");
            }else{
                System.out.println("Angka sama");
                break;
            }
            System.out.println("==================");
        }
        

        int z = 10;
        int y = 20;
        System.out.println(total(z, y));
    }


    static int total(int a, int b){ 
        return a * b; 
    }
}
