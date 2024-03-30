package controlstructures2;
import java.util.Scanner;

public class Practice9 {
    public static void main( String[] args ){
        /*Practice 9
        Code the program that finds and displays whether a character entered by the user is a "Vowel" or a "Consonant". */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char ch = scan.next().charAt(0);

        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
        scan.close();
    }
}
