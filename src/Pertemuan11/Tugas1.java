package Pertemuan11;

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double surveys[][] = new double[10][6];

        for(int i = 0; i < surveys.length; i++) {
            System.out.println("Responden Ke "+(i+1)+" : ");
            for(int j = 0; j < surveys[i].length; j++) {
                System.out.print("Masukkan nilai Pertanyaan ke "+(j+1)+" : ");
                surveys[i][j] = input.nextDouble();
            }
        }

        double rata2Responden[] = new double[10];
        double rata2Pertanyaan[] = new double[6];
        double rata2Seluruh = 0;

        for(int i = 0; i < surveys.length; i++) {
            for(int j = 0; j < surveys[i].length; j++) {
                rata2Responden[i] += surveys[i][j] / surveys.length;
                rata2Pertanyaan[j] += surveys[i][j] / surveys[i].length;
                rata2Seluruh += surveys[i][j] / (surveys.length * surveys[i].length);
            }
            System.out.println("Rata Rata Responden ke "+(i+1)+" = "+rata2Responden[i]);
        }

        for(int i = 0; i < rata2Pertanyaan.length; i++) {
            System.out.println("Rata Rata Pertanyaan ke "+(i+1)+" = "+rata2Pertanyaan[i]);
        }

        System.out.println("Rata Rata Seluruh = "+rata2Seluruh);
    }
}
