package controlstructures2;
import java.util.Scanner;

public class Practice1 
{
    public static void main( String[] args )
    {
        /*Practice 1
        Code the program that determines and display the name of the weekday according to the number entered by the user.(1=Monday,...,7=Sunday) */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int weekday = scan.nextInt();

        switch(weekday){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid daynumber!");
        }
        scan.close();
    }
}
