package Pertemuan5;
import java.util.Scanner;

public class PemilihanSwitch28 {
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

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                hasil = angka1 / angka2;
                break;
        }

        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);

    }
}
