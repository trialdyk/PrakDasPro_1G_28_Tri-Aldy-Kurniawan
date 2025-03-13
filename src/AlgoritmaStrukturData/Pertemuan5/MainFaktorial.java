package AlgoritmaStrukturData.Pertemuan5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int n = input.nextInt();
        Faktorial faktorial = new Faktorial();

        System.out.println("Nilai Faktorial "+n+" Dengan Metode BF : " + faktorial.faktorialBF(n));
        System.out.println("Nilai Faktorial "+n+" Dengan Metode DC : " + faktorial.faktorialDC(n));
    }
}
