package AlgoritmaStrukturData.Pertemuan4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Bioskop : ");
        int n = input.nextInt();
        input.nextLine();
        Biskop[] bioskops = new Biskop[n];
        for(int i = 0; i < n; i++){
            System.out.println("=======Bioskop ke-" + (i + 1) + "=========");
            System.out.print("Masukkan Nama Bioskop : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Alamat Bioskop : ");
            String alamat = input.nextLine();
            System.out.print("Masukkan Luas Bioskop (m2): ");
            int luas = input.nextInt();
            System.out.print("Masukkan Jumlah Kursi Bioskop : ");
            int jumlahKursi = input.nextInt();
            input.nextLine();
            bioskops[i] = new Biskop(nama, alamat, luas, jumlahKursi);
        }
        while(true){
            System.out.println("=======Menu Biskop=======");
            System.out.println("1. Tampil Info Bioskop");
            System.out.println("2. Kurangi Kursi Bioskop");
            System.out.println("3. Tambah Kursi Bioskop");
            System.out.println("4. Keluar");
            System.out.print("Pilihan : ");
            int pilihan = input.nextInt();
            input.nextLine();
            int index = 0;
            int jumlahKursi = 0;
            switch(pilihan){
                case 1:
                    for(int i = 0; i < n; i++){
                        System.out.println("==== Bioskop "+(i+1)+" ====");
                        bioskops[i].tampilInfo();
                    }
                    break;
                case 2:
                    System.out.print("Bioskop keberapa yang ingin dikurangi ? : ");
                    index = input.nextInt();
                    input.nextLine();
                    if(index > n || index < 1){
                        System.out.println("Bioskop tidak ditemukan");
                        break;
                    }
                    System.out.print("Masukkan Jumlah Kursi : ");
                    jumlahKursi = input.nextInt();
                    input.nextLine();
                    bioskops[index - 1].kurangiKursi(jumlahKursi);
                    break;
                case 3:
                    System.out.print("Bioskop keberapa yang ingin dikurangi ? : ");
                    index = input.nextInt();
                    input.nextLine();
                    if(index > n || index < 1){
                        System.out.println("Bioskop tidak ditemukan");
                        break;
                    }
                    System.out.print("Masukkan Jumlah Kursi : ");
                    jumlahKursi = input.nextInt();
                    input.nextLine();
                    bioskops[index - 1].kurangiKursi(jumlahKursi);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }
        }
    }
}
