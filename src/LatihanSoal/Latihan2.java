package LatihanSoal;
import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner aldy = new Scanner(System.in);


        System.out.print("Masukkan Berat Badan (kg) : ");
        double beratBadan = aldy.nextInt();
        System.out.print("Masukkan Tinggi Badan (cm) : ");
        double tinggiBadan = aldy.nextInt();
        
        double imt = beratBadan / ( (tinggiBadan / 100) * (tinggiBadan / 100) );

        System.out.println("IMT Anda : "+imt);
        if(imt > 27){
            System.out.println("Berat Badan ini Obesitas");
        }else if(imt > 25){
            System.out.println("Berat Badan ini Gemuk");
        }else if(imt > 18.5){
            System.out.println("Berat Badan ini Normal");
        }else if(imt > 17){
            System.out.println("Berat Badan ini Kurus");
        }else{
            System.out.println("Berat Badan ini Sangat Kurus");
        }
    }
}
