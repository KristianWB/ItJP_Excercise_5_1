import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        int score = 1;



        while (score != -1)   {
            System.out.print("Please enter your score: ");
            score = input.nextInt();
            if (score >= 60)
                System.out.println(
                        "Congratulations, you passed the test!!! NOW BUGGER OFF KID!!!");
            else
                System.out.println(
                        "Sorry kid, no cigar today!!!");

        }
    }
}
