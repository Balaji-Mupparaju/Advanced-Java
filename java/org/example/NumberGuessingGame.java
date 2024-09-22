import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class NumberGuessingGame {
    static int count = 5;
    static int temp=count;
    static double score=100;

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(1, 100);
        System.out.println("your initial score is: "+score);
        System.out.println("No.of chances are: "+count);
        guessNumber(number);
    }

    public static void guessNumber(int number) {
        while (count >0) {
            Scanner s = new Scanner(System.in);
            System.out.println(number);
            System.out.println("Enter your number: ");
            int num = s.nextInt();
            if (num == number) {
                System.out.println("You Won");
                System.out.println("No of choices you took: "+(temp-count));
                System.out.println("your score is:"+score);
                break;
            }
            else if (num > number) {
                System.out.println("You are higher than expected!");
                System.out.println("Would you like to continue the guessing??");
                String s1 = s.next();
                if (s1.equals("yes")) {
                    count--;
                    score=score-(score*0.1);
                    guessNumber(number);
                }
                System.out.println("You have dropped. Thank you!!");
                break;
            }
            else {
                System.out.println("You are lower than expected!");
                System.out.println("Would you like to continue the guessing??");
                String s1 = s.next();
                if (s1.equals("yes")) {
                    count--;
                    score=score-(score*0.1);
                    guessNumber(number);
                }
                System.out.println("You have dropped. Thank you!!");
                break;
            }
        }
    }
}