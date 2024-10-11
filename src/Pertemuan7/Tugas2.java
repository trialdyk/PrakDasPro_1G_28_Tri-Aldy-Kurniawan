package Pertemuan7;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis,durasi,total = 0;

        do{
            System.out.println("Jenis Kendaraan : ");
            System.out.println("1.Mobil");
            System.out.println("2.Motor");
            System.out.println("0.Keluar");
            System.out.print("Masukkan jenis kendaraan : ");
            jenis = input.nextInt();

            if(jenis == 1 || jenis == 2){
                System.out.print("Masukkan durasi parkir : ");
                durasi = input.nextInt();

                if(durasi > 5){
                    total += 12500;
                }else if(jenis == 1){
                    total += durasi * 3000;
                }else if(jenis == 2){
                    total += durasi * 2000;
                }
            }
        }while(jenis != 0);

        System.out.println("Total Harga Parkir : "+total);
    }
}