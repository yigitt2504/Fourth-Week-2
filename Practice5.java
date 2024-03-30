package controlstructures2;
import java.util.Scanner;

public class Practice5 {
    public static void main( String[] args ){
        /*Practice 5
        Code the program that displays the 4-point system grades of the students' grades in the letter grade system. */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a grade: ");
        String grade = scan.next();

        switch(grade){
            case "FF":
                System.out.println("0.0");
                break;
            case "FD":
                System.out.println("0.5");
                break;
            case "DD":
                System.out.println("1.0");
                break;
            case "DC":
                System.out.println("1.5");
                break;
            case "CC":
                System.out.println("2.0");
                break;
            case "CB":
                System.out.println("2.5");
                break;
            case "BB":
                System.out.println("3.0");
                break;
            case "BA":
                System.out.println("3.5");
                break;
            case "AA":
                System.out.println("4.0");
                break;
        }
        scan.close();
    }
}
