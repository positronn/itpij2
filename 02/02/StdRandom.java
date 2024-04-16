import edu.princeton.cs.algs4.StdOut;

public class StdRandom {
    public static int uniform(int n) {
        return (int) (Math.random() * n);
    }

    public static double uniform(double lo, double hi) {
        return lo + Math.random() * (hi - lo);
    }

    public static boolean bernoulli(double p) {
        return Math.random() < p;
    }

    public static double gaussian() {
        double r = Math.sin(2 * Math.PI * Math.random()) * Math.pow((-2 * Math.log(Math.random())), 0.5);
        return r;
    }

    public static double gaussian(double mu, double sigma) {
        return mu + sigma * gaussian();
    }

    public static int discrete(double[] probabilities) {
        double r = (double) (Math.random());
        double sum = 0.0;
        for (int i = 0; i < probabilities.length; i++) {
            sum += probabilities[i];
            if (r < sum)
                { return i; }
        }
        return probabilities.length - 1;
    }

    public static void shuffle(double[] a) {
        for (int i = 0; i < a.length; i++) {
            int r = i + (int) (Math.random() * (a.length - i));
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
        return;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] probabilities = { 0.5, 0.3, 0.1, 0.1 };
        for (int i = 0; i < n; i++) {
            StdOut.printf(" %2d " , uniform(100));
            StdOut.printf("%8.5f ", uniform(10.0, 99.0));
            StdOut.printf("%5b "  , bernoulli(0.5));
            StdOut.printf("%7.5f ", gaussian(9.0, 0.2));
            StdOut.printf("%2d "  , discrete(probabilities));
            StdOut.println();
        }
    }
}
