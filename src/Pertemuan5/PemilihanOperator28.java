package Pertemuan5;
import java.util.Scanner;

public class PemilihanOperator28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angka1,angka2,hasil = 0;
        char operator;

        System.out.print("Masukkan Angka Pertama: ");
        angka1 = input.nextDouble();
        System.out.print("Masukkan Angka Kedua: ");
        angka2 = input.nextDouble();
        System.out.print("Pilih Operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        if(operator == '+') {            
            hasil = angka1 + angka2;
        } else if(operator == '-') {
            hasil = angka1 - angka2;
        } else if(operator == '*') {
            hasil = angka1 * angka2;
        } else if(operator == '/') {
            hasil = angka1 / angka2;
        } else {
            System.out.println("Operator tidak valid");
        }

        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);

    }
}
