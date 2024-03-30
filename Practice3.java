package controlstructures2;
import java.util.Scanner;

public class Practice3 {
    public static void main( String[] args ){
        /*Practice 3
        Code the program that displays the status of a number "EVEN" or "ODD". */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        switch(number%2){
            case 0:
                System.out.println("EVEN");
                break;
            default:
                System.out.println("ODD");
                break;  
        }
        scan.close();
    }
}
