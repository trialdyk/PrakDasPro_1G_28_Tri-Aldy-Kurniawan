package Pertemuan8;
import java.util.Scanner;
public class Bonus28 {
    public static void main(String[] args) {
        Scanner aldy = new Scanner(System.in);
        String nim28;
        int n28;
        String text28 = "ABCDE";

        System.out.print("Inputkan NIM : ");
        nim28 = aldy.nextLine();

        n28 = Integer.parseInt(String.valueOf(nim28.charAt(nim28.length()-1)));
        if(n28 < 5) n28 += 5;

        for(int i = 0; i < n28; i++){
            System.out.print(text28.charAt(i % 5));
        }
    }
}
