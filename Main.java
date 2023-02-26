import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // declare players
        String A = "";
        String B = "";
        String playAgain = "";
        Scanner in = new Scanner(System.in);
        Boolean done = false;
        do
        {
            System.out.println("Player A what is your move: Rock R, Paper P, or Scissors S?");
            A = in.nextLine();
            // checks the values
            if (A == "R" || A == "P" || A == "S")
            {
                done = true;
            }
            else
            {
                System.out.println("Choose R, P, or S");
                System.out.println("What is your move?");
                A = in.nextLine();
            }
            System.out.println("Player B what is your move: Rock R, Paper, P, or Scissors S?");
            B = in.nextLine();
            if (B == "R" || A == "P" || A == "S")
            {
                done = true;
            }
            else
            {
                System.out.println("Choose R, P, or S");
                System.out.println("What is your move?");
                B = in.nextLine();
            }
            // compare the choices and determine winner
            if (A.equalsIgnoreCase("R"))
            {
                if (B.equalsIgnoreCase("R"))
                {
                    System.out.println("It's a tie!");
                }
                else if (B.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper beats rock! Player B wins!");
                }
                else
                {
                    System.out.println("Rock beats scissors! Player A wins!");
                }
            }
            else if (A.equalsIgnoreCase("P"))
            {
                if (B.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper beats rock! Player A wins!");
                }
                else if (B.equalsIgnoreCase("P"))
                {
                    System.out.println("It's a tie!");
                }
                else
                {
                    System.out.println("Scissors beats paper! Player B wins!");
                }
            }
            else
            {
                if (B.equalsIgnoreCase("R"))
                {
                    System.out.println("It's a tie!");
                }
                else if (B.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper beats rock! Player B wins!");
                }
                else
                {
                    System.out.println("Rock beats scissors! Player A wins!");
                }
            }
            // asks if they want to play again
            System.out.println("Do you want to play again? Y/N");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("Y"))
            {
                done = false;
            }
            else
            {
                done = true;
            }
        } while (!done);






    }
}