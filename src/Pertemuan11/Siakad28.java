package Pertemuan11;
import java.util.Scanner;
public class Siakad28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] nilai = new int[4][3];

        for(int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke "+(i+1)+" : ");
            double totalPerMahasiswa = 0;
            for(int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai ke "+(i+1)+"-"+(j+1)+" : ");
                nilai[i][j] = input.nextInt();
                totalPerMahasiswa += nilai[i][j];
            }

            System.out.println(" Rata rata : "+totalPerMahasiswa/ 3);
        }

        System.out.println("================");
        System.out.println("Nilai rata rata per matkul");


        for(int i = 0; i < nilai[0].length; i++) {
            double totalPerMatkul = 0;
            for(int j = 0; j < nilai.length; j++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Matkul ke "+(i+1)+" : "+totalPerMatkul / 4);
        }
    }
}
