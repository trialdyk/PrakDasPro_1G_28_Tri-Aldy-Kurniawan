package Pertemuan7;
import java.util.Scanner;;
public class SiakadFor28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai;
        double terendah = 0;
        double tertinggi = 100;
        
        for(int i = 1; i <= 10; i++){
            System.out.print("Masukkan Nilai Dari Mahasiswa Ke "+i+": ");
            nilai = sc.nextDouble();
            if(nilai < tertinggi){
                tertinggi = nilai;
            }
            if(nilai > terendah){
                terendah = nilai;
            }
        }

        System.out.println("Nilai Tertinggi : "+tertinggi);
        System.out.println("Nilai Terendah : "+terendah); 
    }
}
