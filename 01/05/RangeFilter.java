import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class RangeFilter {
    public static void main(String[] args) {
        int lo = Integer.parseInt(args[0]);
        int hi = Integer.parseInt(args[1]);
        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            if (value >= lo && value <= hi)
                StdOut.print(value + " ");
        }
        StdOut.println();
    }
}
