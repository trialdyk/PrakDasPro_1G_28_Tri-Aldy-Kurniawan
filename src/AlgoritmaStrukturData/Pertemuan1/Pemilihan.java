package AlgoritmaStrukturData.Pertemuan1;
import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Perhitungan nilai akhir");
        System.out.println("==========================");
        System.out.print("Masukkan Nilai Tugas : ");
        double nilaiTugas = input.nextDouble();
        validasiInput(nilaiTugas);
        System.out.print("Masukkan Nilai Kuis : ");
        double nilaiKuis = input.nextDouble();
        validasiInput(nilaiKuis);
        System.out.print("Masukkan Nilai UTS : ");
        double nilaiUTS = input.nextDouble();
        validasiInput(nilaiUTS);
        System.out.print("Masukkan Nilai UAS : ");
        double nilaiUAS = input.nextDouble();
        validasiInput(nilaiUAS);
        System.out.println("==========================");

        double nilaiAkhir = ((nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3));
        String nilaiHuruf = "";

        if(nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaiHuruf = "A";
        }else if(nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
        }else if(nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
        }else if(nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
        }else if(nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
        }else if(nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "D";
        }else{
            nilaiHuruf = "E";
        }

        System.out.println("==========================");
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        System.out.println("Nilai Huruf : "+nilaiHuruf);
        System.out.println("==========================");

        if(nilaiHuruf.equals("D") || nilaiHuruf.equals("E")){
            System.out.println("Maaf Anda tidak lulus");
        }else{
            System.out.println("Selamat Anda lulus");
        }
       
    }

    public static void validasiInput(double nilai){
        if(nilai < 0 || nilai > 100){
            System.out.println("Nilai tidak valid");
            System.exit(1);
        }
    }
}
