package controlstructures2;
import java.util.Scanner;

public class Practice6 {
    public static void main( String[] args ){
        /*Practice 6
        Code the program that determines and display whether the day number entered by the user is a weekday or weekend. (1,2,3,4,5=Weekday; 6,7=Weekend) */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a day number: ");
        int daynumber = scan.nextInt();

        switch(daynumber){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
        }
        scan.close();
    }
}
