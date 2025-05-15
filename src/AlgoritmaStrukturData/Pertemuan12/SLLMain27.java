package AlgoritmaStrukturData.Pertemuan12;

import java.util.Scanner;

public class SLLMain27 {

    public static Mahasiswa27 inputMahasiswa(Scanner scanner, int nomorMahasiswa) {
        System.out.println("\nMasukkan data Mahasiswa ke-" + nomorMahasiswa + ":");
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Kelas: ");
        String kelas = scanner.nextLine();
        System.out.print("IPK: ");
        double ipk = scanner.nextDouble();
        scanner.nextLine();

        return new Mahasiswa27(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SingleLinkedList27 ssl = new SingleLinkedList27();

        System.out.println("Memasukkan data untuk 4 Mahasiswa:");

        Mahasiswa27 mahasiswa1 = inputMahasiswa(scanner, 1);
        Mahasiswa27 mahasiswa2 = inputMahasiswa(scanner, 2);
        Mahasiswa27 mahasiswa3 = inputMahasiswa(scanner, 3);
        Mahasiswa27 mahasiswa4 = inputMahasiswa(scanner, 4);

        ssl.print();
        ssl.addFirst(mahasiswa4);
        ssl.print();

        ssl.addLast(mahasiswa1);
        ssl.print();
        ssl.insertAfter(mahasiswa4.nama, mahasiswa3);
        ssl.print();
        ssl.insertAt(2, mahasiswa2);
        ssl.print();
        scanner.close();

        System.out.println("Data Index 1 : ");
        ssl.getData(1);

        System.out.println(" Data Mahasiswa yang bernama Bimon Berada Pada Index : "+ssl.indexOf("Bimon"));
        System.out.println();

        ssl.removeFirst();
        ssl.removeLast();
        ssl.print();
        ssl.removeAt(0);
        ssl.print();
    }
}