package AlgoritmaStrukturData.Pertemuan1;

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahMT;
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        jumlahMT = input.nextInt();
        input.nextLine();

        String[] mataKuliah = new String[jumlahMT];
        double[] nilaiMataKuliah = new double[jumlahMT];
        String[] nilaiHuruf = new String[jumlahMT];
        double[] bobotNilai = new double[jumlahMT];
        double ip = 0;

        System.out.println("=============================");
        System.out.println("Inputkan Nama Mata Kuliah : ");
        for(int i = 0; i < jumlahMT; i++) {
            System.out.print("Mata Kuliah "+(i+1)+" : ");
            mataKuliah[i] = input.nextLine();
        }
        System.out.println("=============================");

        System.out.println("Inputkan Nilai Mata Kuliah : ");
        for(int i = 0; i < jumlahMT; i++) {
            System.out.print("Nilai Mata Kuliah "+mataKuliah[i]+" : ");
            nilaiMataKuliah[i] = input.nextDouble();

            if(nilaiMataKuliah[i] > 80 && nilaiMataKuliah[i] <= 100){
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            }else if(nilaiMataKuliah[i] > 73 && nilaiMataKuliah[i] <= 80){
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            }else if(nilaiMataKuliah[i] > 65 && nilaiMataKuliah[i] <= 73){
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            }else if(nilaiMataKuliah[i] > 60 && nilaiMataKuliah[i] <= 65){
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            }else if(nilaiMataKuliah[i] > 50 && nilaiMataKuliah[i] <= 60){
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            }else if(nilaiMataKuliah[i] > 39 && nilaiMataKuliah[i] <= 50){
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            }else{
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }
        System.out.println("=============================");
        for(int i = 0; i < jumlahMT; i++){
            ip += bobotNilai[i] / jumlahMT;
        }

        System.out.println("Hasil Konversi Nilai");
        System.out.println("Mata Kuliah\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        for(int i = 0; i < jumlahMT; i++) {
            System.out.println(mataKuliah[i]+"\t\t\t\t"+nilaiMataKuliah[i]+"\t\t"+nilaiHuruf[i]+"\t\t"+bobotNilai[i]);
        }
        System.out.println("=============================");
        System.out.println("IP : "+ip);
    }
}
