import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args) {

        // output ask  user for their birth month
        // If the birth month is between 1 and 12
        // output the birth month
        // if else display an error message

        Scanner in = new Scanner(System.in);

        int birthMonth;

        System.out.println("Enter your birth month as an integer:");
        birthMonth = in.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}