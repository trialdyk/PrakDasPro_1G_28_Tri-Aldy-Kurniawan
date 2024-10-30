package Pertemuan9;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Ukuran Persegi : ");
        int n = input.nextInt();

        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=n ; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print(" "+n+"");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
