import java.util.Scanner;
public class PartyAffiliation
{
    public static void main(String[] args)
            //output enter your party
            // user input either D R I or other
            // output- D R I or other

    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");

        String party = input.nextLine();

        if (party.equals("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (party.equals("R"))
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if (party.equals("I"))
        {
            System.out.println("You get an Independent Person.");
        }
        else
        {
            System.out.println("You get Other.");
        }
    }
}