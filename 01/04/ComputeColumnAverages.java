
public class ComputeColumnAverages {
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
        for (int j = 0; j < n; j++)
        {
            double sum = 0.0;
            for (int i = 0; i < m; i++)
                sum += a[i][j];
            a[m - 1][j] = sum / Double.valueOf(m - 1);
        }

        // print a two dim array in row-format:
        for (int i = 0; i < m; i++)
        {
            if (i == m - 1)
            {
                for (int j = 0; j < n; j++)
                    System.out.print(String.format("%8s", "______" + " "));
                System.out.println();
            }
            for (int j = 0; j < n; j++)
            {
                System.out.printf(String.format("%7.2f", a[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
