package Pertemuan11;

public class Bioskop28 {
    public static void main(String[] args) {
        
        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bela";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Hana";


        for(int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris "+i+" = "+ String.join(", ", penonton[i]));
        }


        System.out.println(penonton.length);
        

        for (String[] strings : penonton) {
            System.out.println("Panjang Baris : "+strings.length);
        }

        System.out.println("Penonton pada baris ke 3");

        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }

        for(String string : penonton[2]) {
            System.out.println(string);
        }
    }
}
