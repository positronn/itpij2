import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ArrayArgs {
    public static void main(String[] args) {
    }

    public static double max(double[] a) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static double dot(double[] a, double[] b) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }

    public static void exchange(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void print(double[] a) {
        StdOut.println(a.length);
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }

    public static double[][] readDouble2D() {
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = StdIn.readDouble();
            }
        }
        return a;
    }
}
