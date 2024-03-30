package controlstructures2;
import java.util.Scanner;

public class Practice8 {
    public static void main( String[] args ){
        /*Practice 8
        Code the program that displays the names of the clothing size codes. (S=Small, M=Medium, L=Large, X1=XLarge, X2=XXLarge, X3=XXXLarge, X4=XXXXLarge) */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a clothing size code: ");
        String CSC = input.next();

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
            case "X1":
                System.out.println("XLarge");
                break;
            case "X2":
                System.out.println("XXLarge");
                break;
            case "X3":
                System.out.println("XXXLarge");
                break;
            case "X4":
                System.out.println("XXXXLarge");
                break;
        }
        input.close();
    }
}
