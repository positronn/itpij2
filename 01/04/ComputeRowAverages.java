public class ComputeRowAverages {
    public static void main(String[] args)
    {

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
                a[i][j] = Math.random() * 100;
        }
        
        // compute row verages
        for (int i = 0; i < m; i++)
        {
            double sum = 0.0;
            for (int j = 0; j < n; j++)
                sum += a[i][j];
            a[i][n - 1] = sum / Double.valueOf(n - 1);
        }

        // print a two dim array in row-format:
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.printf(String.format("%7.2f", a[i][j]) + " ");
                if (j == n - 2)
                    System.out.print("|");
            }
            System.out.println();
        }
    }
}
