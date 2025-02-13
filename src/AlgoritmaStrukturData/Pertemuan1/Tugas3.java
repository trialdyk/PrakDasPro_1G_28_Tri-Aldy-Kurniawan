package AlgoritmaStrukturData.Pertemuan1;

import java.util.Scanner;
public class Tugas3 {
    static Scanner input = new Scanner(System.in);
    static int jumlahMT;
    public static void main(String[] args){

        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        jumlahMT = input.nextInt();
        input.nextLine();
        String[] mataKuliah = new String[jumlahMT];
        int[] sks = new int[jumlahMT];
        String[] hariKuliah = new String[jumlahMT];
        int[] semester = new int[jumlahMT];
        System.out.println("=============================");

        for(int i = 0; i < jumlahMT; i++) {
            System.out.print("Nama Mata Kuliah "+(i+1)+" : ");
            mataKuliah[i] = input.nextLine();
            System.out.print("Jumlah SKS : ");
            sks[i] = input.nextInt();
            System.out.print("Semester : ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.print("Hari Kuliah : ");
            hariKuliah[i] = input.nextLine();
            System.out.println("=============================");
        }

        while(true){
            int pilihan = menu();
            switch (pilihan) {
                case 1:
                    tampilSemuaJadwalKuliah(mataKuliah,sks,hariKuliah,semester);
                    break;
                case 2:
                    System.out.print("Masukkan Hari : ");
                    tampilJadwalBerdasarkanHari(input.nextLine(),mataKuliah,sks,hariKuliah,semester);
                    break;
                case 3:
                    System.out.print("Masukkan Semester : ");
                    tampilJadwalBerdasarkanSemester(input.nextInt(),mataKuliah,sks,hariKuliah,semester);
                    break;
                case 4:
                    System.out.print("Masukkan Mata Kuliah : ");
                    tampilMataKuliah(input.nextLine(),mataKuliah,sks,hariKuliah,semester);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    public static int menu(){
        System.out.println("=========== Menu ==========");
        System.out.println("1. Tampilkan Seluruh Jadwal Kuliah");
        System.out.println("2. Tampilkan Jadwal Kuliah Berdasarkan Hari");
        System.out.println("3. Tampilkan Jadwal Kuliah Berdasarkan Semester");
        System.out.println("4. Mencari Mata Kuliah");
        System.out.println("5. Keluar Program");
        System.out.println("===========================");
        System.out.print("Pilih Menu : ");
        int pilihan = input.nextInt();
        input.nextLine();

        if(pilihan < 1 || pilihan > 5){
            System.out.println("Pilihan tidak valid");
            return menu();
        }

        return pilihan;
    }

    public static void tampilSemuaJadwalKuliah(String[] mataKuliah,int[] sks,String[] hariKuliah,int[] semester){
        System.out.println("Semua Jadwal Kuliah");
        System.out.println("=====================");
        for(int i = 0; i < jumlahMT; i++) {
            System.out.println((i+1)+". Mata Kuliah :"+mataKuliah[i]);
            System.out.println("- Hari : "+hariKuliah[i]);
            System.out.println("- Semester : "+semester[i]);
            System.out.println("- Sks : "+sks[i]);
        }
    }

    public static void tampilJadwalBerdasarkanHari(String hari,String[] mataKuliah,int[] sks,String[] hariKuliah,int[] semester){
        System.out.println("Jadwal Kuliah Hari : "+hari);
        System.out.println("=====================");
        for(int i = 0; i < jumlahMT; i++) {
            if(hariKuliah[i].equalsIgnoreCase(hari)){
                System.out.println((i+1)+". Mata Kuliah :"+mataKuliah[i]);
                System.out.println("- Hari : "+hariKuliah[i]);
                System.out.println("- Semester : "+semester[i]);
                System.out.println("- Sks : "+sks[i]);
            }
        }
    }

    public static void tampilJadwalBerdasarkanSemester(int semester,String[] mataKuliah,int[] sks,String[] hariKuliah,int[] semesterKuliah){
        System.out.println("Jadwal Kuliah Semester : "+semester);
        System.out.println("=====================");
        for(int i = 0; i < jumlahMT; i++) {
            if(semesterKuliah[i] == semester){
                System.out.println((i+1)+". Mata Kuliah :"+mataKuliah[i]);
                System.out.println("- Hari : "+hariKuliah[i]);
                System.out.println("- Semester : "+semesterKuliah[i]);
                System.out.println("- Sks : "+sks[i]);
            }
        }
    }

    public static void tampilMataKuliah(String mt,String[] mataKuliah,int[] sks,String[] hariKuliah,int[] semesterKuliah){
        System.out.println("Data Mata Kuliah : "+mt);
        System.out.println("=====================");
        for(int i = 0; i < jumlahMT; i++) {
            if(mataKuliah[i].equalsIgnoreCase(mt)){
                System.out.println("- Hari Kuliah : "+hariKuliah[i]);
                System.out.println("- Semester : "+semesterKuliah[i]);
                System.out.println("- Sks : "+sks[i]);
            }
        }
    }
}
