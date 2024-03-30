package controlstructures2;
import java.util.Scanner;

public class Practice7 {
    public static void main( String[] args ){
        /*Practice 7
        Code the program that displays the names of the clothing size codes. (S=Small, M=Medium, L=Large, X=XLarge) */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a clothing size code: ");
        String CSC = scan.next();

        switch(CSC){
            case "S":
                System.out.println("Small");
                break;
            case "M":
                System.out.println("Medium");
                break;
            case "L":
                System.out.println("Large");
                break;
            case "X":
                System.out.println("XLarge");
                break;
        }
        scan.close();
    }
}
