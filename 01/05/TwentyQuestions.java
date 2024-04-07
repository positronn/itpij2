import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TwentyQuestions {
    public static void main(String[] args) {
        int secret = 1 + (int) (Math.random() * 100000);
        StdOut.print("I'm thinking of a number ");
        StdOut.println("Between 1 and 1,000, 000");
        int guess = 0;
        while (guess != secret) {
            StdOut.print("What's your guess? ");
            guess = StdIn.readInt();
            if (guess == secret)
                StdOut.println("You win!");
            if (guess < secret)
                StdOut.println("Too low ");
            if (guess > secret)
                StdOut.println("Too high");
        }
    }
}
