package AlgoritmaStrukturData.Pertemuan1;
import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM Anda : ");
        long nim = input.nextLong();

        int n = (int)(nim % 100l);
        if(n < 10) n += 10;

        System.out.println("Nilai N : "+n);

        for(int i = 1; i <= n; i++){
            if(i == 6 || i == 10){
                continue;
            }

            if(i % 2 == 0){
                System.out.print(i+" ");
            }else{
                System.out.print("* ");
            }
        }
            
    }
}
