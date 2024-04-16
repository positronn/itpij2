import edu.princeton.cs.algs4.StdOut;

public class RandomGaussian {
    public static void main(String[] args) {
        double r = Math.sin(2 * Math.PI * Math.random()) * Math.pow((-2 * Math.log(Math.random())), 0.5);
        StdOut.println(r);
    }
}
