public class ExponentialFunction {
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        double term = 1;
        double sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += term;
            term *= x/i;
        }
        System.out.println("e to " + x + ": " + sum);
    }
}
