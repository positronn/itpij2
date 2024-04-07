
public class TwoDimArrayInitialization {
    public static void main(String[] args)
    {
        int n = 5;
        int m = 5;
        // initialization of a two dim array
        double[][] a = new double[m][n];
        // the below line is equivalent to the next chunk
        // of code that initializes the values to 0.0 (just change a for b*)
        double[][] b;
        b = new double[m][n];
        for (int i = 0; i < m; i++)
        {
            // initialize the ith row
            for (int j = 0; j < n; j++)
                a[i][j] = 0.0;
        }
        
        // print a two dim array in row-format:
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.println(a[i][j] + " ");
            System.out.println();
        }

        // setting values at compile time
        int[][] c = {
            {1, 2, 3, 0},
            {2, 9, 1, 8},
            {3, 7, 2, 5},
            {6, 6, 7, 7},
            {7, 4, 4, 5},
            {9, 8, 0, 9},
            {2, 7, 5, 4},
            {0, 3, 6, 6},
            {7, 2, 2, 1},
        };
    }
}
