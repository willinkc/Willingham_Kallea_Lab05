import java.util.Scanner;
public class TheaterKiosk
{
    //output ask user age
    //if user is 21+ they get wrist band
    //if not nothing happens
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        if (age >= 21)
        {
            System.out.println("You get a paper wrist band.");
        }
    }
}