public class Sin {
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        double sin_x = 0;
        double term = 1;
        double sign = 1;
        
        for (int i = 1; i <=n; i++) {
            term *= x / i;
            if (i % 2 == 1)
            {
                sin_x += sign * term;
                sign *= -1;
            }
        }
        System.out.println(sin_x);
    }
}

