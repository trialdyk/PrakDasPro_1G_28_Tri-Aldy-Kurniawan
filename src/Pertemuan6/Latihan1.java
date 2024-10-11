package Pertemuan6;
import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil1,bil2,bil3,max;

        System.out.print("Masukkan bilangan satu : ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan dua : ");
        bil2 = input.nextInt();
        System.out.print("Masukkan bilangan tiga : ");
        bil3 = input.nextInt();

        max = bil3;

        if(bil1 > max){
            max = bil1;
        }
        
        if(bil2 > max){
            max = bil2;
        }

        System.out.println("Bilangan Terbesar adalah : "+max);
    }
}
