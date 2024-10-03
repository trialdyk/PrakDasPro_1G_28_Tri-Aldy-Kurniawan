package Pertemuan5;
import java.util.Scanner;
public class PemilihanDenganHariIf28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan nama hari: ");
        int kodeHari = input.nextInt();

       if(kodeHari >= 1 && kodeHari <= 5){

        System.out.println("Weekday");

       }else if(kodeHari == 6 || kodeHari == 7){

        System.out.println("Weekend");

       }else{

        System.out.println("Invalid");
       }
    }
}
