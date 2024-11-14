package Pertemuan11;
import java.util.Scanner;
public class BioskopWithScanner28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris,kolom;
        String nama;

        String[][] penonton = new String[4][2];

        boolean running = true;
        do{

            System.out.println("======= MENU =======");
            System.out.println("1. Tambah penonton");
            System.out.println("2. Tampilkan penonton");
            System.out.println("3. Keluar");
            System.out.println("====================");
            System.out.print("Pilih Menu : ");
            String pilihan = input.nextLine();

            switch(pilihan) {
                case "1":
                    while(true){
                        System.out.print("Masukkan nama : ");
                        nama = input.nextLine();
            
                        System.out.print("Masukkan baris : ");
                        baris = input.nextInt();
            
                        System.out.print("Masukkan kolom : ");
                        kolom = input.nextInt();
                        input.nextLine();


            
                        if(baris > penonton.length || baris < 0 || kolom > penonton[0].length || kolom < 0) {
                            System.out.println("Baris atau kolom tidak tersedia");
                        }else{

                            if(penonton[baris-1][kolom-1] != null) {
                                System.out.println("Kursi sudah ditempati orang lain");
                            }else{
                                penonton[baris-1][kolom-1] = nama;
                                System.out.println("Nama "+nama+" telah disimpan pada baris "+baris+" kolom "+kolom);

                                System.out.print("Ingin input nama penonton lainnya ? (Y/N) : ");
                                String next = input.nextLine();
                    
                                if(next.equalsIgnoreCase("N")) {
                                    break;
                                }
                            }

                        }
                       
                    }
                    break;
                case "2":
                    for(int i = 0; i < penonton.length; i++) {
                        for(int j = 0; j < penonton[i].length; j++) {
                            if(penonton[i][j] == null) {
                                System.out.println("Penonton pada baris "+(i+1)+" kolom "+(j+1)+" = *****");
                            }else{

                                System.out.println("Penonton pada baris "+(i+1)+" kolom "+(j+1)+" = "+ penonton[i][j]);
                            }
                        }
                    }
                    break;
                case "3":
                    System.out.println("Terimakasih");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }while(running);

        
    }
}
