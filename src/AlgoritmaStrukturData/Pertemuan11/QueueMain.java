package AlgoritmaStrukturData.Pertemuan11;
import java.util.Scanner; 

public class QueueMain {

    public static void menu() { 
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: "); 
        int n = sc.nextInt(); 

        AntrianLayanan Q = new AntrianLayanan(n); 

        int pilih; 
        do { 
            menu();
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) { 
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    sc.nextLine(); 
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar !=0 ){ 
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih >= 1 && pilih <= 5); 

        System.out.println("Program selesai.");
        sc.close();
    }
}
