package AlgoritmaStrukturData.Pertemuan1;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T',};
        char[][] kota = {
                { 'B', 'A', 'N', 'T', 'E', 'N'},
                {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
                {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
                {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
                {'B', 'O', 'G', 'O', 'R'},
                {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
                {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
                {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
                {'M', 'A', 'L', 'A', 'N', 'G'},
                {'T', 'E', 'G', 'A', 'L'}
        };
        System.out.print("Masukkan Kode Plat : ");
        char kodePlat = input.next().charAt(0);
        int indexKota = -1;
        for (int i = 0; i < kode.length; i++) {
            if (kodePlat == kode[i]) {
                indexKota = i;
                break;
            }
        }
        if (indexKota == -1) {
            System.out.println("Kode Plat tidak valid");
            System.exit(1);
        }
        System.out.print("Kota : ");
        for (int i = 0; i < kota[indexKota].length; i++) {
            System.out.print(kota[indexKota][i]);
        }
    }
}
