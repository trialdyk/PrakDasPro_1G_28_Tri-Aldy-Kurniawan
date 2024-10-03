package Pertemuan5;
import java.util.Scanner;
public class PemilihanHari28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String dayName, dayType;

        System.out.print("Inputkan nama hari: ");
        dayName = input.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday": 
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "Weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "Weekend";
                break;
            default:
                dayType = "Invalid";
        }

        System.out.println(dayName + " adalah " + dayType);
    }
}
