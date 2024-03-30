package controlstructures2;
import java.util.Scanner;

public class Practice4 {
    public static void main( String[] args ){
        /*Practice 4
        Code the program that displays the letter grades of the students' grades in the 4-point system. */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a grade: ");
        double grade = scan.nextDouble();

        switch((int)grade*10){
            case 40:
                System.out.println("AA");
                break;
            case 35:
                System.out.println("BA");
                break;
            case 30:
                System.out.println("BB");
                break;
            case 25:
                System.out.println("CB");
                break;
            case 20:
                System.out.println("CC");
                break;
            case 15:
                System.out.println("DC");
                break;
            case 10:
                System.out.println("DD");
                break;
            case 5:
                System.out.println("FD");
                break;
            case 0:
                System.out.println("FF");
        }
        scan.close();
    }
}
